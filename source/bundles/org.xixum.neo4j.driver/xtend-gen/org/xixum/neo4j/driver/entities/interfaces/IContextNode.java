package org.xixum.neo4j.driver.entities.interfaces;

@SuppressWarnings("all")
public interface IContextNode {
  Object getAttribute(final String key);

  Object setAttribute(final String key, final Object value);
}
