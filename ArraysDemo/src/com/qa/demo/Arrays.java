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

}
