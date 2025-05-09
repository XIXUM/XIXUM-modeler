package org.xixum.nlx.ai

import org.xixum.nlx.ai.semantics.INode
import org.neo4j.driver.v1.types.Node

interface INodeFactory {
	
	def INode create(Node node, IParserDriver driver)

}
