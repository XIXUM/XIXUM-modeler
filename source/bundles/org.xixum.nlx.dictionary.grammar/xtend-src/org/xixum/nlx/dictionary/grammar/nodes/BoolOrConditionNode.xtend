package org.xixum.nlx.dictionary.grammar.nodes

import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.bool.BoolOr
import java.util.List
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Node

class BoolOrConditionNode extends ConditionNode {

	val static BoolOr boolOr = new BoolOr()
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}
	
	override INode solve() {
		// TODO consider a wrapper function with pre and post solves

		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		//Temporary
		var result = doExecuteTypes(connections, boolOr)
		
		if (result instanceof IDictNode) // type safety
			return result
		else
			return null
		
	}
	
}