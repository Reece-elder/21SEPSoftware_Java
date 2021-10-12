package com.qa.model;

public class Pizza {
	
	// Fields 
	private int size;
	private String toppings;
	private boolean stuffedCrust;
	
	
	// Constructor 
	public Pizza(int size, String toppings, boolean stuffedCrust) {
		super();
		this.size = size;
		this.toppings = toppings;
		this.stuffedCrust = stuffedCrust;
	}
	
	// Getters and setters
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public boolean isStuffedCrust() {
		return stuffedCrust;
	}
	public void setStuffedCrust(boolean stuffedCrust) {
		this.stuffedCrust = stuffedCrust;
	}

	// ToString method
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", toppings=" + toppings + ", stuffedCrust=" + stuffedCrust + "]";
	}
	
	
	
	
}
