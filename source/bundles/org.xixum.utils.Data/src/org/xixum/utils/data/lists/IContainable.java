/**
 * (c) XIXUM.ORG - all rights reserved
 */

package org.xixum.utils.data.lists;

/**
 * Interface that extends appendable objects with the association to container
 * @author schaller
 *
 */

public interface IContainable {
	
	public LinkedList<? extends IAppendable> getContainer();
	
	public <E extends IAppendable> void setContainer(LinkedList<E>  linkedList);

}
