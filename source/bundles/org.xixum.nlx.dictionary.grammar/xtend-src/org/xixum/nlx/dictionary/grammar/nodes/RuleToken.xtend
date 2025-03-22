package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.dictionary.constants.PredicateConstants.EQUALS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.EXTENDS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.NEXT_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.PREVIOUS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.RESULT_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.TARGET_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.AS_
import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.constants.Neo4jConstants._NODE

import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.bool.BoolOr
import java.util.List
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicatePREVIOUS
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateENTER_RULE
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateEXTENDS
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateGET
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateNEXT
import org.neo4j.driver.v1.types.Relationship
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateLINK_TO
import java.util.Set
import java.util.Collection

class RuleToken extends AbstractPredicatedNodeObj implements IRuleNode, ITokenNode, IPredicateNEXT, IPredicatePREVIOUS, IPredicateENTER_RULE, IPredicateEXTENDS, IPredicateGET, IPredicateLINK_TO {
	
	val static BoolOr boolOr = new BoolOr()

	protected val functionalTypes = #[EXTENDS_, EQUALS_, TARGET_]
	protected val directionalTypes = #[NEXT_, PREVIOUS_]
	//protected val List<String> finalTypes = (#[TARGET_] + directionalTypes).toList 	

	new(Node node, IParserDriver driver) {
		super(node, driver)
	}

	override INode solve() {
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		var INode result = setAttribute(RESULT_, doExecuteTypes(functionalTypes, boolOr)) as INode
		if (result !== null) { 
			if (negativeFilter !==null && negativeFilter.stream().anyMatch([el | directionalTypes.contains(el)]))
				return result
			if (directionalTypes.containsAny(predicates.keySet))
				return doExecuteTypes(directionalTypes,boolOr)	//TODO: 07.11.22 maybe add order of execution attribute
			else 
				return result
		}  
		return null //setAttribute(TARGET_, doExecuteType(TARGET_, boolOr, predicates.get(TARGET_))) as INode	
	}
	
	def boolean containsAny(Collection<? extends Object> coll, Collection<? extends Object> coll2){
		coll.stream().anyMatch(el | coll2.contains(el)) 	
	}
	
	override next(INode caller) {	
		var Function1<INode, Object> preSolve = [ e |
				var next = ((e as INode).getAttribute(_TOKEN) as IGrammarItem).successor as IGrammarItem
				(e as INode).driver.context.setAttribute(NEXT_, next)
				next
			]
		
		
		wrappedWalker(caller, preSolve, null, null)
	}
	
	override previous(INode caller) {	
		val Function1<INode, Object> preSolve = [ e |
				var pre = ((e as INode).getAttribute(_TOKEN) as IGrammarItem).precessor as IGrammarItem
				(e as INode).driver.context.setAttribute(PREVIOUS_, pre)
			]

		wrappedWalker(caller, preSolve, null, null)
	}
	
	override enterRule(INode caller) {
		var Function1<INode, Object> preSolve = [ e | null ]
		switch(caller) {
			ImplRuleNode:{
				preSolve = [ e | 
					(e as INode).getAttribute(_TOKEN) as IGrammarItem
				]
			}
		}
		wrappedWalker(caller, preSolve, null, null)		
	}
	
	override Extends(INode caller) {
		var Function1<INode, Object> preSolve = [ e | null ]
		var String filter = null
		switch (caller){
			RuleToken:{
				preSolve = [ e | (e as INode).getAttribute(_TOKEN)  as IGrammarItem]
				filter = '''«FOR type: directionalTypes SEPARATOR ', '»!«type»«ENDFOR»'''				
			}	
		}
		wrappedWalker(caller, preSolve, null, filter)
	}
	
	override get(INode caller, Relationship relation) {
		var target = getAttribute(TARGET_) as INode
		var value = getAttribute(RESULT_) as INode
		if (target !== null)
			caller.setAttribute(relation.type.toLowerCase, value)
		if (value !== null)
			caller.setAttribute(relation.type.toLowerCase, value)
		null //do not solve
	}
	
	override INode linkTo(INode caller, Relationship relation, (String)=>INode delegate)  {
		//TODO: 19.10.22 nodeEnd is unhandled, could describe the context link instanceto -> pronoun (action w.o. source and target neccesary)
		var String type = relation.get(AS_).asString().toLowerCase // TODO: null safe check
		return delegate.apply(type)
	}
	
}	

