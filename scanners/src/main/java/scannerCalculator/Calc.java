package scannerCalculator;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		double ans;
		char operator;
		
		System.out.println("Enter number 1: ");
		num1 = scan.nextDouble();
		System.out.println("Enter number 2: ");
		num2 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Select what you would like to do to these numbers: ");
		operator = scan.nextLine().charAt(0);
		
		switch(operator) {
		case '+':
			ans = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + ans);
			break;
		case '-':
			ans = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + ans);
			break;
		case '*':
			ans = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + ans);
			break;
		case '/':
			ans = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + ans);
			break;
		default:
			System.out.println("Not valid");
			break;
		}
	}
}
