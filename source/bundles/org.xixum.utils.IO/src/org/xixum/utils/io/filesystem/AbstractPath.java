/**
 * 
 */
package org.xixum.utils.io.filesystem;

import java.io.File;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.Path;
import org.xixum.utils.io.filesystem.IPath;
/**
 * 
 */
public class AbstractPath implements IPath, Cloneable {

	/**
	 * 
	 */
	private static final int HAS_LEADING = 1;
	private static final int IS_UNC = 2;
	private static final int HAS_TRAILING = 4;
	private static final int IS_FOR_WINDOWS = 8;

	private static final int ALL_SEPARATORS = HAS_LEADING | IS_UNC | HAS_TRAILING;
	
	public static final IPath EMPTY = Constants.empty();
	
	public static final IPath ROOT = Constants.root();
	private final String device;
	private final String[] segments;
	// private int hash;
	private final byte flags;
	
	public static final char SEPARATOR = '/';
	public static final char DEVICE_SEPARATOR = ':';

	static class Constants {
		
		static final boolean RUNNING_ON_WINDOWS = java.io.File.separatorChar == '\\';
		static final String[] NO_SEGMENTS = new String[0];
		
		//TODO: require factory
		private static IPath empty = new AbstractPath(""); //$NON-NLS-1$
		private static IPath root = new AbstractPath("/"); //$NON-NLS-1$

		static synchronized IPath empty() {
			if (empty == null) {
				empty = new AbstractPath(""); //$NON-NLS-1$
			}
			return empty;
		}

		static synchronized IPath root() {
			if (root == null) {
				root = new AbstractPath("/"); //$NON-NLS-1$
			}
			return root;
		}
	}
	
	/**
	 * @param device
	 * @param segments
	 */
	public AbstractPath(String fullPath) {
		this(fullPath, Constants.RUNNING_ON_WINDOWS);
	}
	
	public AbstractPath(String device, String path) {
		this(device, backslashToForward(path, Constants.RUNNING_ON_WINDOWS), Constants.RUNNING_ON_WINDOWS);
	}
	
	/**
	 * @param device2
	 * @param newSegments
	 * @param flags2
	 */
	public AbstractPath(String device, String[] segments, int flags) {
		int flag = flags;
		if (segments.length == 0) {
			flag &= ~HAS_TRAILING;
		}
		this.segments = segments;
		this.device = device;
		this.flags = (byte) flag;
	}
	
	private AbstractPath(String deviceString, String path, boolean forWindows) {
		Assert.isNotNull(path);
		String collapsedPath = collapseSlashes(deviceString, path);
		int flag = computeFlags(collapsedPath, forWindows);
		// compute segments and ensure canonical form
		String[] canonicalSegments = canonicalize((flag & HAS_LEADING) != 0, computeSegments(collapsedPath));
		if (canonicalSegments.length == 0) {
			// paths of length 0 have no trailing separator
			flag &= ~HAS_TRAILING;
		}
		this.device = deviceString;
		this.segments = canonicalSegments;
		this.flags = (byte) flag;
	}
	
