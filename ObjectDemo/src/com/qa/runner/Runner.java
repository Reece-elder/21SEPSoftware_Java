package com.qa.runner;

import com.qa.cakeTin.CakeTin;

public class Runner {
	
	public static void main(String[] args) {
		
		// Run our constructor and create a new cake
		// CakeTin is our data type
		// newCake is the name of our variable
		// new CakeTin() means return a new cake object using the constructor
		CakeTin spongeCake = new CakeTin("Jam", 1, "Beige", true);
		CakeTin newCake = new CakeTin("Chocolate", 5, "Pink", true);
		CakeTin testCake = new CakeTin(null, 0, null, false);
//		CakeTin newCake = newCakeTin(filling = jam)
		System.out.println(spongeCake);
		System.out.println(spongeCake.filling);
		System.out.println(newCake.filling);
		
		
		// Task
		// Choose an animal you want to work with (Bird, lizard, cat) 
		// Create a class called that animal
		// Within the class create atleast 4 
		// attributes across different data types
		// Create a constructor that creates the animal
		// Run the constructor within your runner
		
	}

}
