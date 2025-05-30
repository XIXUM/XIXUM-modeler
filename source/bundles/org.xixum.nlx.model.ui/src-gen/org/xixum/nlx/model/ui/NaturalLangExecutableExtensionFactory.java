/*
 * generated by Xtext 2.16.0
 */
package org.xixum.nlx.model.ui;

import com.google.inject.Injector;

import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xixum.nlx.model.ui.internal.ModelActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class NaturalLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ModelActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ModelActivator activator = ModelActivator.getInstance();
		return activator != null ? activator.getInjector(ModelActivator.ORG_XIXUM_NLX_NATURALLANG) : null;
	}

}
