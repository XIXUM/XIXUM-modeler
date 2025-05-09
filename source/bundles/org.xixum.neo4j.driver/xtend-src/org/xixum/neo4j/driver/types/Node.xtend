/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.neo4j.driver.types

class Node {
	
	org.neo4j.driver.types.Node internalNode
	
	new(org.neo4j.driver.types.Node node){
		internalNode = node
	}
	
	
	def Iterable<String> labels(){
		internalNode.labels
	}

    
    def boolean hasLabel(String label){
    	return internalNode.hasLabel(label)
    }
	
	
}