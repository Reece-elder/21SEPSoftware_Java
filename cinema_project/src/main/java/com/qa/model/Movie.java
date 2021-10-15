package com.qa.model;

public class Movie {
	
	// Creating Fields
	private long movie_id;
	private String movie_title; 
	private int movie_length; 
	private String movie_genre;
	
	// Constructor
	
	// When pulling from a database we will know what the id is
	public Movie(long movie_id, String movie_title, int movie_length, String movie_genre) {
		super();
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.movie_length = movie_length;
		this.movie_genre = movie_genre;
	}
	
	// Overloaded 
	// When pushing to a database We dont know what the ID will be
	public Movie(String movie_title, int movie_length, String movie_genre) {
		super();
		this.movie_title = movie_title;
		this.movie_length = movie_length;
		this.movie_genre = movie_genre;
	}

	public long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public int getMovie_length() {
		return movie_length;
	}

	public void setMovie_length(int movie_length) {
		this.movie_length = movie_length;
	}

	public String getMovie_genre() {
		return movie_genre;
	}

	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}

	// To String methods
	
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_title=" + movie_title + ", movie_length=" + movie_length
				+ ", movie_genre=" + movie_genre + "]";
	}
	

	
	

}
