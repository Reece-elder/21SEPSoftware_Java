package com.qa.exercises;

public class Numbers {
	
	// Takes in a 2 digit number
	// Should return the sum of both of the digits
	// 36 -> 9
	
	public static int numbers(int num) {
		
		int firstNum = num / 10;
		int secondNum = num % 10; 
		
		int result = firstNum + secondNum;
		return result;
		
	}
	
	public static void numString() {
		System.out.println(String.valueOf(5));
	}

}