	private static int computeFlags(String path, boolean forWindows) {
		int len = path.length();
		int flags;
		if (len < 2) {
			if (len == 1 && path.charAt(0) == SEPARATOR) {
				flags = HAS_LEADING;
			} else {
				flags = 0;
			}
		} else {
			boolean hasLeading = path.charAt(0) == SEPARATOR;
			boolean isUNC = hasLeading && path.charAt(1) == SEPARATOR;
			boolean hasTrailing = !(isUNC && len == 2) && path.charAt(len - 1) == SEPARATOR;
			flags = hasLeading ? HAS_LEADING : 0;
			if (isUNC)
				flags |= IS_UNC;
			if (hasTrailing)
				flags |= HAS_TRAILING;
		}
		if (forWindows) {
			flags |= IS_FOR_WINDOWS;
		}
		return flags;
	}
	
	
	/**
	 * @param fullPath
	 * @param runningOnWindows
	 */
    private AbstractPath(String fullPath, boolean forWindows) {
    	String devicePart = null;
		if (forWindows) {
			// convert backslash to forward slash
			fullPath = fullPath.replace('\\', SEPARATOR);
			// extract device
			int i = fullPath.indexOf(DEVICE_SEPARATOR);
			if (i != -1) {
				// remove leading slash from device part to handle output of URL.getFile()
				int start = fullPath.charAt(0) == SEPARATOR ? 1 : 0;
				devicePart = fullPath.substring(start, i + 1);
				fullPath = fullPath.substring(i + 1, fullPath.length());
			}
		}

		Assert.isNotNull(fullPath);
		String collapsedPath = collapseSlashes(devicePart, fullPath);
		int flag = computeFlags(collapsedPath, forWindows);
		// compute segments and ensure canonical form
		String[] canonicalSegments = canonicalize((flag & HAS_LEADING) != 0, computeSegments(collapsedPath));
		if (canonicalSegments.length == 0) {
			// paths of length 0 have no trailing separator
			flag &= ~HAS_TRAILING;
		}
		this.device = devicePart;
		this.segments = canonicalSegments;
		this.flags = (byte) flag;
    }
	
	private static String backslashToForward(String path, boolean forWindows) {
		if (forWindows) {
			return path.replace('\\', SEPARATOR);
		}
		return path;
	}
	
	private static String collapseSlashes(String device, String path) {
		int length = path.length();
		if (length < 3)
			return path;
		if (path.indexOf("//", 1) == -1) //$NON-NLS-1$
			return path;
		// We found an occurrence of // in the path so do the slow collapse.
		char[] result = new char[path.length()];
		int count = 0;
		boolean hasPrevious = false;
		char[] characters = path.toCharArray();
		for (int index = 0; index < characters.length; index++) {
			char c = characters[index];
			if (c == SEPARATOR) {
				if (hasPrevious) {
					// skip double slashes, except for beginning of UNC.
					// note that a UNC path can't have a device.
					if (device == null && index == 1) {
						result[count] = c;
						count++;
					}
				} else {
					hasPrevious = true;
					result[count] = c;
					count++;
				}
			} else {
				hasPrevious = false;
				result[count] = c;
				count++;
			}
		}
		return new String(result, 0, count);
	}
	
	private static String[] computeSegments(String path) {
		// performance sensitive --- avoid creating garbage
		int segmentCount = computeSegmentCount(path);
		if (segmentCount == 0)
			return Constants.NO_SEGMENTS;
		String[] newSegments = new String[segmentCount];
		int len = path.length();
		// check for initial slash
		int firstPosition = (path.charAt(0) == SEPARATOR) ? 1 : 0;
		// check for UNC
		if (firstPosition == 1 && len > 1 && (path.charAt(1) == SEPARATOR))
			firstPosition = 2;
		int lastPosition = (path.charAt(len - 1) != SEPARATOR) ? len - 1 : len - 2;
		// for non-empty paths, the number of segments is
		// the number of slashes plus 1, ignoring any leading
		// and trailing slashes
		int next = firstPosition;
		for (int i = 0; i < segmentCount; i++) {
			int start = next;
			int end = path.indexOf(SEPARATOR, next);
			if (end == -1) {
				newSegments[i] = path.substring(start, lastPosition + 1);
			} else {
				newSegments[i] = path.substring(start, end);
			}
			next = end + 1;
		}
		return newSegments;
	}
	
	private static int computeSegmentCount(String path) {
		int len = path.length();
		if (len == 0 || (len == 1 && path.charAt(0) == SEPARATOR)) {
			return 0;
		}
		int count = 1;
		int prev = -1;
		int i;
		while ((i = path.indexOf(SEPARATOR, prev + 1)) != -1) {
			if (i != prev + 1 && i != len) {
				++count;
			}
			prev = i;
		}
		if (path.charAt(len - 1) == SEPARATOR) {
			--count;
		}
		return count;
	}
	
	private static String[] canonicalize(boolean isAbsolute, String[] segments) {
		// look for segments that need canonicalizing
		for (String segment : segments) {
			if (segment.charAt(0) == '.' && (segment.equals("..") || segment.equals("."))) { //$NON-NLS-1$ //$NON-NLS-2$
				// path needs to be canonicalized
				return collapseParentReferences(isAbsolute, segments);
			}
		}
		return segments;
	}
	
