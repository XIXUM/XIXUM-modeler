/**
 * 
 */
package org.xixum.utils.data.util;

/**
 * @author schaller
 *
 */
import java.lang.reflect.Field;
/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

public class ClassUtil {

	/**
	 * Static Methods for Classes
	 */
	
	public static Object getOuterClassInstOfAnonymous(Object obj){
		Class <?> inner = obj.getClass();
		if (!inner.isAnonymousClass()) return null;
		Field field = null;
		try {
			field = inner.getDeclaredField("this$0");
			field.setAccessible(true);
			return field.get(obj);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}