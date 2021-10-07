package com.qa.demo;

public class Stack {
	
	// Will be called DIRECTLY by main
	public static int firstLayer() {
		
		int total = 5;
		
		total += secondLayer(4);
		total += secondLayer(2);
		
		return total;
		
	}
	
	// This will be called by our firstlayer
	public static int secondLayer(int num) {
		
		// Taking in a number and multiplying by 2
		int subTotal = num * 2;
		
		return subTotal;
		
	}

}
