package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.constants.Neo4jConstants._OF_CLASS
import static org.xixum.nlx.constants.Neo4jConstants._NAME
import static org.xixum.nlx.constants.Neo4jConstants._CLASS

import org.xixum.nlx.dictionary.grammar.nodes.AbstractPredicatedNodeObj
import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateIS
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import org.xixum.nlx.dictionary.grammar.token.IGrammarLiteral
import org.xixum.nlx.dictionary.grammar.utils.GrammarUtil
import org.xixum.nlx.dictionary.grammar.token.IGrammarInterpunction
import org.xixum.nlx.ai.util.NodeUtil
import java.util.List

class ClassNode extends AbstractPredicatedNodeObj implements IPredicateIS{
	
	IGrammarItem item
	
	new(Node node, IParserDriver driver) {
		super(node, driver)
	}
	
	override solve() {
		null // derive result from downstream connections, currently no downstream connections implemented
	}
	
	override is(INode caller) {
		this.item = (caller.getAttribute(_TOKEN) as IGrammarItem)
		val type = item.internalType
		
		switch (type){ 
			IGrammarLiteral:{
				//only check for type if selected in context
				val segments = NodeUtil.pathToNodes(GrammarUtil.findPathTo(driver, item.baseNode, this.node, _OF_CLASS))
				for (chain: segments ?: #[]){
					if (chain?.size() > 1){
						val classN = driver.getNodeById(chain.get(Math.max(1, chain.size-2)))  //get super set
						val selectedT = type.baseType.key
						if (selectedT !== null && selectedT.equals(classN.getAttribute(_NAME))){
							return classN
						}	
					}	
				}
				solve()
			}
			IGrammarInterpunction:{
				
				val tNode = type.node					
				val segments = NodeUtil.pathToNodes(GrammarUtil.findPathTo(driver, tNode, this.node, _OF_CLASS))
				var chain =  segments?.get(0) // interpunction can not have different types, so only one path exists
				if (chain?.size() > 1)
					return driver.getNodeById(chain.get(Math.max(0, chain.size-2)))  //TODO: find a dynamic solution finding WordClass by super class (Name)
			}
			default:{
				return solve()
			}
		} 	
		null
	}
	
}