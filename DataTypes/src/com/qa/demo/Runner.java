package com.qa.demo;

public class Runner {
	
	// Data Types - What forms of information can Java understand
	// Java is an EXPLICIT language - You need to specify the data it takes in
	
	// JavaScript IMPLICIT
	// let apple = 5;
	// let number = "hello"
	
	// Java EXPLICIT
	// String name = "reece"
	// int number = 5;
	
	// Java Data type groups there are two distinct groups of data
	
	// Primitive - smallest form of data Java can understand
	// - They are actual pieces of data within java memory
	// boolean - true, false / 0 1
	// byte - very small number, -128 to 127
	// char - single character a, b, 1, ? ,
	// short - small number -30000 to 30000
	// int - medium length number
	// long - long number
	// float - decimal number
	// double - long decimal
	
	// Strings "text" are arrays / objects of chars
	// Complex - References to primitive data types
	
	
	public static void main(String[] args) {
//		printHello();
		System.out.println(printHello());
	}
	
	
	// Java Return Types 
	
	// Within java all methods SHOULD (not all) return something
	// When running the method, they should be equal to a value
	
	// printHello() = something
	
	// This method now returns hello
	// void means NO data type
	// This method now returns a String
	public static String printHello() {
//		System.out.println("Hello");
		return "Hello";
	}
	

}
