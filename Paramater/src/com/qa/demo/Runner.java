package com.qa.demo;

public class Runner {
	
	public static void main(String[] args) {
		
		helloReece();
		helloStudent("Sam");
		helloStudent("Kieran");
		printNumber(5);
		System.out.println(printNumber(7));
		
		printDetails("Reece", true, 36);
		printDetails("Sean", false, 12);
		
	}
	
	// Creating a method that prints Hello Reece
	public static String helloReece() {
		System.out.println("Hello Reece");
		return "Hello Reece";
	}
	
	// Creating a method where we pass in a name
	// Using paramaters to pass in variables
	public static String helloStudent(String name) {
		System.out.println("Hello " + name);
		return name;
	}
	
	// Method that takes in a number and prints it
	public static char printNumber(int num) {
		// Concatenation means adding two strings together
		System.out.println("The number is " + num);
		return 'd';
	}
	
	// This process is slooooowwww
	public static void helloAdam() {
		
	}

	// I want to create a method that takes in a String (name), 
	// boolean (likes pineapple on pizza), and int (fav number)
	public static void printDetails(String name, boolean pineapplePizza, int favNumber) {
		
		System.out.println("My name is " + name + ", pineapple on pizza is good: " + pineapplePizza + ", my fav number is " + favNumber);
		
	}
	
	// Task
	// Create methods that take in the following variables and prints them out with some context 
	// - int
	// - String
	// - float
	// - boolean, float
	// - float, String
	// - char, boolean, int

}
