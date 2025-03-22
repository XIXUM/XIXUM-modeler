package org.xixum.nlx.dictionary.grammar.factories

import org.xixum.nlx.ai.INodeFactory
import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.dictionary.grammar.nodes.BoolAndConditionNode
import org.xixum.nlx.dictionary.grammar.nodes.BoolOrConditionNode
import java.util.HashMap
import org.neo4j.driver.v1.types.Node

import static org.xixum.nlx.dictionary.constants.PredicateConstants.TYPE_
import static org.xixum.nlx.dictionary.constants.NodeConstants._BOOL_AND
import static org.xixum.nlx.dictionary.constants.NodeConstants._BOOL_OR
import org.xixum.nlx.dictionary.grammar.nodes.ErrorNode

class ConditionFactory implements INodeFactory {

	override create(Node node, IParserDriver driver) {
		var HashMap<String, Object> attributes = new HashMap<String, Object>(node.asMap())
		val type = attributes.get(TYPE_) 
		switch (type) {
			case _BOOL_AND: {
				new BoolAndConditionNode(node, driver)
			}
			case _BOOL_OR: {
				new BoolOrConditionNode(node, driver)
			}
			default: {
				//TODO: 11.11.22 raise Exception and catch exception in runner
				driver.logger.log('''[ERROR]: ConditionFactory For:
Node -> [«node.id», «node.asMap»]''')
				new ErrorNode(node, driver, '''unknown boolean operator: "«type»"''')
			}
		}

	}

}
