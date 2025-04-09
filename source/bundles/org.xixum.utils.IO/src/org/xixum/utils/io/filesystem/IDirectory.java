/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.utils.io.filesystem;

import org.xixum.utils.data.lists.IAppendable;

public interface IDirectory extends IAppendable{

	public String getName();
	public void setName(String name);
	public boolean exists();

}