	private static String[] collapseParentReferences(boolean isAbsolute, String[] segments) {
		int segmentCount = segments.length;
		String[] stack = new String[segmentCount];
		int stackPointer = 0;
		for (int i = 0; i < segmentCount; i++) {
			String segment = segments[i];
			if (segment.equals("..")) { //$NON-NLS-1$
				if (stackPointer == 0) {
					// if the stack is empty we are going out of our scope
					// so we need to accumulate segments. But only if the original
					// path is relative. If it is absolute then we can't go any higher than
					// root so simply toss the .. references.
					if (!isAbsolute)
						stack[stackPointer++] = segment; // stack push
				} else {
					// if the top is '..' then we are accumulating segments so don't pop
					if ("..".equals(stack[stackPointer - 1])) //$NON-NLS-1$
						stack[stackPointer++] = ".."; //$NON-NLS-1$
					else
						stackPointer--;
					// stack pop
				}
				// collapse current references
			} else if (!segment.equals(".") || segmentCount == 1) //$NON-NLS-1$
				stack[stackPointer++] = segment; // stack push
		}
		// if the number of segments hasn't changed, then no modification needed
		if (stackPointer == segmentCount)
			return segments;
		// build the new segment array backwards by popping the stack
		String[] newSegments = new String[stackPointer];
		System.arraycopy(stack, 0, newSegments, 0, stackPointer);
		return newSegments;
	}

	public IPath addFileExtension(String extension) {
		if (isRoot() || isEmpty() || hasTrailingSeparator())
			return this;
		int len = segments.length;
		String[] newSegments = new String[len];
		System.arraycopy(segments, 0, newSegments, 0, len - 1);
		newSegments[len - 1] = segments[len - 1] + '.' + extension;
		//TODO: require factory
		return new AbstractPath(device, newSegments, flags);
	}



	public IPath addTrailingSeparator() {
		if (hasTrailingSeparator() || isRoot()) {
			return this;
		}
		if (isEmpty()) {
			//TODO: require factory
			return new AbstractPath(device, segments, (flags & IS_FOR_WINDOWS) | HAS_LEADING);
		}
		//TODO : require factory
		return new AbstractPath(device, segments, flags | HAS_TRAILING);
	}

	public IPath append(IPath tail) {

		if (tail == null || tail.segmentCount() == 0)
			return this;

		if (this.isEmpty() && ((flags & IS_FOR_WINDOWS) == 0) == tail.isValidSegment(":")) //$NON-NLS-1$
			return tail.setDevice(device).makeRelative().makeUNC(isUNC());
		if (this.isRoot() && ((flags & IS_FOR_WINDOWS) == 0) == tail.isValidSegment(":")) //$NON-NLS-1$
			return tail.setDevice(device).makeAbsolute().makeUNC(isUNC());
		int myLen = segments.length;
		int tailLen = tail.segmentCount();
		String[] newSegments = new String[myLen + tailLen];
		System.arraycopy(segments, 0, newSegments, 0, myLen);
		for (int i = 0; i < tailLen; i++) {
			newSegments[myLen + i] = tail.segment(i);
		}
		String tailFirstSegment = newSegments[myLen];
		if (tailFirstSegment.equals("..") || tailFirstSegment.equals(".")) { //$NON-NLS-1$ //$NON-NLS-2$
			newSegments = canonicalize(isAbsolute(), newSegments);
		}
		//TODO: require factory
		return new AbstractPath(device, newSegments,
				(flags & (HAS_LEADING | IS_UNC | IS_FOR_WINDOWS)) | (tail.hasTrailingSeparator() ? HAS_TRAILING : 0));
	}
	
