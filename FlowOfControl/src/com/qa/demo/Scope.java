package com.qa.demo;

public class Scope {
	
	// There are types of Scope
	// What has access to the variables and methods you're creating
	
	// Class level / Instance Scope - Variables defined INSIDE a class BUT OUTSIDE of methods
	
	// Method / Local Scope - Variables defined INSIDE of methods. 
	// And generally only used for that method
	
	// Class level scope variable
	// Accessible to ALL methods within class
	// Biggest issue with global / class level variables is security
	// Accidental assignment
	static int numberVar = 123;
	
	static int bankDetails = 64902730;
	
	public static void methodDemo() {
		System.out.println(numberVar);
	}
	
	public static void conflictingDemo() {
		int numberVar = 20;
		System.out.println(numberVar);
	}
	
	public static void bigH4ck3r() {
		System.out.println(bankDetails);
	}
	
	
	// Method level or local scope
	// These are variables created within a method, that disappear after the method ceases to exist
	
	public static String localDemo() {
		String password = "unicorn23";
		System.out.println(password);
		return password;
	}
	
	public static void printPassword() {
		System.out.println(localDemo());
	}
	
	

}
