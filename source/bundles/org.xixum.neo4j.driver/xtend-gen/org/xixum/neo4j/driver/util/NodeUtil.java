/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */
package org.xixum.neo4j.driver.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.neo4j.driver.Record;
import org.neo4j.driver.Value;
import org.neo4j.driver.types.Node;
import org.neo4j.driver.types.Path;
import org.neo4j.driver.types.Relationship;
import org.xixum.neo4j.driver.IDbAccess;
import org.xixum.neo4j.driver.Neo4jAccess;
import org.xixum.neo4j.driver.constants.Neo4jConstants;
import org.xixum.neo4j.driver.entities.Arrow;

@SuppressWarnings("all")
public class NodeUtil {
  public static List<Record> linkExistOrCreate(final IDbAccess dbAccessor, final String sourceQuery, final String targetQuery, final String linkQuery, final long sourceID, final long targetID) {
    List<Record> _xblockexpression = null;
    {
      boolean hasSource = (sourceID >= 0);
      boolean hasTarget = (targetID >= 0);
      HashMap<String, String> where = CollectionLiterals.<String, String>newHashMap();
      if (hasSource) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("ID(");
        _builder.append(Neo4jConstants._SOURCE);
        _builder.append(") = ");
        _builder.append(sourceID);
        where.put(Neo4jConstants._SOURCE, _builder.toString());
      }
      if (hasTarget) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("ID(");
        _builder_1.append(Neo4jConstants._TARGET);
        _builder_1.append(") = ");
        _builder_1.append(targetID);
        where.put(Neo4jConstants._TARGET, _builder_1.toString());
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("MATCH(");
      _builder_2.append(Neo4jConstants._SOURCE);
      {
        if ((!hasSource)) {
          _builder_2.append(":");
          _builder_2.append(sourceQuery);
        }
      }
      _builder_2.append(")-[");
      _builder_2.append(Neo4jConstants._LINK);
      _builder_2.append(":");
      _builder_2.append(linkQuery);
      _builder_2.append("]-(");
      _builder_2.append(Neo4jConstants._TARGET);
      {
        if ((!hasTarget)) {
          _builder_2.append(": ");
          _builder_2.append(targetQuery);
        }
      }
      _builder_2.append(") ");
      {
        if ((hasSource || hasTarget)) {
          _builder_2.append("WHERE ");
          {
            Collection<String> _values = where.values();
            boolean _hasElements = false;
            for(final String w : _values) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder_2.appendImmediate(" AND ", "");
              }
              _builder_2.append(w);
            }
          }
        }
      }
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("FOREACH (");
      _builder_2.append(Neo4jConstants._I);
      _builder_2.append(" in CASE");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("     ");
      _builder_2.append("WHEN EXISTS(");
      _builder_2.append(Neo4jConstants._LINK, "     ");
      _builder_2.append(".");
      _builder_2.append(Neo4jConstants._HIT, "     ");
      _builder_2.append(") THEN [1]");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("     ");
      _builder_2.append("ELSE [] END | SET ");
      _builder_2.append(Neo4jConstants._LINK, "     ");
      _builder_2.append(".");
      _builder_2.append(Neo4jConstants._HIT, "     ");
      _builder_2.append(" = ");
      _builder_2.append(Neo4jConstants._LINK, "     ");
      _builder_2.append(".");
      _builder_2.append(Neo4jConstants._HIT, "     ");
      _builder_2.append(" + 1) ");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("FOREACH (");
      _builder_2.append(Neo4jConstants._I);
      _builder_2.append(" in CASE");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("     ");
      _builder_2.append("WHEN NOT(EXISTS(");
      _builder_2.append(Neo4jConstants._LINK, "     ");
      _builder_2.append(".");
      _builder_2.append(Neo4jConstants._HIT, "     ");
      _builder_2.append(")) THEN [1]");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("     ");
      _builder_2.append("ELSE [] END | SET ");
      _builder_2.append(Neo4jConstants._LINK, "     ");
      _builder_2.append(".");
      _builder_2.append(Neo4jConstants._HIT, "     ");
      _builder_2.append(" = 1)");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("RETURN ");
      _builder_2.append(Neo4jConstants._SOURCE);
      _builder_2.append(", ");
      _builder_2.append(Neo4jConstants._LINK);
      _builder_2.append(", ");
      _builder_2.append(Neo4jConstants._TARGET);
      String query = _builder_2.toString();
      List<Record> result = dbAccessor.runCodeRecords(query, Neo4jAccess.Action.READ);
      boolean _not = (!((result != null) && (!result.isEmpty())));
      if (_not) {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("MATCH(");
        _builder_3.append(Neo4jConstants._SOURCE);
        {
          boolean _containsKey = where.containsKey(Neo4jConstants._SOURCE);
          boolean _not_1 = (!_containsKey);
          if (_not_1) {
            _builder_3.append(":");
            _builder_3.append(sourceQuery);
            _builder_3.append(")");
          } else {
            _builder_3.append(") WHERE ");
            String _get = where.get(Neo4jConstants._SOURCE);
            _builder_3.append(_get);
          }
        }
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("MATCH (");
        _builder_3.append(Neo4jConstants._TARGET);
        {
          boolean _containsKey_1 = where.containsKey(Neo4jConstants._TARGET);
          boolean _not_2 = (!_containsKey_1);
          if (_not_2) {
            _builder_3.append(": ");
            _builder_3.append(targetQuery);
            _builder_3.append(")");
          } else {
            _builder_3.append(") WHERE ");
            String _get_1 = where.get(Neo4jConstants._TARGET);
            _builder_3.append(_get_1);
          }
        }
        _builder_3.append(" ");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("MERGE(");
        _builder_3.append(Neo4jConstants._SOURCE);
        _builder_3.append(")-[");
        _builder_3.append(Neo4jConstants._LINK);
        _builder_3.append(": ");
        _builder_3.append(linkQuery);
        _builder_3.append("]->(");
        _builder_3.append(Neo4jConstants._TARGET);
        _builder_3.append(")");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("RETURN ");
        _builder_3.append(Neo4jConstants._SOURCE);
        _builder_3.append(", ");
        _builder_3.append(Neo4jConstants._LINK);
        _builder_3.append(", ");
        _builder_3.append(Neo4jConstants._TARGET);
        query = _builder_3.toString();
        result = dbAccessor.runCodeRecords(query, Neo4jAccess.Action.WRITE);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }

  /**
   * @parameter fail: returns null (fails) when grammar exists
   */
  public static Node nodeExistOrCreate(final IDbAccess dbAccessor, final String subQuery, final String varName, final List<String> exclude, final String optionalQuery, final boolean fail) {
    Node _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("MATCH (");
      _builder.append(subQuery);
      _builder.append(")");
      {
        if (((exclude != null) && (!exclude.isEmpty()))) {
          _builder.append("WHERE NOT (");
          {
            boolean _hasElements = false;
            for(final String attr : exclude) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(" OR ", "");
              }
              _builder.append("exists(");
              _builder.append(varName);
              _builder.append(".");
              _builder.append(attr);
              _builder.append(")");
            }
          }
          _builder.append(")");
        }
      }
      {
        if (((optionalQuery != null) && (optionalQuery.length() > 0))) {
          _builder.newLineIfNotEmpty();
          _builder.append(optionalQuery);
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("Return ");
      _builder.append(varName);
      String query = _builder.toString();
      List<Record> result = dbAccessor.runCodeRecords(query, Neo4jAccess.Action.READ);
      if ((fail && (!result.isEmpty()))) {
        return null;
      }
      boolean _isEmpty = result.isEmpty();
      if (_isEmpty) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("CREATE (");
        _builder_1.append(subQuery);
        _builder_1.append(") Return ");
        _builder_1.append(varName);
        query = _builder_1.toString();
        return NodeUtil.getFirstRecord(dbAccessor.runCodeRecords(query, Neo4jAccess.Action.WRITE), varName);
      }
      _xblockexpression = NodeUtil.getFirstRecord(result, varName);
    }
    return _xblockexpression;
  }

  /**
   * polymorphic version of
   * @method: nodeExistOrCreate
   */
  public static Node nodeExistOrCreate(final IDbAccess dbAccessor, final String subQuery, final String varName, final List<String> exclude, final boolean fail) {
    return NodeUtil.nodeExistOrCreate(dbAccessor, subQuery, varName, exclude, null, fail);
  }

  public static Relationship connectionExistOrCreate(final IDbAccess dbAccessor, final Node source, final Arrow arrow, final Node target) {
    Relationship _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("MATCH(");
      _builder.append(Neo4jConstants._NODE);
      _builder.append(":");
      String _get = ((String[])Conversions.unwrapArray(source.labels(), String.class))[0];
      _builder.append(_get);
      _builder.append(") WHERE ID(");
      _builder.append(Neo4jConstants._NODE);
      _builder.append(") = ");
      long _id = source.id();
      _builder.append(_id);
      _builder.newLineIfNotEmpty();
      _builder.append("MATCH(");
      _builder.append(Neo4jConstants._TARGET);
      _builder.append(":");
      String _get_1 = ((String[])Conversions.unwrapArray(target.labels(), String.class))[0];
      _builder.append(_get_1);
      _builder.append(") WHERE ID(");
      _builder.append(Neo4jConstants._TARGET);
      _builder.append(") = ");
      long _id_1 = target.id();
      _builder.append(_id_1);
      String subquery = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(subquery);
      _builder_1.append(" ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("MATCH(");
      _builder_1.append(Neo4jConstants._NODE);
      _builder_1.append(")");
      CharSequence _generate = arrow.generate();
      _builder_1.append(_generate);
      _builder_1.append("(");
      _builder_1.append(Neo4jConstants._TARGET);
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("Return ");
      String _varName = arrow.getVarName();
      _builder_1.append(_varName);
      String query = _builder_1.toString();
      List<Record> result = dbAccessor.runCodeRecords(query, Neo4jAccess.Action.READ);
      boolean _isEmpty = result.isEmpty();
      if (_isEmpty) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(subquery);
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("MERGE(");
        _builder_2.append(Neo4jConstants._NODE);
        _builder_2.append(")");
        CharSequence _generate_1 = arrow.generate();
        _builder_2.append(_generate_1);
        _builder_2.append("(");
        _builder_2.append(Neo4jConstants._TARGET);
        _builder_2.append(")");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("Return ");
        String _varName_1 = arrow.getVarName();
        _builder_2.append(_varName_1);
        String writeQuery = _builder_2.toString();
        return NodeUtil.getFirstRelation(dbAccessor.runCodeRecords(writeQuery, Neo4jAccess.Action.WRITE), arrow.getVarName());
      }
      _xblockexpression = NodeUtil.getFirstRelation(result, arrow.getVarName());
    }
    return _xblockexpression;
  }

  public static Node getFirstRecord(final List<Record> records, final String varName) {
    throw new Error("Unresolved compilation problems:"
      + "\nAccess restriction: The type InternalRecord is not accessible due to restriction on required project org.xixum.neo4j.driver"
      + "\nAccess restriction: The type NodeValue is not accessible due to restriction on required project org.xixum.neo4j.driver");
  }

  public static Relationship getFirstRelation(final List<Record> records, final String varName) {
    throw new Error("Unresolved compilation problems:"
      + "\nAccess restriction: The type InternalRecord is not accessible due to restriction on required project org.xixum.neo4j.driver");
  }

  public static List<Node> recordsToNode(final List<Record> records, final String key) {
    throw new Error("Unresolved compilation problems:"
      + "\nAccess restriction: The type NodeValue is not accessible due to restriction on required project org.xixum.neo4j.driver");
  }

  public static List<Record> listConnections(final IDbAccess dbAccessor, final Node source, final String type) {
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
      _xblockexpression = dbAccessor.runCodeRecords(query, Neo4jAccess.Action.READ);
    }
    return _xblockexpression;
  }

  public static Node asNode(final Value value) {
    throw new Error("Unresolved compilation problems:"
      + "\nAccess restriction: The type NodeValue is not accessible due to restriction on required project org.xixum.neo4j.driver");
  }

  public static Object valueToNum(final Value value) {
    throw new Error("Unresolved compilation problems:"
      + "\nAccess restriction: The type IntegerValue is not accessible due to restriction on required project org.xixum.neo4j.driver"
      + "\nAccess restriction: The type FloatValue is not accessible due to restriction on required project org.xixum.neo4j.driver"
      + "\nAccess restriction: The type StringValue is not accessible due to restriction on required project org.xixum.neo4j.driver"
      + "\nAccess restriction: The type ListValue is not accessible due to restriction on required project org.xixum.neo4j.driver"
      + "\nAccess restriction: The type MapValue is not accessible due to restriction on required project org.xixum.neo4j.driver");
  }

  public static ArrayList<ArrayList<Node>> pathToNodes(final List<Path> paths) {
    if (((paths == null) || paths.isEmpty())) {
      return null;
    }
    ArrayList<ArrayList<Node>> result = CollectionLiterals.<ArrayList<Node>>newArrayList();
    for (final Path path : paths) {
      {
        final ArrayList<Node> chain = CollectionLiterals.<Node>newArrayList();
        final Iterator<Path.Segment> segs = path.iterator();
        boolean _hasNext = segs.hasNext();
        if (_hasNext) {
          final Path.Segment seg = segs.next();
          chain.add(seg.start());
          chain.add(seg.end());
        }
        while (segs.hasNext()) {
          {
            final Path.Segment seg_1 = segs.next();
            final Function1<List<Node>, Integer> _function = (List<Node> r) -> {
              int i = 0;
              for (final Node n : r) {
                {
                  i++;
                  boolean _equals = n.equals(seg_1.start());
                  if (_equals) {
                    return Integer.valueOf(i);
                  }
                }
              }
              return null;
            };
            Function1<List<Node>, Integer> lookup = _function;
            Integer i = lookup.apply(chain);
            chain.add((i).intValue(), seg_1.end());
          }
        }
        result.add(chain);
      }
    }
    return result;
  }
}
