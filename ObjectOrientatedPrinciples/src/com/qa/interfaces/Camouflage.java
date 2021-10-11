package com.qa.interfaces;

// Is an interface rather than a class

// An interface is a wholly abstract class with ONLY abstract methods
// no need to specify whether stuff is abstract (as it has to be)
// They use 'implements' instead of extend, and one class can implement as many as you want

public interface Camouflage {
	
	// Good interfaces should have as few methods as possible
	
	// Interface contains 2 (but as few as possible) abstract methods
	public void camouflage();
	public void hide();

}
