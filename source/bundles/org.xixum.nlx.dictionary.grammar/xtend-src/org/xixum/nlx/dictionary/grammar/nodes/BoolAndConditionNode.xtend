package org.xixum.nlx.dictionary.grammar.nodes

import org.xixum.nlx.dictionary.grammar.bool.BoolAnd
import java.util.List
import org.neo4j.driver.Record
import org.neo4j.driver.types.Node
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.neo4j.driver.entities.interfaces.INode

class BoolAndConditionNode extends ConditionNode {
	
	val static BoolAnd boolAnd = new BoolAnd()

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
		var result = doExecuteTypes(connections, boolAnd)
		
		if (result instanceof IDictNode) // type safety
			return result
		else
			return null
		
	}
	
}