package com.qa.runner;

import com.qa.jdbc.JDBC_setup;

public class Runner {
	
	public static void main(String[] args) {
		
		JDBC_setup jdbc = new JDBC_setup();
		jdbc.connect();
		
	}

}
