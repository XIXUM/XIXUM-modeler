package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.neo4j.driver.entities.interfaces.INode
import org.neo4j.driver.types.Relationship

interface IPredicateGET {
	
	def INode get(INode caller, Relationship relation)	

}