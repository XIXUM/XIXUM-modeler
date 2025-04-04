package org.xixum.nlx.dictionary.grammar.factories

import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.neo4j.driver.factory.IContextFactory
import org.xixum.nlx.dictionary.grammar.nodes.ContextNode

class ContextFactory implements IContextFactory {
	
	override create(IParserDriver driver) {
		new ContextNode(driver)
	}
	
}