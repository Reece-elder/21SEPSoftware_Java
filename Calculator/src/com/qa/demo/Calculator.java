package com.qa.demo;

public class Calculator {
	
	// Create add, sub, multiply and divide
	// Raise to the power of
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	public static double exponential(int x, int y) {
		return Math.pow(x, y);
	}

}
