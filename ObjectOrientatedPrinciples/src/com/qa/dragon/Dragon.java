package com.qa.dragon;

import com.qa.lizard.Lizard;

// Extending abstract classes works the same way as parent classes
public class Dragon extends Lizard {
	
	// Encapsulation
	
	private String breathType;
	private boolean canFly;
	private String name;
	private int wingSpan;
	
	
	public Dragon(String breathType, boolean canFly, String name, int wingSpan) {
		super();
		this.breathType = breathType;
		this.canFly = canFly;
		this.name = name;
		this.wingSpan = wingSpan;
	}


	// All objects of type Dragon have public read / write access to the variables
	// Anything can get the variables values and set them to whatever
	
	public String getBreathType() {
		return breathType;
	}


	public boolean isCanFly() {
		return canFly;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		if (name == "charizard") {
			System.out.println("Dont do that, we'll get sued :( ");
			this.name = "charezard";
		} else {
			this.name = name;
		}
	}


	public int getWingSpan() {
		return wingSpan;
	}


	public void setWingSpan(int wingSpan) {
		
		if(wingSpan > 50) {
			System.out.println("Wingspan too great!");
		} else {
			this.wingSpan = wingSpan;
		}
		
	}


	@Override
	public void sleep() {
		System.out.println("Lounges on a pile of gold");
	}
	
	
	
	

}
