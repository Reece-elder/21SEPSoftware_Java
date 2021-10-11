package com.qa.runner;

import com.qa.dragon.Dragon;

public class Runner {
	
	public static void main(String[] args) {
		
		Dragon charizard = new Dragon("fire", true, "charlie", 2);
		
		System.out.println(charizard.getName());
		charizard.setName("He should be a dragon type");
		System.out.println(charizard.getName());
		
		charizard.setWingSpan(72023);
		System.out.println(charizard.getWingSpan());
		
		charizard.setName("charizard");
		
	}

}
