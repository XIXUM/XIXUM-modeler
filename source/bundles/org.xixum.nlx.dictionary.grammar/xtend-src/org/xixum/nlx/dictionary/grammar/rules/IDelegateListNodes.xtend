package org.xixum.nlx.dictionary.grammar.rules

import java.util.List
import org.neo4j.driver.internal.value.NodeValue

/**
 *  deprecated. use IFunction from: org.xixum.nlx.ai
 */
@Deprecated
interface IDelegateListNodes {
	def List<NodeValue> execute(String string)
}
