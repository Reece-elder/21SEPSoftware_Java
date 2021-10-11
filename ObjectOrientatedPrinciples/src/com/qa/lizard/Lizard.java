package com.qa.lizard;

// Be our abstract class
// If something is an abstract class it cannot be instantiated == cant make objects out of
// Abstract classes are used as blue prints for other classes
// Abstract classes are like recipes for other classes 

// public abstract class <class name>
public abstract class Lizard {
	
	// We do not have a constructor or fields here 
	
	// Is an abstract method 
	// no body {} - purpose is to ensure all sub classes have this method
	public abstract void sleep();
	
	// Regular method
	public void shedSkin() {
		System.out.println("Skin shedded.. grim");
	}

}
