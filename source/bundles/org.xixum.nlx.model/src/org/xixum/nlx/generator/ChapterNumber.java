<<<<<<< HEAD:source/de.validas.spedit.iedit.parent/de.validas.spedit.iedit/src/de/validas/spedit/generator/ChapterNumber.java
/**
 * 
 */
package de.validas.spedit.generator;

import de.validas.utils.data.lists.IAppendable;

/**
 * @author Felix Schaller
 *
 */
public class ChapterNumber implements IAppendable {

	/**
	 * 
	 */
	public ChapterNumber(String number) {
		this.number = number;
	}

	protected String number;

	protected IAppendable precessor = null;
	protected IAppendable successor = null;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public IAppendable getSuccessor() {
		return successor;
	}

	@Override
	public void setSuccessor(IAppendable next) {
		successor = next;
	}

	@Override
	public IAppendable getPrecessor() {
		return precessor;
	}

	@Override
	public void setPrecessor(IAppendable previous) {
		precessor = previous;
	}

}
=======
/**
 * 
 */
package org.xixum.nlx.generator;

import org.xixum.utils.data.lists.IAppendable;

/**
 * @author Felix Schaller
 *
 */
public class ChapterNumber implements IAppendable {

	/**
	 * 
	 */
	public ChapterNumber(String number) {
		this.number = number;
	}

	protected String number;

	protected IAppendable precessor = null;
	protected IAppendable successor = null;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public IAppendable getSuccessor() {
		return successor;
	}

	@Override
	public void setSuccessor(IAppendable next) {
		successor = next;
	}

	@Override
	public IAppendable getPrecessor() {
		return precessor;
	}

	@Override
	public void setPrecessor(IAppendable previous) {
		precessor = previous;
	}

}
>>>>>>> 28be792edcf63b5c495498de39713fad9b7858d6:source/org.xixum.nlx.parent/org.xixum.nlx.model/src/org/xixum/nlx/generator/ChapterNumber.java
