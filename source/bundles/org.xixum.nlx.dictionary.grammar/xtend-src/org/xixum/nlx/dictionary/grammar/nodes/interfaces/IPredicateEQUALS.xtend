/**
 * (c) felixschaller.com
 * @author felix schaller
 */
package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.xixum.neo4j.driver.entities.interfaces.INode

interface IPredicateEQUALS {

	def INode equals(INode caller)

}