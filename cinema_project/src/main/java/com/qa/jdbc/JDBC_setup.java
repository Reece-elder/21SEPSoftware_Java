package com.qa.jdbc;

import java.sql.Connection;

// This class will contain our database connection stuff
// And methods to do the basic JDBC connection
public class JDBC_setup {
	
	// We need to add our driver, db_url, user, pass
	// final - Will never change from this value
	
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306";
	
	final String USER = "reece";
	final String PASS = "root";
	
	// Connection is a datatype 
	Connection conn = null;

}
