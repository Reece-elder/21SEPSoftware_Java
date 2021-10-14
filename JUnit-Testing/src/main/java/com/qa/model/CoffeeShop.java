package com.qa.model;

public class CoffeeShop {
	
	// A method that will create a new coffee and return it
	
	public Coffee createCoffee(boolean decaf, String type, int strength) {
		
		Coffee newCoffee = new Coffee(decaf, type, strength);
		return newCoffee;
		
	}

}
