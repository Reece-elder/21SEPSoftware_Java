package com.qa.mythological;

// Parent class
// Our subclasses will inherit data from this
public class MythologicalCreature {
		
	// Any attributes or methods we write in here CAN be inherited by our subclass
	// Except from PRIVATE attributes or fields
	
	// Public - Every class within the project has access to it
	// Private - Only this class has access to it
	// Protected - This class and any sub packages 
	// Default (unspecified) -- accessible ANYWHERE in your package
	
	// These are our fields // variables // attributes
	public boolean magical;
	
	public String creatureType;
	
	// Create a method 
	public String magicPower() {
		return "does some power";
	}

	public boolean isMagical() {
		return magical;
	}

	public void setMagical(boolean magical) {
		this.magical = magical;
	}

	public MythologicalCreature(boolean magical, String creatureType) {
		super();
		this.magical = magical;
		this.creatureType = creatureType;
	}
	
	
	
	
	
	
	
	
	
	

}
