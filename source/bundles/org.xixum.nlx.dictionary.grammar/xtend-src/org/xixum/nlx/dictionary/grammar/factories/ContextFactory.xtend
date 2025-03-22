package org.xixum.nlx.dictionary.grammar.factories

import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.dictionary.grammar.nodes.ContextNode
import org.xixum.nlx.ai.IContextFactory

class ContextFactory implements IContextFactory {
	
	override create(IParserDriver driver) {
		new ContextNode(driver)
	}
	
}