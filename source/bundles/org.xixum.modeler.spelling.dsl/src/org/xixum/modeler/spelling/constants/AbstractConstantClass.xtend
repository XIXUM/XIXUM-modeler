package org.xixum.modeler.spelling.constants

import org.xixum.modeler.spelling.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}
