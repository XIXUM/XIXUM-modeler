<<<<<<< HEAD:source/de.validas.spedit.iedit.parent/de.validas.nlx.ai/xtend-src/de/validas/nlx/ai/util/Arrow.xtend
package de.validas.nlx.ai.util

import de.validas.nlx.constants.Direction
import java.util.Map
import com.google.common.collect.ComputationException

class Arrow {
	
	String varName
	String classT
	Direction direction
	Map<String, String> attribs
	boolean quotes
	boolean usePath
	String min
	String max
	
	new(String varName, String classT, Direction direction) {
		this(varName, classT, null, true, direction)
	}
	
	new(String varName, String classT, Map<String, String> attribs, boolean useQuotes, Direction direction) {
		this(varName, classT, attribs, null, null, false, useQuotes, direction)
	}
	
	new(String varName, String classT, Map<String, String> attribs, String min, String max, boolean usePath, boolean useQuotes, Direction direction) {
		this.varName = varName
		this.classT = classT
		this.direction = direction
		this.attribs = attribs
		this.min = min
		this.max = max
//		if (min !== null && max == null)
//			throw new ComputationException(new Throwable("if 'min' specified, then 'max' is required"))  //TODO: convert into constant
		this.quotes = useQuotes
		this.usePath = usePath
	}
	
	def getVarName(){
		varName
	}
	
	def getClassT(){
		classT
	}
	
	def getDirection(){
		direction
	}
	
	def generate(){
//		for (attr: attribs.keySet){
//			
//		}
		'''«IF (direction == Direction.LEFT)
			»<-«
		ELSE
			»-«
		ENDIF
		»[«
		IF varName!== null»«varName»«
		ENDIF»«
		IF classT !== null»:«classT»«
		ENDIF» «
		IF(attribs!== null && !attribs.empty)»{«
			FOR attr: attribs.keySet SEPARATOR ", "»«attr»:«
				IF quotes»"«attribs.get(attr)»"«
				ELSE»«attribs.get(attr)»«ENDIF»«
			ENDFOR»}«
		ENDIF»«
		IF usePath»*«
			IF min !== null »«min»..«
			ENDIF»«
			IF max !== null »«max»«
			ENDIF»«
		ENDIF»]«
		IF(direction == Direction.RIGHT)
			»->«
		ELSE
			»-«
		ENDIF»'''
	}
	
}
=======
package org.xixum.nlx.ai.util

import org.xixum.nlx.constants.Direction
import java.io.Serializable
import java.util.Map

class Arrow {
	
	String varName
	String classT
	Direction direction
	Map<String, Serializable> attribs
	//boolean quotes
	boolean usePath
	String min
	String max
	
	new(String varName, String classT, Direction direction) {
		this(varName, classT, null, true, direction)
	}
	
	new(String varName, String classT, Map<String, Serializable> attribs, Direction direction) {
		this(varName, classT, attribs, null, null, false, direction)
	}
	
	
	/**
	 * @Deprecated
	 * deprecated interface because useQuotes is determined dynamically
	 */
	@Deprecated
	new(String varName, String classT, Map<String, Serializable> attribs, boolean useQuotes, Direction direction) {
		this(varName, classT, attribs, null, null, false, direction)
	}
	
	@Deprecated
	new(String varName, String classT, Map<String, Serializable> attribs, String min, String max, boolean usePath, boolean useQuotes, Direction direction) {
		this(varName, classT, attribs, min, max, usePath, direction)
	}
	
	new(String varName, String classT, Map<String, Serializable> attribs, String min, String max, boolean usePath, Direction direction) {
		this.varName = varName
		this.classT = classT
		this.direction = direction
		this.attribs = attribs
		this.min = min
		this.max = max
//		if (min !== null && max == null)
//			throw new ComputationException(new Throwable("if 'min' specified, then 'max' is required"))  //TODO: convert into constant
		//this.quotes = useQuotes
		this.usePath = usePath
	}
	
	def getVarName(){
		varName
	}
	
	def getClassT(){
		classT
	}
	
	def getDirection(){
		direction
	}
	
	def generate(){
//		for (attr: attribs.keySet){
//			
//		}
		'''«IF (direction == Direction.LEFT)
			»<-«
		ELSE
			»-«
		ENDIF
		»[«
		IF varName!== null»«varName»«
		ENDIF»«
		IF classT !== null»:«classT»«
		ENDIF» «
		IF(attribs!== null && !attribs.empty)»{«
			FOR attr: attribs.keySet SEPARATOR ", "»«attr»:«
				IF requirequotes(attribs.get(attr))»"«attribs.get(attr)»"«
				ELSE»«attribs.get(attr)»«ENDIF»«
			ENDFOR»}«
		ENDIF»«
		IF usePath»*«
			IF min !== null »«min»..«
			ENDIF»«
			IF max !== null »«max»«
			ENDIF»«
		ENDIF»]«
		IF(direction == Direction.RIGHT)
			»->«
		ELSE
			»-«
		ENDIF»'''
	}
	
	def requirequotes(Serializable attr) {
		switch(attr){
			Number:{
				false
			}
			CharSequence:{
				!attr.chars.anyMatch(x | x.equals('"'))
			}
			default:{
				true
			}
		}
	}
	
}
>>>>>>> 28be792edcf63b5c495498de39713fad9b7858d6:source/org.xixum.nlx.parent/org.xixum.nlx.ai/xtend-src/org/xixum/nlx/ai/util/Arrow.xtend
