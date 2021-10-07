package com.qa.runner;

import com.qa.demo.ForLoops;
import com.qa.demo.IterationMethods;
import com.qa.exercises.Coins;
import com.qa.exercises.FlowCharts;
import com.qa.exercises.Numbers;

public class Runner {
	
	public static void main(String[] args) {
		
//		IterationMethods.whileDemo();
//		IterationMethods.doWhileDemo();
//		ForLoops.loopDemo();
//		FlowCharts.flow2();
//		FlowCharts.print10();
//		FlowCharts.flow5();
		Coins.change(4f, 100f);
		System.out.println(Numbers.numbers(36));
		Numbers.numString();
		
	}

}
