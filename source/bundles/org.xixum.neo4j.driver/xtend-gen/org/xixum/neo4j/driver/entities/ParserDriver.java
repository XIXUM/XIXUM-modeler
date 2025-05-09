package org.xixum.neo4j.driver.entities;

import java.util.HashMap;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.builder.debug.IBuildLogger;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.neo4j.driver.Record;
import org.neo4j.driver.types.Node;
import org.xixum.neo4j.driver.IDbAccess;
import org.xixum.neo4j.driver.Neo4jAccess;
import org.xixum.neo4j.driver.constants.Neo4jConstants;
import org.xixum.neo4j.driver.entities.interfaces.IContextNode;
import org.xixum.neo4j.driver.entities.interfaces.INode;
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver;
import org.xixum.neo4j.driver.factory.IContextFactory;
import org.xixum.neo4j.driver.factory.INodeFactory;
import org.xixum.neo4j.driver.factory.IPredicateFactory;

@SuppressWarnings("all")
public class ParserDriver implements IParserDriver {
  private IDbAccess dbAccess;

  private IPredicateFactory predicateFactory;

  private INodeFactory nodeFactory;

  private IContextFactory contextFactory;

  private IBuildLogger logger;

  private IContextNode innerContext;

  private HashMap<Long, INode> nodeCache;

  public ParserDriver(final IDbAccess access, final INodeFactory factory, final IPredicateFactory factory2, final IContextFactory factory3, final IBuildLogger logger) {
    this.dbAccess = access;
    this.nodeFactory = factory;
    this.predicateFactory = factory2;
    this.contextFactory = factory3;
    this.nodeCache = CollectionLiterals.<Long, INode>newHashMap();
    this.innerContext = this.newContext();
    this.logger = logger;
  }

  @Override
  public IDbAccess getDbAccessor() {
    return this.dbAccess;
  }

  @Override
  public void setDbAccessor(final IDbAccess access) {
    this.dbAccess = access;
  }

  @Override
  public void setPredicateFactory(final IPredicateFactory factory) {
    this.predicateFactory = factory;
  }

  @Override
  public IPredicateFactory getPredicateFactory() {
    return this.predicateFactory;
  }

  @Override
  public void setNodeFactory(final INodeFactory factory) {
    this.nodeFactory = factory;
  }

  @Override
  public INodeFactory getNodeFactory() {
    return this.nodeFactory;
  }

  @Override
  public void setContextFactory(final INodeFactory factory) {
    this.setContextFactory(factory);
  }

  @Override
  public IContextFactory getContextFactory() {
    return this.contextFactory;
  }

  @Override
  public IBuildLogger getLogger() {
    return this.logger;
  }

  @Override
  public IContextNode newContext() {
    return this.contextFactory.create(this);
  }

  @Override
  public INode getNodeById(final Node node) {
    if ((node == null)) {
      return null;
    }
    long id = node.id();
    boolean _containsKey = this.nodeCache.containsKey(Long.valueOf(id));
    boolean _not = (!_containsKey);
    if (_not) {
      INode result = this.nodeFactory.create(node, this);
      if ((result != null)) {
        this.nodeCache.put(Long.valueOf(id), result);
        return result;
      }
    } else {
      return this.nodeCache.get(Long.valueOf(id));
    }
    return null;
  }

  @Override
  public List<Record> listConnections(final Node source, final String type) {
    List<Record> _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("MATCH (");
      _builder.append(Neo4jConstants._NODE);
      _builder.append(")-[");
      _builder.append(Neo4jConstants._LINK);
      _builder.append(":");
      _builder.append(type);
      _builder.append("]-(");
      _builder.append(Neo4jConstants._TARGET);
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("WHERE ID(");
      _builder.append(Neo4jConstants._NODE);
      _builder.append(") = ");
      long _id = source.id();
      _builder.append(_id);
      _builder.newLineIfNotEmpty();
      _builder.append("RETURN ");
      _builder.append(Neo4jConstants._LINK);
      _builder.append(", ");
      _builder.append(Neo4jConstants._TARGET);
      final String query = _builder.toString();
      _xblockexpression = this.getDbAccessor().runCodeRecords(query, Neo4jAccess.Action.READ);
    }
    return _xblockexpression;
  }

  @Override
  public IParserDriver newCache() {
    ParserDriver returnDriver = new ParserDriver(this.dbAccess, this.nodeFactory, this.predicateFactory, this.contextFactory, this.logger);
    returnDriver.nodeCache = CollectionLiterals.<Long, INode>newHashMap();
    returnDriver.setContext(returnDriver.newContext());
    return returnDriver;
  }

  @Override
  public void setContext(final IContextNode node) {
    this.innerContext = node;
  }

  @Override
  public IContextNode getContext() {
    return this.innerContext;
  }
}
