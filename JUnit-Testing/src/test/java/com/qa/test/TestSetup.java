package com.qa.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestSetup {
	
	// When writing unit tests ALL tests should run seperate to each other
	// Tests shouldn't run in a particular order, the tests should pass the same way when ran in any order
	// JUnit partially randomises the running order of tests
	
	// Important when considering how to setup for tests
	
	// Say we needed a method to run BEFORE ALL of the tests
	
	
	boolean ranOnce = false;
	

	
	@BeforeAll
	public static void setup() {
		System.out.println("This annotation makes this method run First, before any other");
		System.out.println("This method will generally be your setup method");
	}
	
	@AfterAll
	public static void teardown() {
		System.out.println("Used for tearing down, stopping any processes that running because of tests");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		
//		if(ranOnce == false) {
//			System.out.println("Thing done");
//			ranOnce = true;
//		} else {
//			System.out.println("Does other thing");
//		}
		
//		System.out.println("Simplest one is, seperating the tests");
		int i = 0;
		System.out.println("=================================");
		System.out.println("");
		System.out.println("=================================");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("Run after each test");
	}
	
	@Test
	// @Disabled Will disable the test
	public void basicTest1() {
		
		boolean testBool = true;
		
		System.out.println("basic test 1");
		Assertions.assertTrue(testBool);
//		Assertions.fail(); // will fail the test
	}
	
	@Test
	public void basicTest2() {
		
		boolean testBool = true;
		
		System.out.println("basic test 2");
		Assertions.assertTrue(testBool);
	}
	
	@Test
	public void basicTest3() {
		
		boolean testBool = true;
		
		System.out.println("basic test 3");
		Assertions.assertTrue(testBool);
	}
	


}
