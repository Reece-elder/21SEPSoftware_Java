package com.qa.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.jdbc.JDBC_setup;
import com.qa.model.Movie;

// This class will connect to the database USING JDBC
public class MovieDAO {
	
	JDBC_setup jdbc = new JDBC_setup();
	
	// class level variables to use 
	// Statement object (JDBC stuff) called statement
	Statement statement;
	Connection connection;
	
	public void addMovie() {
		
		// statement = jdbc_setup connection 
		// put that code in createStatement()
		// statement = conn.createStatement();
		try {
			connection = jdbc.connect();
			statement = connection.createStatement(); // a blank statement, what we send to the database
			String query = "INSERT INTO movies (movie_title, movie_length, movie_genre) VALUES (\"Resident Evil 3\", 105, \"Action Horror\")";
			statement.executeUpdate(query); // With the statement we've created, run the query we've passed in
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
