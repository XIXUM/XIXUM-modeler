package org.xixum.modeler.spelling.ui.constants

import org.xixum.modeler.spelling.ui.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}
