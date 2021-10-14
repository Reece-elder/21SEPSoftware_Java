package com.qa.demo;

public class Basic {
	
	// Methods that return are easier to test
	public String helloWorld() {
		System.out.println("Hello World");
		return "Hello World";
	}
	
	public int subtractTwoNums(int x, int y) {
		return x - y;
	}
	
	public boolean returnTrue() {
		return true;
	}
	
	// This method returns the number of times
	// the loop runs
	public int loopDemo() {
		
		int i;
		
		for(i = 0; i < 10; i++) {
			System.out.println("Loop runs!");
		}
		// returns 10
		return i;
		
	}
	
	public String ifElsebranch(int x) {
		
		// if else with OR checking num and String values
		
		if(x > 5) {
			System.out.println("x is greater than 5");
			return "greater";
		} else if (x == 5) {
			System.out.println("x is equal to 5");
			return "equal";
		} else {
			System.out.println("x is less than 5");
			return "less";
		}
		
	}

}
