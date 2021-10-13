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

}
