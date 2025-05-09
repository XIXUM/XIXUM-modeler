package org.xixum.neo4j.driver.entities.interfaces

import org.eclipse.xtext.builder.debug.IBuildLogger
import org.neo4j.driver.types.Node
import org.neo4j.driver.Record
import java.util.List
import org.xixum.neo4j.driver.factory.INodeFactory
import org.xixum.neo4j.driver.factory.IContextFactory
import org.xixum.neo4j.driver.factory.IPredicateFactory
import org.xixum.neo4j.driver.IDbAccess

interface IParserDriver {
	
	def IDbAccess getDbAccessor()
	
	def IPredicateFactory getPredicateFactory()
	
	def void setDbAccessor(IDbAccess access)
	
	def void setPredicateFactory(IPredicateFactory factory)
	
	def void setNodeFactory(INodeFactory factory)
	
	def INodeFactory getNodeFactory()
	
	def void setContextFactory(INodeFactory factory)
	
	def IContextFactory getContextFactory()
	
	def IContextNode newContext()
	
	def void setContext(IContextNode node) 
	
	def IContextNode getContext()
	
	def IBuildLogger getLogger()
	
	def INode getNodeById(Node node)
	
	def List<Record> listConnections(Node source, String type)
	
	def IParserDriver newCache()
	
}
