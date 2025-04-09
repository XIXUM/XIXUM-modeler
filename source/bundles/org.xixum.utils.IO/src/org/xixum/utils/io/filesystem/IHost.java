
package org.xixum.utils.io.filesystem;

import org.xixum.utils.data.lists.IRootAppendable;

public interface IHost extends IRootAppendable {
	
	public String getHostName();
	public void setHostName(String name);

}
