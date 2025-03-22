package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.constants.Neo4jConstants._NAME
import static org.xixum.nlx.dictionary.constants.PredicateConstants.OF_CLASS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.TARGET_

import org.xixum.nlx.ai.IParserDriver
import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateEQUALS
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import org.xixum.nlx.dictionary.grammar.bool.BoolOr
import java.util.List
import org.neo4j.driver.v1.Record
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateTARGET

class WordToken extends AbstractDictRuleObj implements IDictNode, IPredicateEQUALS, IPredicateTARGET {
	
	val static BoolOr boolOr = new BoolOr()
	
	protected INode wordClass = null //consider to replace by wordClass object
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}
	
	def String getWord(){
		var Object obj = getAttribute(_NAME)
		if (obj instanceof String) return obj
		null
	}
	
	override solve() {
		
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		//currently can only interprete _OF_CLASS
		if (wordClass === null)
			wordClass = doExecuteType(OF_CLASS_, boolOr, predicates.get(OF_CLASS_)  )
		// TODO consider a wrapper function with pre and post solves
		//doesn't solve anything else yet
		//this
		null
	}
	
	override equals(INode caller) {
		var contextS = caller.getAttribute(_TOKEN) as IGrammarItem
		if (contextS === null)
			return null 
		
		var name = contextS.name
		if (!name.equalsIgnoreCase(this.word))
			return solve()
		this	
	}
	
	override INode target(INode caller){
		var result = equals(caller)
		if (result !== null)
			driver.context.setAttribute(TARGET_, result)
		result
	}
	
}
