package org.xixum.nlx.dictionary.grammar.factories

import org.xixum.nlx.ai.INodeFactory
import org.xixum.nlx.ai.IParserDriver
import org.neo4j.driver.v1.types.Node

//import static org.xixum.nlx.constants.Neo4jConstants._NAME
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._START
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._END
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._FULLSTOP		
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._BRACKETOPEN  
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._BRACKETCLOSE 
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._QUESTION_M   
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._SEPARATOR    
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._NEWLINE      
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._KOMMA        
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._SEMICOLON    
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._EXCLAMATION_M
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._SPECIAL 

import org.xixum.nlx.dictionary.grammar.nodes.TerminalNode

import static org.xixum.nlx.dictionary.constants.DictionaryConstants._AT
import static org.xixum.nlx.constants.Neo4jConstants._TARGET
import org.xixum.nlx.ai.util.NodeUtil

class InterpunctionFactory implements INodeFactory{
	
	override create(Node node, IParserDriver driver) {
		
		var records = NodeUtil.listConnections(driver.dbAccessor, node, _AT)
		var position = NodeUtil.recordsToNode(records, _TARGET).get(0)
		
		var attributes = node.asMap()
		
		return new TerminalNode(node, position, driver)

	}
	
}