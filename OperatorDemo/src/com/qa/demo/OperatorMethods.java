package com.qa.demo;

public class OperatorMethods {
	
	// Operators are ways of manipulating numerical data +
	
	// = Assign value 
	// num = 5
	
	// + plus
	// - minus
	// / divide
	// * multiply
	// % modulus
	
	// 10 / 3 = 3
	// remainder = 1
	
	// 10 % 3 = 1
	// 7 % 2 = 1
	// 8 % 2 = 0
	
	// ++ - increments by 1
	// -- - decrements by 1
	// +=4 - increment by 4
	
	// This method will add two numbers together
	public static void addNumbers() {
		
		int num1 = 5;
		int num2 = 8;
		int result = num1 + num2;
		System.out.println(result);
		
	}
	
	// Create a method that subtracts two numbers
	public static void minusNumbers() {
		
		int num1 = 10;
		int num2 = 7;
		int result = num1 - num2;
		System.out.println(result);
		
	}
	
	// Create a method that takes in two numbers and adds them together
	public static int addTwoNums(int num1, float num2) {
		
		int result = (int) (num1 + num2);
		return result;
		
	}
	
	
	

}
