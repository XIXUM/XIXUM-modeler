/**
 * (c) XIXUM.ORG - all rights reserved
 */
package org.xixum.utils.io.filesystem;

/**
 * @author Felix Schaller
 *
 */
public class LocalDevice extends PathElement implements ILocalDevice {

	/**
	 * @param name
	 */
	public LocalDevice(String name) {
		super(name);
	}
	/* (non-Javadoc)
	 * @see org.xixum.utils.io.filesystem.IDevice#getDeviceName()
	 */
	@Override
	public String getDeviceName() {		
		return name;
	}
	
	public void setDeviceName(String name) {
		this.name = name;
	}

}