package org.xixum.nlx.dictionary.grammar.nodes

import org.xixum.neo4j.driver.entities.interfaces.IContextNode
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver

class ContextNode extends AbstractNode implements IContextNode {
	
	IParserDriver driver
	
	new (IParserDriver driver){
		this.driver = driver
	}
	
}