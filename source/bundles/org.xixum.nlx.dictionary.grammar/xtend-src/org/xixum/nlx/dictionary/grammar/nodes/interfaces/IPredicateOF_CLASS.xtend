/**
 * (c) felixschaller.com 2022
 */

package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.neo4j.driver.v1.types.Relationship
import org.xixum.nlx.ai.semantics.INode

/**
 * @author Felix Schaller
 */
interface IPredicateOF_CLASS {

	def INode ofClass(INode caller, Relationship relation)

}