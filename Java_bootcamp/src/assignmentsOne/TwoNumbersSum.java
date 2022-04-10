package assignmentsOne;

import java.util.Scanner;

public class TwoNumbersSum {

	public static void main(String[] args) {
		
		// INPUTS
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		// OUTPUTS
		System.out.println("Sum: " + sum(num1, num2));
		scanner.close();
		
	}
	// PROCESSING
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

}
