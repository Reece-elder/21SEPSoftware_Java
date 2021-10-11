package com.qa.lizard;

import com.qa.interfaces.Camouflage;
import com.qa.interfaces.Climbing;

// If using interfaces, use the 'implements' key word
public class Gecko implements Camouflage, Climbing {

	@Override
	public void camouflage() {
		System.out.println("changes skin to tree bark");
		
	}

	@Override
	public void hide() {
		System.out.println("Hides on a tree");
		
	}

	@Override
	public void stickyClaws() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void propellerTails() {
		// TODO Auto-generated method stub
		
	}

}
