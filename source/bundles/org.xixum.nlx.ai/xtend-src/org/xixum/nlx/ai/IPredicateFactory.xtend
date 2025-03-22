<<<<<<< HEAD:source/de.validas.spedit.iedit.parent/de.validas.nlx.ai/xtend-src/de/validas/nlx/ai/IPredicateFactory.xtend
package de.validas.nlx.ai

import org.neo4j.driver.internal.value.RelationshipValue
import de.validas.nlx.ai.semantics.INode
import de.validas.nlx.ai.semantics.IPredicate

interface IPredicateFactory {
	
	def IPredicate create(RelationshipValue value, INode nodeStart, INode nodeEnd)
	
}
=======
package org.xixum.nlx.ai

import org.neo4j.driver.internal.value.RelationshipValue
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.ai.semantics.IPredicate

interface IPredicateFactory {
	
	def IPredicate create(RelationshipValue value, INode nodeStart, INode nodeEnd)
	
}
>>>>>>> 28be792edcf63b5c495498de39713fad9b7858d6:source/org.xixum.nlx.parent/org.xixum.nlx.ai/xtend-src/org/xixum/nlx/ai/IPredicateFactory.xtend
