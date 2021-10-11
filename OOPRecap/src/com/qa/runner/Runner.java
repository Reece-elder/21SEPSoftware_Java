package com.qa.runner;

import com.qa.model.Sim;

public class Runner {
	
	public static void main(String[] args) {
		
		// Create a new sim by creating a variable of type sim
		Sim polly = new Sim("Polly", "Proffesional Thief", 30567.75f, true, 7);
		
		System.out.println(polly.aspiration);
		System.out.println(polly);
		System.out.println(polly.getClass());
		
	}

}
