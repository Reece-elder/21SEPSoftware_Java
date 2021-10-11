package com.qa.runner;

import com.qa.model.Sim;

public class Runner {
	
	public static void main(String[] args) {
		
		// Create a new sim by creating a variable of type sim
		Sim polly = new Sim("Polly", "Proffesional Thief", 30567.75f, true, 7);
		Sim notVampireSteve = new Sim("steve", "vampire huner", 10f, 6);
		Sim newSim = new Sim("newSim", 500f);
		
		System.out.println(newSim);
		
		System.out.println(notVampireSteve.isDrinksBlood());
		
		System.out.println(polly.getAspiration());
		polly.setAspiration("NASA astronaut");
		System.out.println(polly.getAspiration());
		System.out.println(polly);
		System.out.println(polly.getClass());
		
	}

}
