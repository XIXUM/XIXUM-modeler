package org.xixum.nlx.dictionary.grammar.bool

import org.xixum.neo4j.driver.entities.interfaces.INode

abstract class BoolOp {
	
	def boolean isTrue(INode node)
	
	def INode returnFinal(INode node)
	
	def INode returnIntermediate(INode node)
}