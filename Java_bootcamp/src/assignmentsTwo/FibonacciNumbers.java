package assignmentsTwo;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		//INPUTS
		System.out.println("Enter a number: ");
		int num = reader.nextInt();
		System.out.print("Fibonacci Series of " + num + " numbers: ");
		fibonacciNumbersFor(num);
		System.out.println();
//		System.out.print("Fibonacci Series of " + num + " numbers: ");
//		fibonacciNumbersWhile(num);
		
		// PROCESSING AND OUTPUTS
		for (int i = 0; i < num; i++) {
			System.out.println(fibonacciNumbersRecursion(i));
		}
		reader.close();

	}
	
	// PROCESSING
	public static void fibonacciNumbersFor(int count) {
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= count; ++i) {
			
			System.out.printf(num1 + " ");
			int sumOfprevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfprevTwo;
		}
	}
	
	// PROCESSING
	public static void fibonacciNumbersWhile(int count) {
		int num1 = 0, num2 = 1, i = 1;
		while (i <= count) {
			
			System.out.printf(num1 + " ");
			int sumOfprevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfprevTwo;
			i++;
		}
	}
	
	// PROCESSING
	public static int fibonacciNumbersRecursion(int count) {
		if (count == 0) {
			return 0;
		}
		if (count == 1 || count == 2) {
			return 1;
		}
		return fibonacciNumbersRecursion(count - 2) + fibonacciNumbersRecursion(count - 1);
	}
}
