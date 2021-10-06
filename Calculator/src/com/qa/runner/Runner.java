package com.qa.runner;

import com.qa.demo.Calculator;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println(Calculator.add(7, 3441));
		System.out.println(Calculator.subtract(50, 20));
		System.out.println(Calculator.multiply(4, 8));
		System.out.println(Calculator.divide(60, 3));
		System.out.println(Calculator.exponential(2, 3));
		
	}

}
