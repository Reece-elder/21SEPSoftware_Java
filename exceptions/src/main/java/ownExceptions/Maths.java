package ownExceptions;

public class Maths {

	public void multiply(int a, int b) throws MultipleByThreeException{
		
		int result;
		
		if(a == 3 || b == 3) {
			MultipleByThreeException m = new MultipleByThreeException();
			throw m;
		}
		
		result = a * b;
		System.out.println("The result of the number is: " + result);	
	}
}
