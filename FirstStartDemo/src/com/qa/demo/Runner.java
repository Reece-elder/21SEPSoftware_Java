package com.qa.demo;

import com.qa.conditional.Conditional;

public class Runner {
	
	public static void main(String[] args) {
		
		Conditional.redDemo("reD");
		System.out.println(Conditional.numDemo(5, 2, 4));
		System.out.println(Conditional.numString(24));
		
		String number = Conditional.numString(1);
		System.out.println(number);
		
	}

}
