package org.xixum.neo4j.driver.entities.interfaces

interface IContextNode {
	
	def Object getAttribute(String key)
	
	def Object setAttribute(String key, Object value)
	
}
