package com.qa.demo;

public class Runner {
	
	public static void main(String[] args) {
		boo();
		helloWorld();
		// Im accessing the class (ReturnTypes).method
//		ReturnTypes.returnInt();
		System.out.println(ReturnTypes.returnInt());
		System.out.println(ReturnTypes.returnString());
	}
	
	// Creating a method that prints hello world
	// getting our main to run that method
	
	// This is what we'd put in MAIN
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	
	public static void boo() {
		System.out.println("spooooooooky");
	}

}
