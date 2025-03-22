<<<<<<< HEAD:source/de.validas.spedit.iedit.parent/de.validas.nlx.ai/src/de/validas/nlx/util/PluginUtils.java
/**
adapter Class to read plugin properties.
requires: org.eclipse.core.runtime
otherwise this produces: "the Hierarchy of the class implementation is inconsistent"

@author Felix Schaller
 */

package de.validas.nlx.util;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;


public final class PluginUtils extends EMFPlugin {

	public static final PluginUtils INSTANCE = new PluginUtils();
	
	private static Implementation plugin;

	public PluginUtils() {
		super
			(new ResourceLocator [] {
			});
	}

	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	public static Implementation getPlugin() {
		return plugin;
	}
	

	public static class Implementation extends EclipseUIPlugin {

		public Implementation() {
			super();
	
			plugin = this;
		}
	}

}
=======
/**
adapter Class to read plugin properties.
requires: org.eclipse.core.runtime
otherwise this produces: "the Hierarchy of the class implementation is inconsistent"

@author Felix Schaller
 */

package org.xixum.nlx.util;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;


public final class PluginUtils extends EMFPlugin {

	public static final PluginUtils INSTANCE = new PluginUtils();
	
	private static Implementation plugin;

	public PluginUtils() {
		super
			(new ResourceLocator [] {
			});
	}

	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	public static Implementation getPlugin() {
		return plugin;
	}
	

	public static class Implementation extends EclipseUIPlugin {

		public Implementation() {
			super();
	
			plugin = this;
		}
	}

}
>>>>>>> 28be792edcf63b5c495498de39713fad9b7858d6:source/org.xixum.nlx.parent/org.xixum.nlx.ai/src/org/xixum/nlx/util/PluginUtils.java
