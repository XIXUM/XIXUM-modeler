package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.neo4j.driver.entities.interfaces.INode
import org.neo4j.driver.types.Relationship

interface IPredicateOF {
	
	def INode of(INode caller, Relationship relation)
}