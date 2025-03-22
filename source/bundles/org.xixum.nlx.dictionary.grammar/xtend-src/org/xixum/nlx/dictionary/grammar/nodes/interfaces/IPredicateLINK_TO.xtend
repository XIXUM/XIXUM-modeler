package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.neo4j.driver.v1.types.Relationship
import org.xixum.nlx.ai.semantics.INode
import org.eclipse.xtext.xbase.lib.Functions.Function1

interface IPredicateLINK_TO {
	
	def INode linkTo(INode caller, Relationship relation, (String)=>INode delegate) 
	
}