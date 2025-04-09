package org.xixum.nlx.model.ui.editor

import org.eclipse.xtext.builder.debug.IBuildLogger
import com.google.inject.ImplementedBy

@ImplementedBy(NlxBuildConsole.Logger)
interface INlxBuildLogger extends IBuildLogger {
	
}
