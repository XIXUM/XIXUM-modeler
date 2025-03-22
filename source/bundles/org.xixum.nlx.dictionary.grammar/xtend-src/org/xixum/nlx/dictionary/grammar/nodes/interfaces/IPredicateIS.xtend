package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem

interface IPredicateIS {
	def INode is(INode caller) 
}