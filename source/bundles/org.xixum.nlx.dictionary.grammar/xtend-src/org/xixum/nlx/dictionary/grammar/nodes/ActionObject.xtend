package org.xixum.nlx.dictionary.grammar.nodes

import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.bool.BoolOr
import java.util.List
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Node

import static org.xixum.nlx.constants.Neo4jConstants._NAME
import static org.xixum.nlx.constants.Neo4jConstants._NODE
import static org.xixum.nlx.constants.Neo4jConstants._TARGET
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_NAME_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.WITH_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.OF_
import static org.xixum.nlx.dictionary.constants.NodeConstants._ATTR_NAME
import static org.xixum.nlx.dictionary.constants.NodeConstants._QUERY
import static org.xixum.nlx.dictionary.constants.NodeConstants._SHORT_OF
import static org.xixum.nlx.dictionary.constants.NodeConstants._TYPE
import static org.xixum.nlx.dictionary.constants.NodeConstants._WORD

import org.xixum.nlx.dictionary.grammar.nodes.AbstractActionPredicatedNodeObj
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateOF
import org.neo4j.driver.v1.types.Relationship
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateFIND

class ActionObject extends AbstractActionPredicatedNodeObj implements IObjectNode, IPredicateOF, IPredicateFIND {
	
	val static BoolOr boolOr = new BoolOr()
	protected val List<String> objectTypes = #[OF_, GET_NAME_]
	//TODO: check type safety: protected val HasMap<String> objectTypes = #{OF_ -> INode.class, GET_NAME_ -> String.class}
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}
	
	override solve() {
		// TODO consider a wrapper function with pre and post solves
		
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		doExecuteTypes(objectTypes, boolOr)
		if (getAttribute(_TYPE).equals(_SHORT_OF)) 	{			//TODO: better use predicate relation feature to distinguish object type
			// query short version of word
			for (attributes : objectTypes){
				if (getAttribute(attributes) === null) return null // typecheck gate 
			} 
			var INode ofType = getAttribute(OF_) as INode
			var suffixLength = (getAttribute(GET_NAME_) as String).length()
			 
			var result = 
'''MATCH («_TARGET»:Word)-[]->(«ofType.getLabel()»{«_NAME» : "«ofType.getAttribute(_ATTR_NAME) as String»"}) 
WHERE «_TARGET».«_NAME» = substring(«_NODE».«_NAME», 0,size(«_NODE».«_NAME»)-«suffixLength»)'''
			setAttribute(_QUERY, result)
			null 
		}
	}
	
	override of(INode caller, Relationship relation) {
		caller.setAttribute(relation.type.toLowerCase, this)
		null
	}
	
	override find(INode caller, Relationship relation) {
		switch (caller){ 
			IActionNode:{
				var wordNode = caller.getAttribute(WITH_) as INode
				if (wordNode === null)
					return null
				solve()
				var generated = getAttribute(_QUERY) as String
				if (generated !== null && !generated.isEmpty()) {
					var query = '''MATCH («_NODE»:«_WORD» {«_NAME»:"«(wordNode as WordToken).word»"})
«                                »«getAttribute(_QUERY)»
«								 »return «_TARGET»'''
								
					setAttribute(WITH_, executeQuery(query, driver)) as INode
					//TODO: semantic unclear how to treat the result of Action Object found: where to store result
				}
			}	
		}
	}
	
}
