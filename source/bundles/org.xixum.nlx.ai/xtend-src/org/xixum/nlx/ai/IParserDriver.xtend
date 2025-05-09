package org.xixum.nlx.ai

import org.xixum.nlx.ai.semantics.INode
import org.eclipse.xtext.builder.debug.IBuildLogger
import org.neo4j.driver.v1.types.Node
import org.neo4j.driver.v1.Record
import java.util.List
import org.xixum.nlx.ai.semantics.IContextNode

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
