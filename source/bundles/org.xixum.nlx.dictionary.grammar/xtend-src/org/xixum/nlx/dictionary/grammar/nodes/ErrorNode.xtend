package org.xixum.nlx.dictionary.grammar.nodes

import org.neo4j.driver.types.Node
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver

class ErrorNode extends AbstractDictRuleObj {
	
	String message
	
	new(Node node, IParserDriver driver) {
		this(node, driver, "")
	}
	
	new(Node node, IParserDriver driver, String message) {
		super(node, driver)
		this.message = message
	}
	
	override solve() {
		null
	}
	
	def getMessage() {
		message
	}
	
}
