package org.xixum.nlx.dictionary.grammar.nodes.interfaces

import org.neo4j.driver.types.Relationship
import org.xixum.neo4j.driver.entities.interfaces.INode
import org.eclipse.xtext.xbase.lib.Functions.Function1

interface IPredicateLINK_TO {
	
	def INode linkTo(INode caller, Relationship relation, (String)=>INode delegate) 
	
}