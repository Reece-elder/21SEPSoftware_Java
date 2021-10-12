package com.qa.runner;

import com.qa.dragon.Dragon;
import com.qa.polymorphism.Bird;
import com.qa.polymorphism.Parrot;
import com.qa.polymorphism.PollyTheParrot;
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
//		charizard.sleep();
//		charizard.shedSkin();
//		
//		Unicorn kyle = new Unicorn(true, "unicorn", 5, true, "teal");
//		System.out.println(kyle.isMagical());
//		System.out.println(kyle.magicPower());
//		System.out.println(kyle);
		
		PollyTheParrot newPolly = new PollyTheParrot("Teal");
		Parrot newParrot = new Parrot("Red");
		Bird newBird = new Bird("White");
		
//		newPolly.makeNoise();
//		newParrot.makeNoise();
//		newBird.makeNoise();
		
		// Using the Polly the parrot constructor I have created a Bird
		Bird polyMorphicBird = new PollyTheParrot("Green");
		
		polyMorphicBird.makeNoise();
		System.out.println(polyMorphicBird.getClass().getSimpleName());
		
		// Polymorphic qualities generally flow down the tree
		// Parent -> sub class
//		PollyTheParrot polyMorphicParrot = new Bird("Gold");
		
	}

}
