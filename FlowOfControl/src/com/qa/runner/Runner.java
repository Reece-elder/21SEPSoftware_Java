package com.qa.runner;

import com.qa.demo.ControlFlow;
import com.qa.demo.Stack;

public class Runner {
	
	public static void main(String[] args) {
		
		// Ctrl Shift O 
		// Auto imports everything (and cleans up imports)
		
//		ControlFlow.method3();
//		ControlFlow.method1();
//		ControlFlow.method2();
		
//		System.out.println(Stack.secondLayer(4));
		System.out.println(Stack.firstLayer());
		int total = Stack.firstLayer();
		
		return;
	}

}
