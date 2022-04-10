package assignmentsTwo;

import java.util.Scanner;

public class InterestCaculator {
	/*
	 * Write a program to input principal, time, and
	 *  rate (P, T, R) from the user and find Simple Interest.
	 */
	public static void main(String[] args) {
		// INPUTS
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principal: ");
		double p = scanner.nextDouble();
		
		System.out.println("Enter time: ");
		double t = scanner.nextDouble();
		
		System.out.println("Enter rate: ");
		double r = scanner.nextDouble();
		
		// call the function
		double finalAmount = interestCalculator(p, t, r);
		
		// OUTPUTS
		System.out.println("Final Amount: " + finalAmount);
		scanner.close();
	}
	
	// PROCESSING
	public static double interestCalculator(double p, double t, double r) {
		return p * (1 + r * t);
	}

}
