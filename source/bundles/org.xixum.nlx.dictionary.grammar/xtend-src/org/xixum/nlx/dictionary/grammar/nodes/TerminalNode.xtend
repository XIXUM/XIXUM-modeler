package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.neo4j.driver.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.dictionary.constants.NodeConstants._TYPE
import static org.xixum.nlx.dictionary.constants.DictionaryConstants._POSITION

import org.xixum.nlx.dictionary.grammar.nodes.AbstractDictRuleObj
import org.neo4j.driver.types.Node
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateEQUALS
import org.xixum.neo4j.driver.entities.interfaces.INode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.neo4j.driver.util.IFunction1
import org.xixum.neo4j.driver.constants.Direction

class TerminalNode extends AbstractDictRuleObj implements IDictNode, IPredicateEQUALS {
	
	Node position
	
	new(Node node, Node position,  IParserDriver driver) {
		super(node, driver)
		this.position = position
		this.setAttribute(_POSITION, position)
	}
	
	override solve() {
		return null
	}
	
	def getPosition(){
		position
	}
	
	def getType(){
		node.get(_TYPE).asString
	}
	
	override equals(INode caller) {
		val contextS = caller.getAttribute(_TOKEN) as IGrammarItem
		if (contextS === null)
			return null 
		
		val result = solve

		if (!contextS.name.equalsIgnoreCase(this.name))
			return result

		val type = contextS?.internalType?.baseType.key
		if (!type.equals(this.type))
			return result
		this	
	}
	
}