/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */

package org.xixum.neo4j.driver;

import com.google.inject.ImplementedBy;
import java.util.List;

import org.neo4j.driver.Record;
import org.neo4j.driver.Driver;
import org.xixum.neo4j.driver.Neo4jAccess.Action;

@ImplementedBy(Neo4jAccess.class)
public interface IDbAccess {
	
	public Driver connectToDatabase(String uri, String user, String pass);
	
	public String runCodeString(String input, Action action);
	public List<Record> runCodeRecords(String input, Action action);
	
	@Deprecated
	public boolean ensureDbConnect();

	public abstract boolean isConnected();

}