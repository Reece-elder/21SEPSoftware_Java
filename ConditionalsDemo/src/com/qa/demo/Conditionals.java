package com.qa.demo;

public class Conditionals {
	
	// Conditionals allow developers to check values and make decisions based off of answers. 
	// If something is x, do y, else do z
	
	// If Else statement 
	
	public static void kettleDemo() {
		
		boolean kettleOn = false;
		
		// if is the Key word
		// Im questioning IF the variable kettleOn is equal to true
		// = assignment
		// kettleOn = true
		
		// == checking IF kettleOn is equal to true
		
		if(kettleOn == true) {
			System.out.println("Kettle is on");
		} else {
			System.out.println("Kettle is off");
		}
		
	}
	
	// I want to know if a number is greater than,
	// equal or less than 10
	public static void numberDemo() {
		
		int number = 7; 
		
		if(number > 10) {
			System.out.println("Number greater than 10");
		} else if(number == 10) {
			System.out.println("Number is equal to 10");
		} else {
			System.out.println("Number is less than 10");
		}
		
	}
	
	public static void oddEvenDemo() {
		
		int number = 12;
		
		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		
	}
	
	// Conditional Operators 
	// == 
	// > / <
	// >= / <=
	// != - Not equal to 
	// && - AND 
	// || - OR
	
	public static void complexConditionals() {
		
		int number = 15; 
		String colour = "red";
		
		// If number is less than 10 AND colour is Red
		if(number < 10 || colour == "red") {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
	}
	

}
