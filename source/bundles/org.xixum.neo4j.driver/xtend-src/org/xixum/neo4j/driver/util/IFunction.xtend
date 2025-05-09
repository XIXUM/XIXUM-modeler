/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.neo4j.driver.util

/**
 * stubs for delegate functions
 * @author: felix schaller
 */

interface IFunction {
}

interface IFunction0<O> extends IFunction {
	def O apply();
}

interface IFunction1<I,O> extends IFunction {
	def O apply(I e);
}
