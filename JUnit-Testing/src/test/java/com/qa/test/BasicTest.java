package com.qa.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.qa.demo.Basic;

public class BasicTest {
	
	// Creating an object to test the methods
	Basic basicObject = new Basic();
	
	// When creating tests we dont have any type of runner
	// Test classes should be created to test our classes in src/main/java
	// If we have a class called PizzaManager.java we should have a test class PizzaManagerTest.java
	
	// @Test is our annotation to tell Java this is a test
	@Test
	// Just a method with void
	public void addTwoTest() {
		// testing whether 2 + 4 = 6
		
		// Within testing there are 'frameworks' to follow
		
		// Arrange - Creating variables, methods you need to test
		int num1 = 2;
		int num2 = 4;
		int result;
		
		// Act - Running the code you are testing
		result = num1 + num2;
		
		// Assert - Checking the return against what it should be
		// Asserting that 6 = num1(2) + num2(4)
		Assertions.assertEquals(6, result);
		
	}
	
	// Writing a test to assert helloWorld returns Hello World
	
//	@Test
//	public void helloWorldTest() {
//		// Arrange - Arranging the variables I need
//		String testString; 
//		
//		// Act - Running the methods / code im testing
//		testString = basicObject.helloWorld();
//		System.out.println(testString);
//		
//		// Assert - Checking the values
//		// When we run helloWorld it SHOULD return Hello World
//		// I expect the string to be returned is "Hello World"
//		Assertions.assertEquals("Hello World", testString, "The method should return Hello World");
//	}
	
	@Test
	public void subtractTwoNumsTest() {
		
		// We can work with a simple sum ( 10 - 5) 
		// OR we can work with logic x - y
		
		// Arrange 
		int result; 
		int x = 1743392;
		int y = 12393;
		
		// Act
		result = basicObject.subtractTwoNums(x, y);
		
		// Assert
		// return true IF result = x - y
		Assertions.assertTrue(result == x - y);
		
	}
	
	@Test
	public void returnTrueTest() {
		
		// Arrange
		boolean testBool;
		
		// Act
		testBool = basicObject.returnTrue();
		
		// Assert
		Assertions.assertTrue(testBool);
		Assertions.assertTrue(testBool == true);
		Assertions.assertEquals(true, testBool);
		
	}
	
	// Create a backend
	// Write a test to see if the backend is created
	// test to see if x function in y class of backend works

//	@Test
//	public void loopDemoTest() {
//		
//		// Arrange
//		int resultNum;
//		
//		// Act
//		resultNum = basicObject.loopDemo();
//		
//		// Assert
//		Assertions.assertTrue(resultNum == 10);
//		
//	}
//	
//	@Test
//	public void ifElseBranchGreater() {
//		// Arrange
//		String testString;
//		int x = 6;
//		
//		// Act
//		testString = basicObject.ifElsebranch(x);
//		
//		// Assert
//		Assertions.assertEquals(testString, "greater");
//	}
//	
//	@Test
//	public void ifElseBranchEqual() {
//		
//		// Arrange
//		String testString;
//		int x = 5;
//		
//		// Act
//		testString = basicObject.ifElsebranch(x);
//		
//		// Assert
//		Assertions.assertEquals(testString, "equal");
//	}
//	
//	@Test
//	public void ifElseBrancless() {
//		// Arrange
//		String testString;
//		int x = 4;
//		
//		// Act
//		testString = basicObject.ifElsebranch(x);
//		
//		// Assert
//		Assertions.assertEquals(testString, "less");
//	}
	
	
	
}
