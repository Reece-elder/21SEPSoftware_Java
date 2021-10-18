package exceptions;

import ownExceptions.Maths;
import ownExceptions.MultipleByThreeException;

public class exceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		try {
//			int a = 30;
//			int b = 1;
//			int c = a/b;
//			System.out.println("Result = " + c);
//		} 
//		catch(ArithmeticException e){
//			System.out.println("You can't divide by zero you muppet");
//		}
		
		Maths m = new Maths();
		
		try {
			m.multiply(4, 3);
		} catch (MultipleByThreeException e) {
			System.out.println("Cannot multiply a number by 3!");
			e.printStackTrace();
		}
	
		
	}

}
