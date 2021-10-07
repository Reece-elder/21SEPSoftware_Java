package com.qa.demo;

import java.util.Random;

public class DiceRoller {
	
	// Task - Create a method stack (includes multiple methods) for the following:
	// - Rolling 4 seperate 6 sided dice and getting the total
	// - 3 seperate six sided dice, returning the total. Rolling 2 eight sided dice, returning that total
	// Adding both totals together
	// Roll a 2 sided, 3 sided, 4 sided, 5 sided, 6 sided and 8 sided and adding the total
	
	public static int getRandNum(int num) {
		
		return new Random().nextInt(num);
		
	}
	

}
