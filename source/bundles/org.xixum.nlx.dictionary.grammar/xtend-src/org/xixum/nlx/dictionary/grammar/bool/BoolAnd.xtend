package org.xixum.nlx.dictionary.grammar.bool

import org.xixum.nlx.dictionary.grammar.bool.BoolOp
import org.xixum.nlx.ai.semantics.INode

class BoolAnd extends BoolOp {
	
	override isTrue(INode node) {
		return node === null
	}
	
	override returnFinal(INode node) {
		node
	}
	
	override returnIntermediate(INode node) {
		null
	}
	
}