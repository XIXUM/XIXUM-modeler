package org.xixum.nlx.dictionary.type

import org.xixum.nlx.dictionary.type.ITypeHierarchy
import java.util.List
import static org.xixum.nlx.dictionary.constants.NodeConstants._NONE

class NoneTypeHierarchy implements ITypeHierarchy {
	
	override getType() {
		_NONE
	}
	
	override getChildren() {
		var List<ITypeHierarchy> empty = newArrayList
		return empty
	}
	
}