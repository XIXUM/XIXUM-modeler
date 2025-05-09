package org.xixum.nlx.dictionary.grammar.factories

import org.neo4j.driver.types.Node
import org.xixum.nlx.dictionary.grammar.nodes.TerminalNode

import static org.xixum.nlx.dictionary.constants.DictionaryConstants._AT
import static org.xixum.neo4j.driver.constants.Neo4jConstants._TARGET
import org.xixum.neo4j.driver.factory.INodeFactory
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.neo4j.driver.util.NodeUtil

class InterpunctionFactory implements INodeFactory{
	
	override create(Node node, IParserDriver driver) {
		
		var records = NodeUtil.listConnections(driver.dbAccessor, node, _AT)
		var position = NodeUtil.recordsToNode(records, _TARGET).get(0)
		
		return new TerminalNode(node, position, driver)

	}
	
}