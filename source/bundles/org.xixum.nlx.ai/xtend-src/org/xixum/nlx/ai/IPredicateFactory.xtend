/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.nlx.ai

import org.neo4j.driver.internal.value.RelationshipValue
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.ai.semantics.IPredicate

interface IPredicateFactory {
	
	def IPredicate create(RelationshipValue value, INode nodeStart, INode nodeEnd)
	
}