package org.xixum.nlx.model.ui.constants

import org.xixum.nlx.model.ui.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}
