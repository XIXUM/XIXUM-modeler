/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.utils.data.lists;

public interface ILeafAppendable extends IAppendable {

	/* (non-Javadoc)
	 * @see org.xixum.utilsData.lists.IAppendable#getSuccessor()
	 */
	@Override
	default IAppendable getSuccessor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.xixum.utilsData.lists.IAppendable#setSuccessor(org.xixum.utilsData.lists.IAppendable)
	 */
	@Override
	default void setSuccessor(IAppendable next) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Successor for Leaf Node not possible");
	}

}