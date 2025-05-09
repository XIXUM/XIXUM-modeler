package org.xixum.nlx.dictionary.grammar.bool

import org.xixum.nlx.dictionary.grammar.bool.BoolOp
import org.xixum.neo4j.driver.entities.interfaces.INode

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