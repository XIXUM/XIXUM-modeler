/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.utils.data.lists;


public interface IRootAppendable extends IAppendable {
	
	@Override
	default IAppendable getPrecessor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.xixum.utilsData.lists.IAppendable#setSuccessor(org.xixum.utilsData.lists.IAppendable)
	 */
	@Override
	default void setPrecessor(IAppendable next) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Successor for Root Node not possible");
	}

	

}
