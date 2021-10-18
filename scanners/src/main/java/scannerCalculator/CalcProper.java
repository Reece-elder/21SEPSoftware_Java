package scannerCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcProper {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CalcMethods method = new CalcMethods();
		
		double num1;
		double num2;
		double ans = 0;
//		char operator;
		String oper;
		
		
		try {
		System.out.println("Enter number 1: ");
		num1 = scan.nextDouble();
		System.out.println("Enter number 2: ");
		num2 = scan.nextDouble();
		scan.nextLine();
//		System.out.println("Select what you would like to do to these numbers: ");
//		operator = scan.nextLine().charAt(0);
		System.out.println("Select what you would like to do to these numbers: ");
		oper = scan.nextLine();
		
		
		switch(oper) {
		case "add":
			method.addition(num1, num2, ans);
			break;
		case "subtract":
			method.subtraction(num1, num2, ans);
			break;
		case "multiply":
			method.multiply(num1, num2, ans);
			break;
		case "divide":
			method.divide(num1, num2, ans);
			break;
		default:
			System.out.println("Default");
			break;
		}
		} catch(InputMismatchException e){
			System.out.println("That is not a valid input, please input a number!");
		}
		
		
		
//		switch(operator) {
//		case '+':
//			method.addition(num1, num2, ans);
//			break;
//		case '-':
//			method.subtraction(num1, num2, ans);
//			break;
//		case '*':
//			method.multiply(num1, num2, ans);
//			break;
//		case '/':
//			method.divide(num1, num2, ans);
//			break;
//		default:
//			System.out.println("Default");
//			break;
//		}
		
}
}
