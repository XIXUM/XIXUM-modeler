/**
 * 
 */
package org.xixum.modeler.spelling.ui.editor.validation;

import static org.xixum.modeler.spelling.ui.constants.EditorUiConstants.INFO_ANNOTATION_TYPE;

import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;

/**
 * @author Felix Schaller
 *
 */
public class NlxAnnotationIssueProcessor extends AnnotationIssueProcessor {

	/**
	 * @param xtextDocument
	 * @param annotationModel
	 * @param issueResolutionProvider
	 */
	public NlxAnnotationIssueProcessor(IXtextDocument xtextDocument, IAnnotationModel annotationModel,
			IssueResolutionProvider issueResolutionProvider) {
		super(xtextDocument, annotationModel, issueResolutionProvider);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean isRelevantAnnotationType(String type) {
		//TODO: get types from preferences
		return type.equals(XtextEditor.ERROR_ANNOTATION_TYPE) || type.equals(XtextEditor.WARNING_ANNOTATION_TYPE) || type.equals(INFO_ANNOTATION_TYPE) || type.equals(XtextEditor.INFO_ANNOTATION_TYPE);
	}

}
