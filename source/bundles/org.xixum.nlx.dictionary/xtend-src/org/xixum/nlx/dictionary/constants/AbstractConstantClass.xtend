package org.xixum.nlx.dictionary.constants

import org.xixum.nlx.dictionary.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}