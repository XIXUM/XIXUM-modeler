package org.xixum.nlx.dictionary.type.elements

import org.neo4j.driver.types.Relationship

interface IRelationshipEL extends INetworkEL {
	
	def INodeEL getStart()
	
	def INodeEL getEnd()
	
	def Relationship getRelationship()
	
	def Boolean relink(NodeEL el)
	
}