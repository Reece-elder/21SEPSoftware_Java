package com.qa.cakeTin;

// This will be used to create CAKES
// You'd create objects of the same name from a class
// cake -> cake
public class CakeTin {
	
	// Class level variables for our cake
	// The attributes / fields of our class
	
	// public is the accessibility of a variable
	// Anything with the package can access it, 
	
	public String filling; 
	public int tiers;
	public String colour;
	public boolean icing;
	
	// A constructor to create a cake object from our class
	// This is the method we will be calling from our main
	
	// No return type AND the exact name of the class
	public CakeTin() {
		
		// What we need inside is to define the properties of our cake
		this.filling = "coffee cream";
		this.tiers = 2;
		this.colour = "beigey brown";
//		this.icing = false;
		icing = false;
		
		
		
	}

}
