/**
 * 
 */
package org.xixum.nlx.model.ui.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.xtext.builder.debug.XtextBuildConsole;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;

import org.xixum.nlx.dictionary.IDictionaryAccess;
import org.xixum.nlx.model.view.fxviews.views.ISemanticViewSelector;
import org.xixum.nlx.model.view.fxviews.views.SemanticViewSelector;
import org.xixum.nlx.model.ui.model.NaturalLangEditorPlugin;

/**
 * @author Felix Schaller
 *
 */
@SuppressWarnings("rawtypes")
public class NaturalLangEditor extends XtextEditor implements ISelectionProvider, IMenuListener {

	/**
	 * Editor Extension Class to handle Natural language in Editor
	 */
	//public static final String INFO_ANNOTATION_TYPE = "org.xixum.nlx.ui.NaturalLang.Annotation";

	protected List<PropertySheetPage> propertySheetPages = new ArrayList<PropertySheetPage>();

	@Inject
	protected IPropertySourceProvider adapterFactory;

	protected ISelectionChangedListener selectionChangedListener;
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	protected ISelection editorSelection = StructuredSelection.EMPTY;
	protected Viewer currentViewer;
	protected TreeViewer selectionViewer;

	@Inject(optional = true)
	private Provider<IPropertySheetPage> propertySheetProvider;

	protected Viewer viewer;
	protected OutlinePage contentOutline;
	protected ISelectionListener semanticViewSelector;

	@Inject
	protected IDictionaryAccess dictAcc;
	
	protected XtextBuildConsole console;

	/**
	 * constructor
	 */
	public NaturalLangEditor() {
		super();
	}

