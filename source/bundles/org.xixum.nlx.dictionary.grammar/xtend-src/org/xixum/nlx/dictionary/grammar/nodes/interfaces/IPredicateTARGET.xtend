package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.neo4j.driver.entities.interfaces.INode

interface IPredicateTARGET {
	def INode target(INode caller)
}