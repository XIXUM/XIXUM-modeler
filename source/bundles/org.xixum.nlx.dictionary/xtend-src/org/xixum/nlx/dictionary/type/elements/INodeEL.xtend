package org.xixum.nlx.dictionary.type.elements

import org.xixum.neo4j.driver.constants.Direction
import java.util.List
import org.neo4j.driver.types.Node

interface INodeEL extends INetworkEL {
	
	def Node getNode()	
	
	def boolean addRel(IRelationshipEL rel)
	
	def boolean addAllRels(List<IRelationshipEL> relationships)
	
	def List<IRelationshipEL> getRelationship(Direction set)
}