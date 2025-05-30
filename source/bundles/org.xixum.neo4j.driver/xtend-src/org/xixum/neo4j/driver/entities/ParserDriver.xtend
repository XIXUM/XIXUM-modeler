package org.xixum.neo4j.driver.entities

import java.util.HashMap
import org.eclipse.xtext.builder.debug.IBuildLogger
import org.neo4j.driver.types.Node

import static org.xixum.neo4j.driver.constants.Neo4jConstants._LINK
import static org.xixum.neo4j.driver.constants.Neo4jConstants._NODE
import static org.xixum.neo4j.driver.constants.Neo4jConstants._TARGET
import org.xixum.neo4j.driver.factory.INodeFactory
import org.xixum.neo4j.driver.factory.IContextFactory
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.neo4j.driver.entities.interfaces.IContextNode
import org.xixum.neo4j.driver.entities.interfaces.INode
import org.xixum.neo4j.driver.IDbAccess
import org.xixum.neo4j.driver.factory.IPredicateFactory
import org.xixum.neo4j.driver.Neo4jAccess.Action

class ParserDriver implements IParserDriver {
	
	IDbAccess dbAccess
	IPredicateFactory predicateFactory
	INodeFactory nodeFactory
	IContextFactory contextFactory
	IBuildLogger logger
	IContextNode innerContext
	HashMap<Long, INode> nodeCache
	
	new(IDbAccess access, INodeFactory factory, IPredicateFactory factory2, IContextFactory factory3, IBuildLogger logger) {
		dbAccess = access
		nodeFactory = factory
		predicateFactory = factory2
		contextFactory = factory3
		nodeCache = newHashMap
		innerContext = newContext
		this.logger = logger  //TODO replace with injected Class
	}
	
	override getDbAccessor() {
		dbAccess
	}
	
	override setDbAccessor(IDbAccess access) {
		dbAccess = access
	}
	
	override setPredicateFactory(IPredicateFactory factory) {
		predicateFactory = factory
	}
	
	override getPredicateFactory() {
		predicateFactory
	}
	
	override setNodeFactory(INodeFactory factory) {
		nodeFactory = factory
	}
	
	override getNodeFactory() {
		nodeFactory
	}
	
	override setContextFactory(INodeFactory factory) {
		contextFactory = factory
	}
	
	override getContextFactory() {
		contextFactory
	}
	
	override getLogger() {
		logger
	}
	
	override newContext(){
		contextFactory.create(this)
	}
	
	override INode getNodeById(Node node){
		if (node === null)
			return null
		var long id = node.id
			if (!nodeCache.containsKey(id)){
				var INode result = nodeFactory.create(node, this)
				if (result !== null) {
					nodeCache.put(id,result)
					return result	
				}
			} else {
				return nodeCache.get(id)
			}
	}	
	
	override listConnections(Node source, String type) {
		val query = '''MATCH («_NODE»)-[«_LINK»:«type»]-(«_TARGET»)
WHERE ID(«_NODE») = «source.id»
RETURN «_LINK», «_TARGET»'''
		dbAccessor.runCodeRecords(query, Action.READ)
	}
	
	
	override newCache() {
		var ParserDriver returnDriver = new ParserDriver(dbAccess, nodeFactory, predicateFactory, contextFactory, logger)
		returnDriver.nodeCache = newHashMap
		returnDriver.context = returnDriver.newContext()
		return returnDriver
	}
	
	override setContext(IContextNode node) {
		innerContext = node
	}
	
	override getContext(){
		innerContext
	}
	
//	protected def setNodeCache(HashMap<Long, INode> map) {
//		nodeCache = map
//	}
			
}
