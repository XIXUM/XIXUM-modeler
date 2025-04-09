/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */
package testSuite.fileUtils;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import org.xixum.utils.io.test.TestPathCreation01;
import org.xixum.utils.io.test.TestPathCreation02;
import org.xixum.utils.io.test.TestPathOperations01;

@RunWith(JUnitPlatform.class)
//@SelectPackages({"org.xixum.utils.io.test"})
@SelectClasses({TestPathCreation01.class, TestPathCreation02.class, TestPathOperations01.class })
public class AllTests {

}