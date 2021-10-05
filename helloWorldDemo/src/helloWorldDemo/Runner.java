package helloWorldDemo;

// ctrl / makes text into a comment
// all of our code should be in the { } for our class
public class Runner {
	
	// Make a method that prints out "Hello World"
	// This is our main method
	// EVERYTHING that is in here will run when the code runs
	public static void main(String[] args) {
		// Will print out hello world
//		System.out.println("Hello World");
		
		helloWorld();
		happyBirthday();
	}
	
	// Make other methods that are called by our main
	
	// Created a method called helloWorld
	// All method does is print out hello world
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	
	// Create a method that says happy birthday Reece
	public static void happyBirthday() {
//		syso ctrl space
		System.out.println("Happy Birthday Reece");
	}
	
	// Task 
	// - Create a method that says Hello World
	// - Create method that says my fav colour is <colour>
	// - Run both methods from the main method
	

}
