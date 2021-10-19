package com.qa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
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
	
	String testString = "Hey, I can put punctuation \"hey\"";
	
	//LINKED TO READ (but useful for other stuff)
	public Movie movieFromResultSet(ResultSet resultSet) throws SQLException{
		Long movie_id = resultSet.getLong("movie_id");
		String movie_title = resultSet.getString("movie_title");
		int movie_length = resultSet.getInt("movie_length");
		String movie_genre = resultSet.getString("movie_genre");
		//Left hand variables are the names in the Movie.class   
		//right hand variables in speech marks are how it is named in the SQL table
		return new Movie(movie_id, movie_title, movie_length, movie_genre);
	}
	
	
	//CREATE
	
	public void addMovie(Movie movie) {
		
		System.out.println(testString);
		
		// statement = jdbc_setup connection 
		// put that code in createStatement()
		// statement = conn.createStatement();
		try {
			connection = jdbc.connect();
			statement = connection.createStatement(); // a blank statement, what we send to the database
			String query = "INSERT INTO movies (movie_title, movie_length, movie_genre) VALUES ('" + movie.getMovie_title() + "'," + movie.getMovie_length() + ", '" + movie.getMovie_genre() + "')";
			statement.executeUpdate(query); // With the statement we've created, run the query we've passed in
			System.out.println(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//READ
	
	public Movie readMovie(Long id) {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movies WHERE id = " + id);{
				resultSet.next();		//.next() is an inbuilt java method, that moves through the SQL table
				return movieFromResultSet(resultSet);
			}
		} catch(SQLException e){
			System.out.println("Hello");
		}
		return null;
	}
	
	
	//UPDATE
	
	public Movie update(Movie movie) {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			statement.executeUpdate("UPDATE movie SET movie_title = '" + movie.getMovie_title() 
			+ "' , movie_length = '" + movie.getMovie_length() + "', movie_genre = '" + movie.getMovie_genre()
			+ "' WHERE id = " +movie.getMovie_id());
			return readMovie(movie.getMovie_id());
			
			} catch (SQLException e) {
				System.out.println("Hi");
		}
		return null;
	}
	
	//DELETE
	
	public Movie delete(Long id) {
		try {
			connection = jdbc.connect();
			statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM movies WHERE movie_id = " + id);
		} catch(SQLException e) {
			System.out.println("Bye");
		}
		return null;
	}
	

}
