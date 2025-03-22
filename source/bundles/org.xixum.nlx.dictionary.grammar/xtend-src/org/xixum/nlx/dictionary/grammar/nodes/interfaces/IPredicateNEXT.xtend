/**
 * (c) felixschaller.com
 * @author felix schaller
 */
package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.nlx.ai.semantics.INode

/**
 * interface for predicate capability NEXT
 */
interface IPredicateNEXT {
	
	def INode next(INode caller)

}