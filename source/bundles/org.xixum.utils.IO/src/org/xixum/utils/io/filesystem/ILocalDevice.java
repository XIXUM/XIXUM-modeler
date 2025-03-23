/**
 * (c) 2025 XIXUM.ORG - all rights reserved
 */
package org.xixum.utils.io.filesystem;

/**
 * @author felix.schaller
 */

import org.xixum.utils.data.lists.IRootAppendable;

public interface ILocalDevice extends IRootAppendable {
	
	public String getDeviceName();
	public void setDeviceName(String name);
}