package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class will contain our database connection stuff
// And methods to do the basic JDBC connection
public class JDBC_setup {
	
	// We need to add our driver, db_url, user, pass
	// final - Will never change from this value
	
//	final String db_url = "jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	//?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
	
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/qa_cinema";
	
	final String USER = "reece";
	final String PASS = "root";
	
	// Connection is a datatype 
	Connection conn = null;
	
	
	// create a method to allow us to connect to the database
	// This method will return a Connection object, and is called connect
	public Connection connect() {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {  // If you can't connect, print an SQL exception error
			e.printStackTrace();
		}
		return conn;
	}
	
	// Try Catches are used to tell Java what to do if an 'exception' occurs
	// An exception is something that goes wrong, but doesnt break the code
	// Try - contains the code we're TRYING to do 
	// Catch - tells Java what to do if we hit an exception 
	
	public void closeConn() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
