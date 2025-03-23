<<<<<<< HEAD:source/de.validas.utils.IO.test/test-src/testSuite/fileUtils/AllTests.java
package testSuite.fileUtils;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import de.validas.utils.io.test.TestPathCreation01;
import de.validas.utils.io.test.TestPathCreation02;
import de.validas.utils.io.test.TestPathOperations01;

@RunWith(JUnitPlatform.class)
//@SelectPackages({"de.validas.utils.io.test"})
@SelectClasses({TestPathCreation01.class, TestPathCreation02.class, TestPathOperations01.class })
public class AllTests {

}
=======
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
>>>>>>> 28be792edcf63b5c495498de39713fad9b7858d6:source/org.xixum.utils.IO.test/test-src/testSuite/fileUtils/AllTests.java
