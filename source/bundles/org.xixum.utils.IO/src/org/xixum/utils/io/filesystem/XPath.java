/**
 * (c) 2025 XIXUM.ORG - all rights reserved
 */
package org.xixum.utils.io.filesystem;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.xixum.utils.data.lists.IAppendable;
import org.xixum.utils.data.lists.LinkedList;

/**
 * Extension Class of org.eclipse.core.runtime.Path
 * @author felix.schaller
 */

public class XPath {
	
	LinkedList<IAppendable> pathElements = null;
	Path emfPath;
	PathFactory pathFactory = new PathFactory();

	public XPath(String fullPath) {

		emfPath = new Path(Paths.get(fullPath).normalize().toString());

		pathElements = new LinkedList<IAppendable>();
		String device = getDevice();
		Iterator<String> iterator = Arrays.asList(this.segments()).iterator();

		if (device != null)
			pathElements.add(pathFactory.createDevice(device));

		if (isUNC() && iterator.hasNext()) {
			pathElements.add(pathFactory.createHost(iterator.next()));
		}

		addPathElements(iterator);

	}

	public boolean isUNC() {
		return emfPath.isUNC();
	}

	public String[] segments() {
		return emfPath.segments();
	}
	
	private String getDevice() {
		return emfPath.getDevice();
	}

	public XPath(String device, String path) {

		emfPath = new Path(device, path);
		pathElements = new LinkedList<IAppendable>();
		String internaldevice = getDevice();
		Iterator<String> iterator = Arrays.asList(this.segments()).iterator();

		if (internaldevice != null)
			pathElements.add(pathFactory.createDevice(internaldevice));
		else if (isUNC() && iterator.hasNext()) {
			pathElements.add(pathFactory.createHost(iterator.next()));
		}

		addPathElements(iterator);
	}

	private void addPathElements(Iterator<String> iterator) {

		while (iterator.hasNext()) {
			String segment = iterator.next();
			if (iterator.hasNext())
				pathElements.add(pathFactory.createDirOrUnc((PathElement) getLastPathElement(), segment));
			else
				addDirectoryOrFile(segment);
		}

	}

	private void addDirectoryOrFile(String segment) {
		java.io.File file = emfPath.toFile();
		if (file.exists()) {
			if (file.isFile())
				pathElements.add(pathFactory.createFile(segment));
			else 
				pathElements.add(pathFactory.createDirOrUnc((PathElement) getLastPathElement(), segment));
			
		} else {
			if (getFileExtension() != null)
				pathElements.add(pathFactory.createFile(segment));
			else
				pathElements.add(pathFactory.createDirOrUnc((PathElement) getLastPathElement(), segment));
		}
	}

	public IAppendable getPathElement(int index) {
		int maxIndex = pathElements.size() - 1;
		if (index < 0 || index > maxIndex)
			throw new IndexOutOfBoundsException(
					String.format("Access Error Index: %1$d outside Bounds of %2$d", index, maxIndex));
		return pathElements.get(index);
	}

	public IAppendable getLastPathElement() {
		if (pathElements.size() == 0)
			return null;
		return getPathElement(pathElements.size() - 1);
	}

	public java.io.File toFilePath() {
		return ((PathElement) getLastPathElement()).buildPath();
	}

	public boolean exists() {
		PathElement last = ((PathElement) getLastPathElement());
		// TODO: relative path will not work
		return last.exists();

	}
	
	public String getFileExtension() {
		if (hasTrailingSeparator()) {
			return null;
		}
		String lastSegment = lastSegment();
		if (lastSegment == null) {
			return null;
		}
		int index = lastSegment.lastIndexOf('.');
		if (index == -1) {
			return null;
		}
		return lastSegment.substring(index + 1);
	}
	
	public String lastSegment() {
		return emfPath.lastSegment();
	}

	public IPath append(String segment) {
		return emfPath.append(segment);
	}

	public void prepend(String path) {
		if (!emfPath.isAbsolute()) {
			XPath absolute = new XPath(path);
			pathElements.addAll(0, absolute.getAllElements());
		}
	}
	
	public boolean hasTrailingSeparator() {
		return emfPath.hasTrailingSeparator();
	}

	private Collection<? extends IAppendable> getAllElements() {
		return pathElements;
	}

	public int size() {
		return pathElements.size();
	}

	public int length() {
		return size();
	}
}