package org.xixum.nlx.dictionary.grammar.utils

import org.eclipse.emf.edit.EMFEditPlugin

class StaticUtils {
	def static getResourceLocator() {
		return EMFEditPlugin.INSTANCE;
	}

	def static getString(String key, boolean translate) {
		getResourceLocator().getString(key, translate);
	}
	
	def static getString(String key) {
		getString(key, true);
	}
}
