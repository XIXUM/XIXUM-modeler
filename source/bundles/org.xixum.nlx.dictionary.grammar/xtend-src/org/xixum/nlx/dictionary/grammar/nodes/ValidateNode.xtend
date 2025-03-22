package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.constants.Neo4jConstants._TOKEN

import java.util.HashMap
import java.util.List
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem

class ValidateNode {

	INode errorNode
	INode nodeStart
//	INode nodeEnd // unused?

	List<String> strings
	
	new(INode node, INode node2, List<String> strings) {
		this.nodeStart = node 
//		this.nodeEnd = node2
		this.strings = strings ?: #[]
		this.errorNode = null
	}

	def HashMap<String, INode> validate() {
		var HashMap<String, INode> connections = new HashMap()
		for (connectionType : strings) {
			var Object connection = nodeStart.getAttribute(connectionType)
			if (connection instanceof INode) {
				connections.put(connectionType, nodeStart.getAttribute(connectionType) as INode)
			} else {
				if (errorNode === null)
					errorNode = new ErrorNode(nodeStart.getNodeRef, nodeStart.getDriver)
				errorNode.setAttribute(connectionType, connection)
				nodeStart.getDriver.logger.log('''[ERROR]: «connectionType» For:
«connection» -> at [«IF nodeStart instanceof ITokenNode»«(nodeStart.getAttribute(_TOKEN) as IGrammarItem).index»«ELSE»null«ENDIF»]''')

			}
		}
		connections
	}
	
	def boolean hasAnnotation() {
		return if(errorNode === null) false else true
	}
	
	def INode getAnnotation() {
		errorNode
	}
	
}