package org.xixum.nlx.dictionary.type

import java.util.List
import org.neo4j.driver.types.Node
import static org.xixum.neo4j.driver.constants.Neo4jConstants._NAME

class TypeHierarchy implements ITypeHierarchy{
	
	Node node
	List<ITypeHierarchy> hierarchy
	
	new(Node node, List<ITypeHierarchy> hierarchy) {
		this.node = node
		this.hierarchy = hierarchy
	}
	
	override getType(){
		node.get(_NAME).asString
	}
	
	override getChildren() {
		hierarchy
	}
	
}