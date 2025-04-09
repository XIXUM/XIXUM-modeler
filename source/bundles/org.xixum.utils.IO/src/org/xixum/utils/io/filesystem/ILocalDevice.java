/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.utils.io.filesystem;

import org.xixum.utils.data.lists.IRootAppendable;

public interface ILocalDevice extends IRootAppendable {
	
	public String getDeviceName();
	public void setDeviceName(String name);
}
