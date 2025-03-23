/**
 * (c) 2025 XIXUM.ORG - all rights reserved
 */
package org.xixum.utils.io.filesystem;

import org.xixum.utils.data.lists.IRootAppendable;

/**
 * @author felixschaller
 * @version 1.0.0
 */

public interface IHost extends IRootAppendable {
	/**
	 * 
	 * @return
	 */
	
	public String getHostName();
	public void setHostName(String name);

}
