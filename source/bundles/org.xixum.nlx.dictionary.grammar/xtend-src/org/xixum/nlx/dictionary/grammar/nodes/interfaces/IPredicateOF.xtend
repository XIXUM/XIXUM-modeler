package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.nlx.ai.semantics.INode
import org.neo4j.driver.v1.types.Relationship

interface IPredicateOF {
	
	def INode of(INode caller, Relationship relation)
}