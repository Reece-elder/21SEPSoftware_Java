package com.qa.model;

import java.util.ArrayList;

// To manage the lists, and create new pizzas
public class Manager {
	
	// Ctrl Shift O - sorts out imports
	
	// ArrayList of pizzas
	ArrayList<Pizza> pizzaList = new ArrayList<>();
	
	// Create some pizzas directly
	Pizza pepperoniPizza = new Pizza(12, "Double Pepperoni", true);
	Pizza veggiePizza = new Pizza(11, "Peppers, onions, mushrooms", false);
	
	public void addPizzas() {
		
		System.out.println(pizzaList);
		pizzaList.add(pepperoniPizza);
		System.out.println(pizzaList);
		
	}

}
