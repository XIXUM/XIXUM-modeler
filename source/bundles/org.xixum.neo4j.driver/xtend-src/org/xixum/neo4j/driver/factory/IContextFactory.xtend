package org.xixum.neo4j.driver.factory

import org.xixum.neo4j.driver.entities.interfaces.IContextNode
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver

interface IContextFactory {
	
	def IContextNode create(IParserDriver driver)
	
}
