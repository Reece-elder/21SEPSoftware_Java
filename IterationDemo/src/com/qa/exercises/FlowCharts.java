package com.qa.exercises;

public class FlowCharts {
	
	public static void flow2() {
		
		for(int a = 100; a <= 200; a++) {
			
			if(a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			
		}
		
	}
	
	// Print 1 - 10, 10 times
	// Print 1 - 10
	// Print anything 10 times
	
	public static void print10() {
		
		for(int i = 0; i < 10; i++) {
			
			for(int x = 0; x < 10; x++) {
				System.out.println("i: " + i + " x: " + x);
			}
			
		}
		
	}
	// 1
	// 2 2
	// 3 3 3
	
	public static void flow5() {
		
		for(int i = 0; i < 10; i++) {
			
			for(int x = 0; x < i; x++) {
				System.out.println("Value of i is: " + i);
			}
			
		}
		
	}

}
