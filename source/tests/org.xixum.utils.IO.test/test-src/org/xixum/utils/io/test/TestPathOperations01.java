<<<<<<< HEAD:source/de.validas.utils.IO.test/test-src/de/validas/utils/io/test/TestPathOperations01.java
package de.validas.utils.io.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.validas.utils.io.filesystem.Path;

public class TestPathOperations01 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPathCreation_getFile01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\de.validas.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// get File
		// Get Extension
		assertNotNull(testPath);
	}

	@Test
	void testPathCreation_getExtension01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\de.validas.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// get File
		// Get Extension
		assertNotNull(testPath);
	}
	
	@Test
	void testPathCreation_replaceExtension01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\de.validas.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// replace Extension
		assertNotNull(testPath);
	}
	
}
=======
package org.xixum.utils.io.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.xixum.utils.io.filesystem.Path;

public class TestPathOperations01 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPathCreation_getFile01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\org.xixum.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// get File
		// Get Extension
		assertNotNull(testPath);
	}

	@Test
	void testPathCreation_getExtension01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\org.xixum.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// get File
		// Get Extension
		assertNotNull(testPath);
	}
	
	@Test
	void testPathCreation_replaceExtension01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\org.xixum.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// replace Extension
		assertNotNull(testPath);
	}
	
}
>>>>>>> 28be792edcf63b5c495498de39713fad9b7858d6:source/org.xixum.utils.IO.test/test-src/org/xixum/utils/io/test/TestPathOperations01.java
