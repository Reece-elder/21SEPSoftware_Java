package com.qa.model;

public class Coffee {
	
	// Make a simple constructor method group
	
	// Fields
	private boolean decaf;
	private String type;
	private int strength;

	// Constructor
	public Coffee(boolean decaf, String type, int strength) {
		super();
		this.decaf = decaf;
		this.type = type;
		this.strength = strength;
	}
	
	// Getters and Setters
	public boolean isDecaf() {
		return decaf;
	}

	public void setDecaf(boolean decaf) {
		this.decaf = decaf;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	// Equals Method - Rather than comparing object references, will compare values
	// com.qa.coffee.54wfd5wd68 NOT GOOD

	// Annotations
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (decaf ? 1231 : 1237);
		result = prime * result + strength;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (decaf != other.decaf)
			return false;
		if (strength != other.strength)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
	// To String method
	@Override
	public String toString() {
		return "Coffee [decaf=" + decaf + ", type=" + type + ", strength=" + strength + "]";
	}
	
	

	
	
	
	
	

}
