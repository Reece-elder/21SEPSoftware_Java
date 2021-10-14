package com.qa.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// import org.apache.logging.log4j.*; <-- gets everything from org.apache.logging.log4j

public class LogDemo {
	
	// Logging is the process of outputting data from the computer to the console
	// System.out.println("some data") <-- Logging 
	// log4j is a third party 'better' log tool
	
	// First thing to do is create a Logger object 

	public static Logger newLogger = LogManager.getLogger();
	
	public static void logTest(String name) {
		newLogger.info("Hey " + name);
	}

}