	public IPath append(String tail) {
		// optimize addition of a single segment
		if (tail.indexOf(SEPARATOR) == -1 && tail.indexOf('\\') == -1 && tail.indexOf(DEVICE_SEPARATOR) == -1) {
			int tailLength = tail.length();
			if (tailLength < 3) {
				// some special cases
				if (tailLength == 0 || ".".equals(tail)) { //$NON-NLS-1$
					return this;
				}
				if ("..".equals(tail)) //$NON-NLS-1$
					return removeLastSegments(1);
			}
			// just add the segment
			int myLen = segments.length;
			String[] newSegments = new String[myLen + 1];
			System.arraycopy(segments, 0, newSegments, 0, myLen);
			newSegments[myLen] = tail;
			//TODO: require factory
			return new AbstractPath(device, newSegments, flags & ~HAS_TRAILING);
		}
		// TODO: require factory
		return append(new AbstractPath(tail, (flags & IS_FOR_WINDOWS) != 0));
	}

	private IPath removeLastSegments(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(IPath o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	static IPath parsePortableString(String pathString) {
		int firstMatch = pathString.indexOf(DEVICE_SEPARATOR) + 1;
		// no extra work required if no device characters
		if (firstMatch <= 0)
			//TODO: require factory
			return new AbstractPath(null, pathString, Constants.RUNNING_ON_WINDOWS);
		// if we find a single colon, then the path has a device
		String devicePart = null;
		int pathLength = pathString.length();
		if (firstMatch == pathLength || pathString.charAt(firstMatch) != DEVICE_SEPARATOR) {
			devicePart = pathString.substring(0, firstMatch);
			pathString = pathString.substring(firstMatch, pathLength);
		}
		// optimize for no colon literals
		if (pathString.indexOf(DEVICE_SEPARATOR) == -1)
			//TODO: require factory
			return new AbstractPath(devicePart, pathString, Constants.RUNNING_ON_WINDOWS);
		// contract colon literals
		char[] chars = pathString.toCharArray();
		int readOffset = 0, writeOffset = 0, length = chars.length;
		while (readOffset < length) {
			if (chars[readOffset] == DEVICE_SEPARATOR && ++readOffset >= length) {
				break;
			}
			chars[writeOffset++] = chars[readOffset++];
		}
		//TODO: require factory
		return new AbstractPath(devicePart, new String(chars, 0, writeOffset), Constants.RUNNING_ON_WINDOWS);
	}
	

	@Override
	public String getDevice() {
		return device;
	}

	@Override
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

	@Override
	public boolean hasTrailingSeparator() {
		return (flags & HAS_TRAILING) != 0;
	}

	@Override
	public boolean isAbsolute() {
		return (flags & HAS_LEADING) != 0;
	}

	@Override
	public boolean isEmpty() {
		return segments.length == 0 && ((flags & ALL_SEPARATORS) != HAS_LEADING);
	}

//	@Override
//	public boolean isPrefixOf(IPath anotherPath) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean isRoot() {
		return this == ROOT || (segments.length == 0 && ((flags & ALL_SEPARATORS) == HAS_LEADING));
	}

	@Override
	public boolean isUNC() {
		if (device != null)
			return false;
		return (flags & IS_UNC) != 0;
	}

	@Override
	public boolean isValidPath(String path) {
		return isValidPath(path, (flags & IS_FOR_WINDOWS) != 0);
	}

	private boolean isValidPath(String path, boolean forWindows){
		//TODO: require factory
		IPath test = new AbstractPath(path, forWindows);
		for (int i = 0, max = test.segmentCount(); i < max; i++)
			if (!AbstractPath.isValidSegment(test.segment(i), forWindows))
				return false;
		return true;
	}

	@Override
	public boolean isValidSegment(String segment) {
		return isValidSegment(segment, (flags & IS_FOR_WINDOWS) != 0);
	}

	private static boolean isValidSegment(String segment, boolean forWindows) {
		int size = segment.length();
		if (size == 0)
			return false;
		for (int i = 0; i < size; i++) {
			char c = segment.charAt(i);
			if (c == '/')
				return false;
			if (forWindows && (c == '\\' || c == ':'))
				return false;
		}
		return true;
	}

	@Override
	public String lastSegment() {
		int len = segments.length;
		return len == 0 ? null : segments[len - 1];
	}

//	@Override
//	public IPath makeAbsolute() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IPath makeRelative() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IPath makeRelativeTo(IPath base) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IPath makeUNC(boolean toUNC) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int matchingFirstSegments(IPath anotherPath) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public IPath removeFileExtension() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IPath removeFirstSegments(int count) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IPath removeLastSegments(int count) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IPath removeTrailingSeparator() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String segment(int index) {
		if (index >= segments.length)
			return null;
		return segments[index];
	}

