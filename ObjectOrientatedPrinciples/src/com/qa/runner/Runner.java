package com.qa.runner;

import com.qa.dragon.Dragon;
import com.qa.unicorn.Unicorn;

public class Runner {
	
	public static void main(String[] args) {
		
//		Dragon charizard = new Dragon("fire", true, "charlie", 2);
//		
//		System.out.println(charizard.getName());
//		charizard.setName("He should be a dragon type");
//		System.out.println(charizard.getName());
//		
//		charizard.setWingSpan(72023);
//		System.out.println(charizard.getWingSpan());
//		
//		charizard.setName("charizard");
//		
		Unicorn kyle = new Unicorn(true, "unicorn", 5, true, "teal");
		System.out.println(kyle.isMagical());
		System.out.println(kyle.magicPower());
		System.out.println(kyle);
		
	}

}
