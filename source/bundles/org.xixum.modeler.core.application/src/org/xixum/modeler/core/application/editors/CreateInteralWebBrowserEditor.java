package org.xixum.modeler.core.application.editors;

import org.eclipse.ui.part.EditorPart;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

public class CreateInteralWebBrowserEditor extends EditorPart {

    @Override
    public void doSave(org.eclipse.core.runtime.IProgressMonitor monitor) {
        // No save functionality needed for the browser
    }

    @Override
    public void doSaveAs() {
        // Not applicable
    }

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        setSite(site);
        setInput(input);

        // Open the HTML file in the internal browser
        String filePath = input.getToolTipText(); // Get file path from input
        CreateInteralWebBrowser.openHtmlFile(filePath);
    }

    @Override
    public boolean isDirty() {
        return false; // No changes to track
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false; // Save As not allowed
    }

    @Override
    public void createPartControl(Composite parent) {
        // No UI components needed
    }

    @Override
    public void setFocus() {
        // No specific focus behavior
    }
}