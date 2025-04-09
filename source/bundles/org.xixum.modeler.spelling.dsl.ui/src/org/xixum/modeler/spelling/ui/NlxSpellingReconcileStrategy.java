/*
 * overrides SpellChecker Config
 * @author: schaller
 */

package org.xixum.modeler.spelling.ui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.model.ITokenTypeToPartitionTypeMapperExtension;
import org.eclipse.xtext.ui.editor.reconciler.IReconcileStrategyFactory;
import org.eclipse.xtext.ui.editor.reconciler.XtextSpellingReconcileStrategy;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class NlxSpellingReconcileStrategy extends XtextSpellingReconcileStrategy {
	
	//@Named("spellChecker")
	public static class Factory implements IReconcileStrategyFactory {
		
		@Inject
		private ITokenTypeToPartitionTypeMapperExtension partitionMapperExtension;
		
		@Override
		public NlxSpellingReconcileStrategy create(ISourceViewer sourceViewer) {
			NlxSpellingReconcileStrategy result = new NlxSpellingReconcileStrategy(sourceViewer);
			//access protected Method
			try {
				//getDeclaredMethod doesn't work
				Method method = Arrays.stream(result.getClass().getSuperclass().getDeclaredMethods()).filter(n -> n.getName().equals("setPartitionMapperExtension")).findFirst().orElse(null);
				if (method != null) {
					method.setAccessible(true);
					method.invoke(result, partitionMapperExtension);
				}
			} catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return result;
		}
	}
	
	protected NlxSpellingReconcileStrategy(ISourceViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean shouldProcess(ITypedRegion typedRegion) {
		return true;
	}

}
