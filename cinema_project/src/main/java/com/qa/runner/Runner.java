package com.qa.runner;

import com.qa.dao.MovieDAO;
import com.qa.jdbc.JDBC_setup;
import com.qa.model.Movie;

public class Runner {
	
	public static void main(String[] args) {
		
//		JDBC_setup jdbc = new JDBC_setup();
		MovieDAO dao = new MovieDAO();
		
		Movie blade2 = new Movie("Blade 2", 89, "Action Horror");
		Movie treasurePlanet = new Movie("Treasure Planet", 95, "Animated Scifi");
		
		dao.addMovie(blade2);
		dao.addMovie(treasurePlanet);
		
	}

}
