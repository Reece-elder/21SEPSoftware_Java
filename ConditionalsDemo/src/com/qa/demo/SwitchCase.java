package com.qa.demo;


public class SwitchCase {
	
	// Switch cases allow you to move away from a boolean / true / false conditional
	// conditional checking if number > 21 
	// switch cases allow you to program any number of possible outcomes
	
	public static void switchCaseDemo(String lyric, int num) {
		
		// Switch case for Doe a deer a female deer from the sound of music
//		String lyric = "doe";
		
		// switch is our key word
		switch(lyric) {
		
		// Case is the value we're expecting
		// And the value ends with a :
		case "doe":
			System.out.println("A deer, a female deer");
			break;
			
		case "ray":
			System.out.println("A drop of golden sun");
			break;
			
		case "me":
			System.out.println("A name, I call myself");
			break;
			
		default: 
			System.out.println("I dont know the rest :(");
			break;
		
		}
		
		switch(num) {
		
		case 1: 
			System.out.println("1");
			break;
		
		case 2:
			System.out.println("2");
			break;
			
		default:
			System.out.println("Reece was lazy and didnt do the rest");
			break;
		}
		
	}

}
