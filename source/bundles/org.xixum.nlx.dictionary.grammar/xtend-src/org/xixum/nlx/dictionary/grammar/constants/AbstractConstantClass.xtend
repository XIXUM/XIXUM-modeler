package org.xixum.nlx.dictionary.grammar.constants

import org.xixum.nlx.dictionary.grammar.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}
