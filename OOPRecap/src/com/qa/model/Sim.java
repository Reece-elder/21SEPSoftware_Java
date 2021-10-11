package com.qa.model;

public class Sim {
	
	public String name;
	public String aspiration;
	public float simoleons;
	public boolean isVampire;
	public int hunger;
	
	
	// Make a Constructor
	// Shift Alt S / Right click > source > generate constructor using fields
	public Sim(String name, String aspiration, float simoleons, boolean isVampire, int hunger) {
		super();
		this.name = name;
		this.aspiration = aspiration;
		this.simoleons = simoleons;
		this.isVampire = isVampire;
		this.hunger = hunger;
	}


	// Creates a method we can use to print out all aspects of our object
	// Generate toString() method
	
	// @something - an annotation, tells java what is the purpose of this method
	@Override
	public String toString() {
		return "Sim [name=" + name + ", aspiration=" + aspiration + ", simoleons=" + simoleons + ", isVampire="
				+ isVampire + ", hunger=" + hunger + "]";
	}
	
	

	
}
