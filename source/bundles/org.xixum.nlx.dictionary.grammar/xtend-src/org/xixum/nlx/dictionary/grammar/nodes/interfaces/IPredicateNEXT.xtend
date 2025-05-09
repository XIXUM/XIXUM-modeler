/**
 * (c) felixschaller.com
 * @author felix schaller
 */
package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.neo4j.driver.entities.interfaces.INode

/**
 * interface for predicate capability NEXT
 */
interface IPredicateNEXT {
	
	def INode next(INode caller)

}