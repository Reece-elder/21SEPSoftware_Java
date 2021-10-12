package com.qa.polymorphism;

public class Parrot extends Bird {
	
	public Parrot(String featherColour) {
		super(featherColour);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
		System.out.println("Hello, im a parrot!");
	}

}
