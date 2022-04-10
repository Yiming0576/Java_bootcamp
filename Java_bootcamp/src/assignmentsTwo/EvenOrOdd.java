package assignmentsTwo;

import java.util.Scanner;

public class EvenOrOdd {
	/*
	 * Write a program to print whether a number is even or odd, 
	 * also take input from the user.
	 */
	public static void main(String[] args) {
		// INPUTS
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		// Call the function
		EvenOdd(number);
		scanner.close();
	}
	// PROCESSING AND OUTPUTS
	public static void EvenOdd(int x) {
		if (x % 2 ==0) {
			System.out.println(x + " is an even number");
		} else {
			System.out.println(x + " is an odd number");
		}
	}

}
