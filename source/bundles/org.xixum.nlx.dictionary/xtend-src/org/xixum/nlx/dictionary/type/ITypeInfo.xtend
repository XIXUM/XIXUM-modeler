/**
 * @author: Felix Schaller
 */
package org.xixum.nlx.dictionary.type

import org.xixum.nlx.dictionary.type.ITypeAttributes
import org.xixum.utils.data.types.XPair
import java.util.List
import java.util.HashMap
import org.neo4j.driver.v1.types.Node

interface ITypeInfo {
	
	//TODO: replace XPair with grammar Type with hashed attributes 
	def List<XPair<String, ITypeAttributes>> getTypes()
	
	def void updateTypes(HashMap<String, ITypeAttributes> linkTypes)
	def void addTypes(HashMap<String, ITypeAttributes> linkTypes)
	
	def Node getBase()
	
}