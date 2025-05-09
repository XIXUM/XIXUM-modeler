package org.xixum.nlx.dictionary.grammar.nodes

import java.util.Map

class AbstractNode {
	
	protected Map<String, Object> attributes = newHashMap
	protected Map<String, Object> extraAttributes = newHashMap
	
	
	def Object getAttribute(String key) {
		if (attributes.containsKey(key)) {
			attributes.get(key)
		} else {
			extraAttributes.get(key)
		}
	}

	def Object setAttribute(String key, Object value) {
		extraAttributes.put(key, value)
		value
	}

	def clearExtraAttributes() {
		extraAttributes = newHashMap
	}
	
	def init(){
		clearExtraAttributes
	}
}