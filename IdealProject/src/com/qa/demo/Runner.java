package com.qa.demo;

import com.qa.numPackage.NumClass;
import com.qa.printer.Printer;

// Each project should have ONLY one Runner
// The Runner should ONLY CONTAIN the main method
public class Runner {
	
	public static void main(String[] args) {
		
		Printer.printsHello();
		NumClass.printNum();
		
		Example.exampleMethod();
		
	}

}
