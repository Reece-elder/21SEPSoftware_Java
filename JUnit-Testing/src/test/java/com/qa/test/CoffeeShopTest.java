package com.qa.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.qa.model.Coffee;
import com.qa.model.CoffeeShop;

public class CoffeeShopTest {
	
	// We want to test the createCoffee() method
	
	// Create the coffeeShop object
	CoffeeShop newShop = new CoffeeShop();
	
	@Test
	public void createCoffeeTest() {
		
		// Arrange (4 things)
		// A test coffee object 
		Coffee expectedCoffee = new Coffee(true, "test", 1);
		Coffee testCoffee;
		boolean decaf = true;
		String type = "test";
		int strength = 1;
		
		// Act
		testCoffee = newShop.createCoffee(decaf, type, strength);
		System.out.println(testCoffee);
		System.out.println(expectedCoffee);
		
		// Assert
		Assertions.assertEquals(expectedCoffee, testCoffee);
		
	}

}
