package com.qa.exercises;

public class Coins {
	
	// A method that takes in a float (cost) and a float (amount paid)
	// Returns the correct change for the amount paid - cost
	// Item costs £3.21 and we pay £10 we need to return £6.79 in change
	
	public static void change(float cost, float amountPaid) {
		
		float change = amountPaid - cost;
		
		// Initialise all my variables
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		// While there is more change than 20, add another twenty
		while(change > 20f) {
			twenty++;
			change -= 20;
		}
		
		while(change > 10f) {
			ten++;
			change -= 10;
		}
		
		while(change > 5f) {
			five++;
			change -= 5;
		}
		
		System.out.println("Twenty: " + twenty);
		System.out.println("Ten: " + ten);
		System.out.println("Five: " + five);
		
	}

}
