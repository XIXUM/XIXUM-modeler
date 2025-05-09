package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.neo4j.driver.entities.interfaces.INode
import org.neo4j.driver.types.Relationship

interface IPredicateGET_NAME {
	
	def INode getName(INode caller, Relationship relation)
}