package org.xixum.neo4j.driver.factory;

import org.xixum.neo4j.driver.entities.interfaces.IContextNode;
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver;

@SuppressWarnings("all")
public interface IContextFactory {
  IContextNode create(final IParserDriver driver);
}
