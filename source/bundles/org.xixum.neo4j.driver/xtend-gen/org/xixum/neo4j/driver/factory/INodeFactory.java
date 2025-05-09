package org.xixum.neo4j.driver.factory;

import org.neo4j.driver.types.Node;
import org.xixum.neo4j.driver.entities.interfaces.INode;
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver;

@SuppressWarnings("all")
public interface INodeFactory {
  INode create(final Node node, final IParserDriver driver);
}
