package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_NAME_
import static org.xixum.neo4j.driver.constants.Neo4jConstants._ATTR_NAME

import org.xixum.nlx.dictionary.grammar.nodes.AbstractDictRuleObj
import org.neo4j.driver.types.Node
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateGET_NAME
import org.xixum.neo4j.driver.entities.interfaces.INode
import org.neo4j.driver.types.Relationship

abstract class AbstractPredicatedNodeObj extends AbstractDictRuleObj implements IPredicateGET_NAME{
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}
	
	override getName(INode caller, Relationship relation){
		caller.setAttribute(GET_NAME_, getAttribute(_ATTR_NAME))
		null
	}
	
}