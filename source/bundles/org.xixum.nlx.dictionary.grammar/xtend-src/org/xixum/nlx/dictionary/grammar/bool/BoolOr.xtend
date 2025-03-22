package org.xixum.nlx.dictionary.grammar.bool

import org.xixum.nlx.dictionary.grammar.bool.BoolOp
import org.xixum.nlx.ai.semantics.INode

class BoolOr extends BoolOp {
	
	override isTrue(INode node) {
		return node !== null
	}
	
	override returnFinal(INode node) {
		null
	}
	
	override returnIntermediate(INode node) {
		node
	}
}