	@Override
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		super.init(site, editorInput);
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
		// addSelectionChangedListener(site.)
	}

	public NaturalLangActionBarContributor getActionBarContributor() {
		return (NaturalLangActionBarContributor) getEditorSite().getActionBarContributor();
	}

	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class key) {

		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else if (key.equals(ISemanticViewSelector.class)) {
			return getSemanticViewSelector();
		} else if (key.equals(NaturalLangEditor.class)){
			return this;
		} else if(key.equals(XtextBuildConsole.class)){
			return console;
		} else if(key.equals(IDictionaryAccess.class)){
			return dictAcc;
		} else if(key.equals(OutlinePage.class)){
			return contentOutline;
		} else{
			return super.getAdapter(key);
		}
	}

	public ISelectionListener getSemanticViewSelector() {

		// TODO: multiple selectors for multible views
		if (semanticViewSelector != null)
			return semanticViewSelector;

		ISelectionListener selector = new SemanticViewSelector(dictAcc) {
			@Override
			public void setSelectionToViewer(List<?> selection) {
				this.setSelectionToViewer(selection);
				this.setFocus();
			}

			@Override
			public void setActionBars(IActionBars actionBars) {
				super.setActionBars(actionBars);
				// getActionBarContributor().shareGlobalActions(this, actionBars);
			}
		};
		getSite().getPage().addPostSelectionListener(selector);
		semanticViewSelector = selector;
		return selector;

		// return null;
	}

	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = null;
		// initSelectionViewer();
		if (adapterFactory != null) {
			// find page, else create new
			for (IPropertySheetPage page : propertySheetPages == null ? Collections.<PropertySheetPage>emptyList()
					: propertySheetPages) {
				if (page instanceof NaturalLangPropertySheetPage)
					return page;
			}

			propertySheetPage = new NaturalLangPropertySheetPage(getDocument()) {
				@Override
				public void setSelectionToViewer(List<?> selection) {
					this.setSelectionToViewer(selection);
					this.setFocus();
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this, actionBars);
				}
			};
			propertySheetPage.setPropertySourceProvider(adapterFactory);
			propertySheetPages.add(propertySheetPage);
		} else {
			propertySheetPage = (PropertySheetPage) propertySheetProvider.get();

		}

		return propertySheetPage;
	}

	/**
	 * @return the propertySheetPages
	 */
	public List<PropertySheetPage> getPropertySheetPages() {
		return propertySheetPages;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.XtextEditor#createPartControl(org.eclipse.swt.
	 * widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {

		Object outline = getAdapter(IContentOutlinePage.class);
		if (outline instanceof OutlinePage) {
			contentOutline = (OutlinePage) outline;
		}
		super.createPartControl(parent);
		console = attachConsole();
	}

	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);

	}

	@Override
	public ISelection getSelection() {
		return editorSelection;
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);

	}

	@Override
	public void setSelection(ISelection selection) {
		editorSelection = selection;
//		initSelectionViewer();
		
		semanticViewSelector.selectionChanged(getSite().getPage().getActivePart(), selection);
		
		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		setStatusLineManager(selection);

	}

	protected void handleActivate() {
		// Recompute the read only state.
		//
//		TODO: taken from ReferenceProcessEditor class
	}

	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection) selection).toList();
				switch (collection.size()) {
				case 0: {
					statusLineManager.setMessage(getString("_UI_NoObjectSelected"));
					break;
				}
				case 1: {
					String text = ((NlxEObjectNodeAdapterFactory) adapterFactory).getText(collection.iterator().next());
					statusLineManager.setMessage(getString("_UI_SingleObjectSelected", text));
					break;
				}
				default: {
					statusLineManager
							.setMessage(getString("_UI_MultiObjectSelected", Integer.toString(collection.size())));
					break;
				}
				}
			} else {
				statusLineManager.setMessage("");
			}
		}
	}

	private static String getString(String key) {
		return NaturalLangEditorPlugin.INSTANCE.getString(key);
	}

	private static String getString(String key, Object s1) {
		return NaturalLangEditorPlugin.INSTANCE.getString(key, new Object[] { s1 });
	}

	/**
	 * Modified of Method from XtextEditor
	 * 
	 * @modified_by: Felix Schaller
	 */
	@Override
	protected IAnnotationAccess createAnnotationAccess() {
		return new DefaultMarkerAnnotationAccess() {
			@Override
			public int getLayer(Annotation annotation) {
				if (annotation.isMarkedDeleted()) {
					return IAnnotationAccessExtension.DEFAULT_LAYER;
				}
				return super.getLayer(annotation);
			}
		};
	}

	public void setCurrentViewer(Viewer viewer) {

		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				selectionChangedListener = new ISelectionChangedListener() {

					public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
						setSelection(selectionChangedEvent.getSelection());
					}
				};
			}
			if (currentViewer != null) {
				currentViewer.removeSelectionChangedListener(selectionChangedListener);
			}
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}
			currentViewer = viewer;
			setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
		}
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		// TODO Auto-generated method stub

	}

	protected IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p instanceof PropertySheet) {
				if (propertySheetPages.contains(((PropertySheet) p).getCurrentPage())) {
					getActionBarContributor().setActiveEditor(NaturalLangEditor.this);
					handleActivate();
				}
			} else if (p == NaturalLangEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
// Ignore.
		}

		public void partClosed(IWorkbenchPart p) {
// Ignore.
		}

		public void partDeactivated(IWorkbenchPart p) {
// Ignore.
		}

		public void partOpened(IWorkbenchPart p) {
// Ignore.
		}
	};

	public XtextBuildConsole attachConsole() {
		final IConsoleManager consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		XtextBuildConsole consoleFound = this.findConsole(consoleManager);
		if ((consoleFound == null)) {
			XtextBuildConsole.Factory consoleFactory = new NlxBuildConsole.Factory();
			consoleFactory.openConsole();
			return this.findConsole(consoleManager);
		} else {
			return consoleFound;
		}
	}

	protected XtextBuildConsole findConsole(final IConsoleManager consoleManager) {
		return IterableExtensions.<NlxBuildConsole>head(Iterables.<NlxBuildConsole>filter(
				((Iterable<?>) Conversions.doWrapArray(consoleManager.getConsoles())), NlxBuildConsole.class));
	}
	
	public IProgressMonitor getProgressMonitor() {
		return super.getProgressMonitor();
	}

}