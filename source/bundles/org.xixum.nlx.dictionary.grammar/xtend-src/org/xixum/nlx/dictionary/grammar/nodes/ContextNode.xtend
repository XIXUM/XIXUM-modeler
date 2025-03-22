package org.xixum.nlx.dictionary.grammar.nodes

import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.ai.semantics.IContextNode

class ContextNode extends AbstractNode implements IContextNode {
	
	IParserDriver driver
	
	new (IParserDriver driver){
		this.driver = driver
	}
	
}