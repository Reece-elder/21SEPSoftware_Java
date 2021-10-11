package com.qa.demo;

public class ForLoops {
	
	// For Loops are for when you know how long the loop should go on FOR
	
	// They have four distinct components to make up
	// Initialisation (initial value)
	// Condition (What it checks for)
	// Iterator (How the value changes)
	// Code block (what do you want to loop)
	
	// There is no need to generate a constructor if 
	// no data is being passed in 
	
	public void loopDemo() {
		
		// Create a loop that counts to 10 
		
		// Key word for for
		for (
				int i = 0; // Initialisation (what are we starting from)
				i <= 10;    // Condition (Why does the loop stop)
				i++        // How does i change
			) {
			// What is the loop doing
			System.out.println("Value of i is :" + i);
		}
		
		// Create a loop that counts from 10 down to 1
		for(int x = 10; x > 0; x--) {
			System.out.println("Value of x is : " + x);
		}
		
		// Create a loop that counts in 5s from 20 to 100
		// ++ - adds 1 
		// -- - subtracts 1
		// += 123 adds 123
		// y = y + 123  //  y += 123
		
		for(int y = 20; y < 100; y += 5) {
			System.out.println("Value of Y is :" + y);
			
		}
		
		
	}
	
	

}
