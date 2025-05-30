package org.xixum.nlx.dictionary.grammar.utils

import java.util.List
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.neo4j.driver.types.Node
import org.xixum.neo4j.driver.constants.Direction
import org.xixum.neo4j.driver.entities.Arrow
import org.xixum.neo4j.driver.entities.interfaces.INode
import org.xixum.neo4j.driver.entities.interfaces.IParserDriver
import org.xixum.nlx.dictionary.grammar.nodes.TerminalNode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import org.neo4j.driver.Record
import org.neo4j.driver.types.Path

import static org.xixum.neo4j.driver.constants.Neo4jConstants._L
import static org.xixum.neo4j.driver.constants.Neo4jConstants._N
import static org.xixum.neo4j.driver.constants.Neo4jConstants._NAME
import static org.xixum.neo4j.driver.constants.Neo4jConstants._OF_CLASS
import static org.xixum.neo4j.driver.constants.Neo4jConstants._P
import static org.xixum.neo4j.driver.constants.Neo4jConstants._T
import static org.xixum.nlx.dictionary.constants.DictionaryConstants._POSITION
import static org.xixum.nlx.dictionary.constants.NodeConstants._WORD
import org.xixum.neo4j.driver.Neo4jAccess.Action

class GrammarUtil {
	
	
	def static INode findWord(INode nodeClass, String name) {
		val id = nodeClass.ID
		var children = nodeClass.children
		if (!children.containsKey(id))
			children.put(id, newHashMap)
		val descendants = children.get(id)
		if (!descendants.containsKey(name)) {
			var Function1<Object, List<Node>> delegate = [ e |
				if (e instanceof String)
					nodeClass.findNodeTypeByName(_WORD, e)
			]
			var INode result = nodeClass.findNodeAndCreateTarget(name, delegate)
			if (result instanceof INode) {
				descendants.put(name, result)
				return result
			}
		} else
			return descendants.get(name)
		null
	}

	def static INode findTarget(INode nodeClass, String name) {
		// TODO:  generalize this method with WordFragment find Fragment and delegate search
		val id = nodeClass.ID
		var children = nodeClass.children
		if (!children.containsKey(id))
			children.put(id, newHashMap)
		val descendants = children.get(id)
		if (!descendants.containsKey(name)) {
			var Function1<Object, List<Node>> delegate = [ e |
				if (e instanceof String)
					nodeClass.findLinkedNodeByName(e, _OF_CLASS, Direction.LEFT)
			]
			var INode result = nodeClass.findNodeAndCreateTarget(name, delegate)
			if (result instanceof INode) {
				descendants.put(name, result)
				return result
			}
		} else
			return descendants.get(name)
		null
	}

	def static INode findInterpunction(INode node, IGrammarItem item) {
		var current =  node.driver.getNodeById(item.baseNode)  //TODO: should behave similar to findTarget
		//var children = node.children
		switch(current){
			TerminalNode:{
				var nC = current.getAttribute(_POSITION) as Node
				var nN = node.getAttribute(_POSITION) as Node
				if (current.getAttribute(_NAME).equals(node.getAttribute(_NAME)) && nC.id === nN.id){
					return current
				} else
					null
			}
			default:{
				null
			}
		}
	}
	
	def static List<Path> findPathTo(IParserDriver driver, Node from, Node to, String type) {

		if (from == null || to == null)
			return null
		// MATCH P = (N:Class {name:"WordType"})<-[l:ofClass*]-(t:Word {name:"get"}) return *
		val query = '''MATCH «_P» = («_N»)«new Arrow(_L, type, null, null, null, true, Direction.RIGHT).generate»(«_T») WHERE ID(«_N») = «from.id» AND ID(«_T») = «to.id» 
«					  »RETURN *'''
		val List<Record> records = driver.dbAccessor.runCodeRecords(query, Action.READ)
		if (!records?.empty){
			var result = newArrayList
			for (rec : records)
				result.add(rec.get(_P).asPath)
			return result
		}
		return null

	}
	
}