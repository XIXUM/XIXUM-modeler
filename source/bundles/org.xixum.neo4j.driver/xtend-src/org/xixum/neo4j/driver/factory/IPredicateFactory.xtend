/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.neo4j.driver.factory

import org.xixum.neo4j.driver.entities.interfaces.IPredicate
import org.xixum.neo4j.driver.entities.interfaces.INode
import org.neo4j.driver.internal.value.RelationshipValue;

interface IPredicateFactory {
	
	def IPredicate create(RelationshipValue value, INode nodeStart, INode nodeEnd)
	
}
