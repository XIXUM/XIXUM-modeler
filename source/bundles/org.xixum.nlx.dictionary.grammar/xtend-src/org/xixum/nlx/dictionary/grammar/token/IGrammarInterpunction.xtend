package org.xixum.nlx.dictionary.grammar.token

import org.xixum.nlx.dictionary.grammar.types.ItemType
import org.neo4j.driver.types.Node

interface IGrammarInterpunction {
	
	def ItemType getCathegory()
	def Node getNode()

}