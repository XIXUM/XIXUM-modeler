package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.neo4j.driver.entities.interfaces.INode

interface IPredicateENDS_WITH {
	
	def INode endsWith(INode caller)
	
}