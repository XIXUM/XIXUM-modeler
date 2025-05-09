package org.xixum.neo4j.driver.entities.interfaces;

import java.util.List;
import org.eclipse.xtext.builder.debug.IBuildLogger;
import org.neo4j.driver.Record;
import org.neo4j.driver.types.Node;
import org.xixum.neo4j.driver.IDbAccess;
import org.xixum.neo4j.driver.factory.IContextFactory;
import org.xixum.neo4j.driver.factory.INodeFactory;
import org.xixum.neo4j.driver.factory.IPredicateFactory;

@SuppressWarnings("all")
public interface IParserDriver {
  IDbAccess getDbAccessor();

  IPredicateFactory getPredicateFactory();

  void setDbAccessor(final IDbAccess access);

  void setPredicateFactory(final IPredicateFactory factory);

  void setNodeFactory(final INodeFactory factory);

  INodeFactory getNodeFactory();

  void setContextFactory(final INodeFactory factory);

  IContextFactory getContextFactory();

  IContextNode newContext();

  void setContext(final IContextNode node);

  IContextNode getContext();

  IBuildLogger getLogger();

  INode getNodeById(final Node node);

  List<Record> listConnections(final Node source, final String type);

  IParserDriver newCache();
}
