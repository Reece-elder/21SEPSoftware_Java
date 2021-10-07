package com.qa.conditional;

public class Conditional {
	
	// I want a method that will output the colour "red" 
	// if the string is red, else it will say "not red"
	
	public static void redDemo(String colour) {
		
		System.out.println(colour.toLowerCase());
		
		String newColour = colour.toLowerCase();
		
		System.out.println(newColour);
		
		if(newColour == "red") {
			System.out.println("red");
		} else {
			System.out.println("Not red");
		}
		
	}
	
	// I want a method that takes in three numbers,
	// multiply them all together
	
	public static int numDemo(int x, int y, int z) {
		
		return x * y * z;
		
	}
	
	// I want to create a method, that depending on the 
	// int I enter, prints off the string 
	// 1 -> "one"
	
	// Objects are collections of data
	// Object can contain a String, int, char
	
	public static String numString(int x) {
		
		switch(x) {
		
		
		
		case 1:
			return "one";
			
		case 2:
			return "two";
			
		case 3:
			return "three";
			
		default:
			return "not a number";
		
		}
		
	}

}