	@Override
	public int segmentCount() {
		return segments.length;
	}

	@Override
	public String[] segments() {
		String[] segmentCopy = new String[segments.length];
		System.arraycopy(segments, 0, segmentCopy, 0, segments.length);
		return segmentCopy;
	}

	@Override
	public IPath setDevice(String value) {
		if (value != null) {
			Assert.isTrue(value.indexOf(DEVICE_SEPARATOR) == (value.length() - 1),
					"Last character should be the device separator"); //$NON-NLS-1$
		}
		if (value == device || (value != null && value.equals(device)))
			return this;

		return new AbstractPath(value, segments, flags);
	}

	@Override
	public File toFile() {
		return new File(toOSString());
	}

	@Override
	public String toOSString() {
		int resultSize = computeLength();
		if (resultSize <= 0)
			return ""; //$NON-NLS-1$
		char FILE_SEPARATOR = File.separatorChar;
		char[] result = new char[resultSize];
		int offset = 0;
		if (device != null) {
			int size = device.length();
			device.getChars(0, size, result, offset);
			offset += size;
		}
		if ((flags & HAS_LEADING) != 0)
			result[offset++] = FILE_SEPARATOR;
		if ((flags & IS_UNC) != 0)
			result[offset++] = FILE_SEPARATOR;
		int len = segments.length - 1;
		if (len >= 0) {
			// append all but the last segment, with file separators
			for (int i = 0; i < len; i++) {
				int size = segments[i].length();
				segments[i].getChars(0, size, result, offset);
				offset += size;
				result[offset++] = FILE_SEPARATOR;
			}
			// append the last segment
			int size = segments[len].length();
			segments[len].getChars(0, size, result, offset);
			offset += size;
		}
		if ((flags & HAS_TRAILING) != 0)
			result[offset++] = FILE_SEPARATOR;
		return new String(result);
	}
	
	private int computeLength() {
		int length = 0;
		if (device != null)
			length += device.length();
		if ((flags & HAS_LEADING) != 0)
			length++;
		if ((flags & IS_UNC) != 0)
			length++;
		int max = segments.length;
		if (max > 0) {
			for (int i = 0; i < max; i++) {
				length += segments[i].length();
			}
			length += max - 1;
		}
		if ((flags & HAS_TRAILING) != 0)
			length++;
		return length;
	}

	@Override
	public IPath makeUNC(boolean toUNC) {
		// if we are already in the right form then just return
		if (!(toUNC ^ isUNC()))
			return this;

		int newSeparators = this.flags;
		if (toUNC) {
			newSeparators |= HAS_LEADING | IS_UNC;
		} else {
			// mask out the UNC bit
			newSeparators &= HAS_LEADING | HAS_TRAILING | IS_FOR_WINDOWS;
		}
		//TODO: require factory
		return new AbstractPath(toUNC ? null : device, segments, newSeparators);
	}

	@Override
	public IPath makeRelative() {
		if (!isAbsolute()) {
			return this;
		}
		//TODO: require factory
		return new AbstractPath(device, segments, flags & (HAS_TRAILING | IS_FOR_WINDOWS));
	}

	@Override
	public IPath makeAbsolute() {
		if (isAbsolute()) {
			return this;
		}
		String[] newSegments = segments;
		// may need canonicalizing if it has leading ".." or "." segments
		if (segments.length > 0) {
			String first = segments[0];
			if (first.equals("..") || first.equals(".")) { //$NON-NLS-1$ //$NON-NLS-2$
				newSegments = canonicalize(true, segments);
			}
		}
		//TODO: require factory
		return new AbstractPath(device, newSegments, flags | HAS_LEADING);
	}

//	@Override
//	public String toPortableString() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IPath uptoSegment(int count) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	


	

			
}
