/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */
package org.xixum.neo4j.driver.factory;

import org.neo4j.driver.internal.value.RelationshipValue;
import org.xixum.neo4j.driver.entities.interfaces.INode;
import org.xixum.neo4j.driver.entities.interfaces.IPredicate;

@SuppressWarnings("all")
public interface IPredicateFactory {
  IPredicate create(final RelationshipValue value, final INode nodeStart, final INode nodeEnd);
}
