package com.qa.demo;

public class IterationMethods {
	
	// Iterations allow you to repeat blocks of code until a specific condition is met
	// Loops, iteration in ANY programming language keep running code until the condition is met
	
	// While      - Does the code WHILE a boolean / other statement is true
	// Do - While - Does the code atleast once THEN checks the condition 
	// For        - Does the code for a set number of iterations
	
	public static void whileDemo() {
		
		int housePlants = 0;
		
		// while is our keyword, acts like an if statement
		while(housePlants < 10) {
			housePlants++;
			System.out.println("Current number of plants: " + housePlants);
			System.out.println("Grab another!");
		}
		
		System.out.println("Number of plants: " + housePlants);
		
	}
	
	public static void doWhileDemo() {
		
		int hoursSlept = 0;
		
		do {
			System.out.println("Hours slept: " + hoursSlept);
			hoursSlept++;
		} while (hoursSlept > 7);
		
		while(hoursSlept > 7) {
			System.out.println("Hours slept: " + hoursSlept);
			hoursSlept++;
		};
		
	}
	
	// Task - Create a method that takes in a starting amount of money (200?) 
	// - The same amount of money is deducted every time (30)
	// - When the total money left goes under a different value (50?), the loop stops
	// - And it prints out "stop spending money!!"

}
