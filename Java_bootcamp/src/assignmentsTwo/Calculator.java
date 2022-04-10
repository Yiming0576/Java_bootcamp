package assignmentsTwo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		// INPUTS
		System.out.println("Enter a number: ");
		double number1 = reader.nextDouble();
		System.out.println("Enter the operator: ");
		char operator = reader.next().charAt(0);
		System.out.println("Enter a number: ");
		double number2 = reader.nextDouble();
		
		// call the function
		calculator(number1, number2, operator);
		reader.close();
		
	}
	// PROCESSING AND OUTPUTS
	public static void calculator(double num1, double num2, char operator) {
		double result = 0;
		if (operator == '+') {
			result = num1 + num2;
			System.out.println("result: " + result);
		} else if (operator == '-') {
			result = num1 - num2;
			System.out.println("result: " + result);
		} else if (operator == '*') {
			result = num1 * num2;
			System.out.println("result: " + result);
		} else if (operator == '/') {
			result = num1 / num2;
			System.out.println("result: " + result);
		}
		
	}

}
