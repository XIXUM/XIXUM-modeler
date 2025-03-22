package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.constants.Neo4jConstants._NAME
import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.dictionary.constants.PredicateConstants.AS_

import org.xixum.nlx.ai.IParserDriver
import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import org.xixum.nlx.dictionary.grammar.token.IGrammarLiteral
import org.xixum.nlx.dictionary.grammar.token.IGrammarInterpunction
import org.xixum.nlx.dictionary.grammar.utils.GrammarUtil
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateIS
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateOF_CLASS
import org.neo4j.driver.v1.types.Relationship
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateLINK_TO

class WordClassToken extends AbstractPredicatedNodeObj implements IDictNode, IPredicateIS, IPredicateOF_CLASS, IPredicateLINK_TO  {

	
	IGrammarItem item
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}

	override solve() {
		// TODO consider a wrapper function with pre and post solves
		null
	}
	
	override is(INode caller) {

		this.item = (caller.getAttribute(_TOKEN) as IGrammarItem)
		
		val type = item.internalType
		switch (type){ 
			IGrammarLiteral:{
				//only check for type if selected in context
				val selectedT = type.baseType?.key
				if (selectedT !== null && selectedT.equals(getAttribute(_NAME)))
					return GrammarUtil.findTarget(this, item.name)
				else
					return solve()	
			}
			IGrammarInterpunction:{									
				return GrammarUtil.findInterpunction(this, item)
			}
			default:{
				return solve()
			}
		} 	
	}
	
	override ofClass(INode caller, Relationship relation) {
		return this
	}
	
	override INode linkTo(INode caller, Relationship relation, (String)=>INode delegate)  {
		var String type = relation.get(AS_).asString().toLowerCase // TODO: null safe check
		return delegate.apply(type)
	}
	
	
}
