package com.qa.unicorn;

import com.qa.mythological.MythologicalCreature;

// We need to specify that Unicorn inherits Mythological Creature
public class Unicorn extends MythologicalCreature {
	
	private int hornSize;
	private boolean wings;
	private String colour;
	
	public Unicorn(int hornSize, boolean wings, String colour) {
		super();
		this.hornSize = hornSize;
		this.wings = wings;
		this.colour = colour;
	}

	public int getHornSize() {
		return hornSize;
	}

	public void setHornSize(int hornSize) {
		this.hornSize = hornSize;
	}

	public boolean isWings() {
		return wings;
	}

	public void setWings(boolean wings) {
		this.wings = wings;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	

}
