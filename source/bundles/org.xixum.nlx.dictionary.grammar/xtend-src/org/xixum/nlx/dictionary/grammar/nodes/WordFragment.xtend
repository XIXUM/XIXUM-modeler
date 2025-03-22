package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.constants.Neo4jConstants._ATTR_NAME

import org.xixum.nlx.ai.IParserDriver
import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateENDS_WITH
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import org.xixum.nlx.dictionary.grammar.utils.GrammarUtil

class WordFragment extends AbstractDictRuleObj implements IDictNode, IPredicateENDS_WITH {
	
//	protected HashMap<String, IDictNode> children = new HashMap()
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}
	
	override solve() {
		// TODO consider a wrapper function with pre and post solves
		null
	}
	
	override endsWith(INode caller) {
		switch(caller){
			ConditionNode:{
				//TODO: 27.10.22 think of using cache
				var word = (caller.getAttribute(_TOKEN) as IGrammarItem).name.toLowerCase
				if (word.endsWith(getAttribute(_ATTR_NAME) as String))
					return GrammarUtil.findWord(this, word)
			}
		}
	}
	
}
