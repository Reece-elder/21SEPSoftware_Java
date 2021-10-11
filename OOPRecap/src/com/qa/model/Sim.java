package com.qa.model;

public class Sim {
	
	// public - accessible if you import in the package
	// private - not accessible
	
	// fields should be PRIVATE
	// getters and setters should be PUBLIC
	
	private String name;
	private String aspiration;
	private float simoleons;
	private boolean drinksBlood;
	private int hunger;
	
	
	// Make a Constructor
	// Shift Alt S / Right click > source > generate constructor using fields
	public Sim(String name, String aspiration, float simoleons, boolean drinksBlood, int hunger) {
		super();
		this.name = name;
		this.aspiration = aspiration;
		this.simoleons = simoleons;
		this.drinksBlood = drinksBlood;
		this.hunger = hunger;
	}
	
	// Overload
	// Creating multiple constructors which take in different fields
	// This constructor doesn't take in drinksBlood field
	public Sim(String name, String aspiration, float simoleons, int hunger) {
		super();
		this.name = name;
		this.aspiration = aspiration;
		this.simoleons = simoleons;
		this.hunger = hunger;
	}	
	

	public Sim(String name, float simoleons) {
		super();
		this.name = name;
		this.simoleons = simoleons;
	}
	
	// Getters and Setters -
	// Separate methods used to GET data and to SET data 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAspiration() {
		return aspiration;
	}

	public void setAspiration(String aspiration) {
		this.aspiration = aspiration;
	}

	public float getSimoleons() {
		return simoleons;
	}

	public void setSimoleons(float simoleons) {
		this.simoleons = simoleons;
	}

	public boolean isDrinksBlood() {
		return drinksBlood;
	}

	public void setDrinksBlood(boolean drinksBlood) {
		this.drinksBlood = drinksBlood;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	
	
	

	// Creates a method we can use to print out all aspects of our object
	// Generate toString() method
	

	// @something - an annotation, tells java what is the purpose of this method
	@Override
	public String toString() {
		return "Sim [name=" + name + ", aspiration=" + aspiration + ", simoleons=" + simoleons + ", isVampire="
				+ drinksBlood + ", hunger=" + hunger + "]";
	}


	
	

	
}
