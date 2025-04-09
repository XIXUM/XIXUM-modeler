package org.xixum.utils.io.filesystem;

import java.io.File;

public interface IPath extends Cloneable, Comparable<IPath> {

	/**
	 * @param path
	 * @return
	 */
	public static IPath fromOSString(String osPath) {
		//TODO: require factory
		return new AbstractPath(osPath);
	}

	/**
	 * @param path
	 * @return
	 */
	public static IPath fromPortableString(String portablePath) {
		return AbstractPath.parsePortableString(portablePath);
	}
	//TODO: requires static method to call from factory
//	public static IPath parsePortableString(String portablePath) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public int segmentCount();

	public IPath setDevice(String device);

	public boolean isValidSegment(String string);

	public IPath makeUNC(boolean unc);

	public String segment(int i);

	public boolean hasTrailingSeparator();

	String getDevice();

	String getFileExtension();

	boolean isAbsolute();

	boolean isEmpty();

	boolean isRoot();

	boolean isUNC();

	boolean isValidPath(String path);

	String lastSegment();

	String[] segments();

	File toFile();

	String toOSString();

	public IPath makeRelative();

	public IPath makeAbsolute();

	

}
