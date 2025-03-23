package org.xixum.neo4j.driver.factory

import org.neo4j.driver.types.Node
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.neo4j.driver.entities.interfaces.INode

interface INodeFactory {
	
	def INode create(Node node, IParserDriver driver)

}
