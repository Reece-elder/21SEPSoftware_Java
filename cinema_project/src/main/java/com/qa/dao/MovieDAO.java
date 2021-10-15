package com.qa.dao;

import java.sql.Statement;

import com.qa.jdbc.JDBC_setup;
import com.qa.model.Movie;

// This class will connect to the database USING JDBC
public class MovieDAO {
	
	JDBC_setup jdbc = new JDBC_setup();
	
	// class level variables to use 
	// Statement object (JDBC stuff) called statement
	Statement statement;
	
	public void addMovie(Movie movie) {
		
	}

}
