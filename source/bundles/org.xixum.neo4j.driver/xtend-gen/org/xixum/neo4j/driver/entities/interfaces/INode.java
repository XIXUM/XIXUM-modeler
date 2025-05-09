/**
 * AbstractDictRuleObj - Base Obj for Abstract dictionary rules
 * (c) 2020 licensed under Apache Public License 2.0
 * www.felixschaller.com
 * @author Felix Schaller
 */
package org.xixum.neo4j.driver.entities.interfaces;

import java.util.List;
import java.util.Map;
import org.neo4j.driver.Record;
import org.neo4j.driver.types.Node;
import org.xixum.neo4j.driver.constants.Direction;
import org.xixum.neo4j.driver.util.IFunction1;

@SuppressWarnings("all")
public interface INode {
  INode solve();

  Node getNodeRef();

  IParserDriver getDriver();

  void setNodeRef(final Node node);

  List<Record> listAllConnections();

  List<Record> listConnections(final String type);

  List<Record> listAllOutputs();

  List<Record> listAllInputs();

  Object getAttribute(final String key);

  Object setAttribute(final String key, final Object value);

  long getID();

  String getLabel();

  String getName();

  boolean hasLabel(final Node node, final String name);

  void setFilter(final String filter);

  INode findNodeAndCreateTarget(final String string, final IFunction1<Object, ?> delegate);

  List<Node> findNodeTypeByName(final String type, final String name);

  List<Node> findLinkedNodeByName(final String string, final String linkType, final Direction dir);

  Map<Long, Map<String, INode>> getChildren();
}
