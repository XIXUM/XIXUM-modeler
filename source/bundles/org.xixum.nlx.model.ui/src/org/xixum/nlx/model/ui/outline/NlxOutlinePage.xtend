package org.xixum.nlx.model.ui.outline

import com.google.common.collect.Iterables
import java.util.Collection
import org.apache.log4j.Logger
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeContentProvider
import org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeLabelProvider
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage
import org.xixum.nlx.model.ui.util.NlxDisplayRunHelper
import org.xixum.nlx.model.ui.util.ReflectionUtil

class NlxOutlinePage extends OutlinePage {
	
	Thread thread
	
	protected override refreshViewer(IOutlineNode rootNode, Collection<IOutlineNode> nodesToBeExpanded,
			Collection<IOutlineNode> selectedNodes) {
//		var fields_super = this.getClass.declaredFields
		val labelProvider_super = ReflectionUtil.getPrivateFromSuper(this, "labelProvider") as OutlineNodeLabelProvider
		val contentProvider_super = ReflectionUtil.getPrivateFromSuper(this, "contentProvider") as OutlineNodeContentProvider
		val LOG_super = ReflectionUtil.getPrivateFromSuper(this, "LOG") as Logger
		
		NlxDisplayRunHelper.runAsyncInDisplayThread( new Thread("Tree Viewer") {
			override run() {
				try {
					var treeViewer = getTreeViewer();
					if (!treeViewer.getTree().isDisposed()) {
						getTreeViewer().getTree().setRedraw(false);
						if (treeViewer.getLabelProvider() != labelProvider_super) {
							if (treeViewer.getInput() != null && treeViewer.getContentProvider() != null)
								treeViewer.setInput(null);
							treeViewer.setLabelProvider(labelProvider_super);
						}
						if (treeViewer.getContentProvider() != contentProvider_super) {
							if (treeViewer.getInput() != null && treeViewer.getContentProvider() != null)
								treeViewer.setInput(null);
							treeViewer.setContentProvider(contentProvider_super);
						}
						treeViewer.setInput(rootNode);  //TODO: require interrupt on Input event
						treeViewer.expandToLevel(1);
						treeViewer.setExpandedElements(Iterables.toArray(nodesToBeExpanded, IOutlineNode));
						treeViewer.setSelection(new StructuredSelection(Iterables.toArray(selectedNodes,
								IOutlineNode)));
						var selectionProvider = sourceViewer.getSelectionProvider();
						selectionProvider.setSelection(selectionProvider.getSelection());
						treeUpdated();
					}
				} catch (Throwable t) {
					LOG_super.error("Error refreshing outline", t);
				} finally {
					if (!getTreeViewer().getTree().isDisposed()) {
						getTreeViewer().getTree().setRedraw(true);
					}
				}
			}
		})
	}
	
}