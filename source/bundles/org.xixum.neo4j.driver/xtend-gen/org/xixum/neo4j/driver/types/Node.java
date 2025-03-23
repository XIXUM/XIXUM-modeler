package org.xixum.neo4j.driver.types;

@SuppressWarnings("all")
public class Node {
  private org.neo4j.driver.types.Node internalNode;

  public Node(final org.neo4j.driver.types.Node node) {
    this.internalNode = node;
  }

  public Iterable<String> labels() {
    return this.internalNode.labels();
  }

  public boolean hasLabel(final String label) {
    return this.internalNode.hasLabel(label);
  }
}
