package org.xixum.nlx.dictionary.grammar.bool

import org.xixum.nlx.ai.semantics.INode

abstract class BoolOp {
	def boolean isTrue(INode node)
	
	def INode returnFinal(INode node)
	
	def INode returnIntermediate(INode node)
}