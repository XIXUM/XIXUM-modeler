<<<<<<< HEAD:source/de.validas.spedit.iedit.parent/de.validas.nlx.ai/src/de/validas/nlx/ai/IDbAccess.java
package de.validas.nlx.ai;

import java.util.List;

import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Record;
import com.google.inject.ImplementedBy;

import de.validas.nlx.ai.neo4j.Neo4jAccess;
import de.validas.nlx.ai.neo4j.Neo4jAccess.Action;

@ImplementedBy(Neo4jAccess.class)
public interface IDbAccess {
	
	public Driver connectToDatabase(String uri, String user, String pass);
	
	public String runCodeString(String input, Action action);
	public List<Record> runCodeRecords(String input, Action action);
	
	@Deprecated
	public boolean ensureDbConnect();

	public abstract boolean isConnected();

}
=======
package org.xixum.nlx.ai;

import java.util.List;

import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Record;
import com.google.inject.ImplementedBy;

import org.xixum.nlx.ai.neo4j.Neo4jAccess;
import org.xixum.nlx.ai.neo4j.Neo4jAccess.Action;

@ImplementedBy(Neo4jAccess.class)
public interface IDbAccess {
	
	public Driver connectToDatabase(String uri, String user, String pass);
	
	public String runCodeString(String input, Action action);
	public List<Record> runCodeRecords(String input, Action action);
	
	@Deprecated
	public boolean ensureDbConnect();

	public abstract boolean isConnected();

}
>>>>>>> 28be792edcf63b5c495498de39713fad9b7858d6:source/org.xixum.nlx.parent/org.xixum.nlx.ai/src/org/xixum/nlx/ai/IDbAccess.java
