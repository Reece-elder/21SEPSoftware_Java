package com.qa.demo;

public class Arrays {
	
	// What are Arrays
	// Arrays are lists of data, and contain multiple pieces of data that can be accessed
	// Java Arrays MUST contain collections of like values (int, String, char, boolean etc.)
	
	// Strings are just arrays of chars
	// "Hello World" = 'H', 'e', 'e'
	
	// Arrays are immutable, the length and data type of an array CANNOT be changed
	// But the values in the array can
	// Arrays are like trains, a train mid journey must be all passengers and the amount of cars cannot change
	// BUT the people getting on the train can change
	
	// There are a few ways of creating them
	// Specify the DATA TYPE
	// Specify the name
	
	public static void arrayDemo() {
		
		// Create an array of colours
		
//		String colour = "red";
//		[] denotes is an array 
// 		Created an empty array of colours
//		String[] colourArray;
		
		// Creating an array of length 4 and specifying the value
		String[] colourArray = {"Red", "Blue", "Green", "Yellow"};
		
		// Creating an empty array BUT specifying the length of it
		int[] favNumsArray = new int[4];
		
		// Task
		// Create 4 arrays with 4 values; name (String), favLetter (char), 
		// favNumber (int OR float), likesPineappleOnPizza(boolean)
		
		// When printing an array, you print the reference to the memory
		// Complex objects are references to primitive datas
		System.out.println(colourArray);
		
		
		// Manipulating arrays / indexing
		
		// With Java, arrays are indexed at 0
		// The first element of an array is id'd as 0, with each subsequent being 1 higher
		
		System.out.println(colourArray[1]);
		System.out.println(colourArray[0]);
		
		// By accessing the index of the array, I can modify the data
		colourArray[0] = "Maroon";
		System.out.println(colourArray[0]);
	}
	
	public static void arrayLoop() {
		
		String[] foodArray = {"Pizza", "Lasagna", "Pad Thai", "Toad in the Hole"};
		System.out.println(foodArray);
		System.out.println(foodArray[2]);
		foodArray[2] = "Yaki Udon";
		System.out.println(foodArray[2]);
		System.out.println("==================================================");
//		System.out.println(foodArray[4]);
		// Array lengths start from 1
		// Array indexing starts from 0
		System.out.println(foodArray.length);
		
		// I want to print out every food in the array
		
		for(int i = 0; i < foodArray.length; i++) {
			System.out.println("Value of i is : " + i);
			
			// Will iterate OVER the array and print out the nth food at that index
			System.out.println(foodArray[i]);
		}
		
		// Task
		// Create an array of 1 - 10 numbers
		// Using a for loop print out the square of each of those numbers
		
		// Stretch goal
		// Create a second empty array of length 10
		// Within the original for loop assign the squared values to the empty array 
		// 1, 4, 9, 16 ..
		
		// Stretchier Goal 
		// Do the same but put the numbers in reverse
		// 100, 81, 64.. 
		
	}
	
	public static void enhancedForLoop() {
		
		String[] pizzas = {"Pepperoni", "Meat Feast", "Hawaiian", "Calzone", "Veggie"};
		
		// If I wanted to iterate through the list
		
		for(int i = 0; i < pizzas.length; i++) {
			System.out.println(pizzas[i]);
		}
		
		// You can use an ENHANCED for each loop
		
		// for command word
		// Data type and stand in variable : array
		for(String pizza : pizzas) {
			System.out.println(pizza);
		}
		
	}

}

