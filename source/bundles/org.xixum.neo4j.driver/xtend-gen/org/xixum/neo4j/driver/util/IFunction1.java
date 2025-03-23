/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */
package org.xixum.neo4j.driver.util;

@SuppressWarnings("all")
public interface IFunction1<I extends Object, O extends Object> extends IFunction {
  O apply(final I e);
}
