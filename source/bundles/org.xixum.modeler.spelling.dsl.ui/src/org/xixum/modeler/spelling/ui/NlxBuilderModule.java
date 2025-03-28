package org.xixum.modeler.spelling.ui;

import com.google.inject.AbstractModule;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.builder.debug.IBuildLogger;
import org.xixum.modeler.spelling.ui.editor.NlxBuildConsole;

@SuppressWarnings("all")
public class NlxBuilderModule extends AbstractModule {
  public NlxBuilderModule() {
  }
  
  @Override
  public void configure() {
    this.<IExtensionRegistry>bind(IExtensionRegistry.class).toInstance(Platform.getExtensionRegistry());
    this.<IExtensionRegistry>bind(IExtensionRegistry.class).toInstance(Platform.getExtensionRegistry());
    this.<IBuildLogger>bind(IBuildLogger.class).to(NlxBuildConsole.Logger.class);
  }
}
