/**
 * Link Processor Class. Queries Database for Link rules or creates new rules
 * (c) 2025 licensed under Eclipse Public License 2.0
 * XIXUM.ORG
 * @author Felix schaller
 */

package org.xixum.neo4j.driver;

import static org.xixum.neo4j.driver.constants.Neo4jConstants.DB_PASS;
import static org.xixum.neo4j.driver.constants.Neo4jConstants.DB_URI;
import static org.xixum.neo4j.driver.constants.Neo4jConstants.DB_USER;

import java.util.List;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.TransactionCallback;
import org.neo4j.driver.TransactionContext;
import org.neo4j.driver.exceptions.ServiceUnavailableException;



public class Neo4jAccess implements IDbAccess {
	
	// default credentials
	
	protected String uri;
	protected String user;
	protected String pass;
	
	
	protected Driver driver;
	
	protected boolean dbConnected = false;
	protected boolean dbInit = false;
	
	public enum Action {
		WRITE,
		READ;
	}
	
	public Neo4jAccess() {
		this (DB_URI, DB_USER, DB_PASS);
	}

	public Neo4jAccess(String uri, String user, String pass) {
		driver = connectToDatabase(uri, user, pass);
		this.uri = uri;
		this.user = user;
		this.pass = pass;
		if (driver != null)
			dbConnected = driver.session().isOpen();
	}
	
	public Driver connectToDatabase(String uri, String user, String pass) {
		Driver driver;  
		try {
			driver = GraphDatabase.driver(uri, AuthTokens.basic(user, pass) );
			if (driver != null)
				dbInit  = true;
			return driver;	
		} catch (ServiceUnavailableException e) {
			return null;
		}
	}
	/**
	 * returns a String as query result
	 * @param input
	 * @param action
	 * @return
	 */
	public String runCodeString(String input, Action action)
    {
    	try ( Session session = driver.session() )
    	{
    		TransactionCallback<String> txWork = new TransactionCallback<String>()
            {
                @Override
                public String execute( TransactionContext tx )
                {
                    Result result = tx.run( input );
                    return result.list().toString();
                }
            }; 
    		
    		if (action == Action.WRITE)
    			return session.executeWrite(txWork);
    		else
    			return session.executeWrite(txWork);
    	}
    }
	/**
	 * returns a Record list as query result
	 * @param input
	 * @param action
	 * @return
	 */
	public List<Record> runCodeRecords(String input, Action action)
    {
    	try ( Session session = driver.session() )
    	{
    		List<Record> queryResult = null;
    		TransactionCallback<List<Record>> txWork = new TransactionCallback<List<Record>>()
            {
                @Override
                public List<Record> execute( TransactionContext tx )
                {
                    Result result = tx.run( input );
                    return result.list();
                }
            }; 

    		if (action == Action.WRITE)
    			queryResult = session.executeWrite(txWork);
    		else
    			queryResult = session.executeWrite(txWork);
    		return queryResult;
    	}
    }

	
	public boolean ensureDbConnect() {
		if (!dbConnected ) {
			driver = connectToDatabase(uri, user, pass);
			if (driver != null)
				dbConnected = driver.session().isOpen();
			else 
				return false;
		}
		
		return dbConnected;
	}

	@Override
	public boolean isConnected() {
		return dbInit;
	}

}