package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.dictionary.constants.PredicateConstants.WITH_

import org.neo4j.driver.types.Node
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateGET
import org.neo4j.driver.types.Relationship
import org.xixum.neo4j.driver.entities.interfaces.INode

abstract class AbstractActionPredicatedNodeObj extends AbstractPredicatedNodeObj implements IPredicateGET {
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}
	
	override get(INode caller, Relationship relation) {
		var value = getAttribute(WITH_) as INode
		if (value !== null)
			caller.setAttribute(relation.type.toLowerCase, value)
		null //do not solve anything
	}
	
}