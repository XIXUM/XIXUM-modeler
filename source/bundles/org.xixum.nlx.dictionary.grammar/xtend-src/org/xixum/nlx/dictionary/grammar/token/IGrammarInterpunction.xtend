package org.xixum.nlx.dictionary.grammar.token

import org.xixum.nlx.dictionary.grammar.types.ItemType
import org.neo4j.driver.v1.types.Node

interface IGrammarInterpunction {
	
	def ItemType getCathegory()
	def Node getNode()

}