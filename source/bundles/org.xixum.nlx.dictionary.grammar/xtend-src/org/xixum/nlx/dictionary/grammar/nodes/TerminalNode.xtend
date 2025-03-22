package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.dictionary.constants.NodeConstants._TYPE

import org.xixum.nlx.dictionary.grammar.nodes.AbstractDictRuleObj
import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.ai.IParserDriver


import static org.xixum.nlx.dictionary.constants.DictionaryConstants._POSITION
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateEQUALS
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem

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