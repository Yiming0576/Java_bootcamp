package assignmentsTwo;

import java.util.Scanner;

public class CarInterestCalculator {
	/*
		Car monthly payment and monthly interest
	 */
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		// INPUTS
		System.out.println("Enter principal amount: ");
		double totalAutoLoan = scanner.nextDouble();
		System.out.println("Enter interest rate: : ");
		double annually_rate = scanner.nextDouble();
		System.out.println("Enter laon term: ");
		double month = scanner.nextDouble();
	
		
		// call the function 
		double monthlyPayment = monthlyPayment(totalAutoLoan, annually_rate, month);
		System.out.println("monthly payment: " + monthlyPayment);
		
		// call the function
		double monthlyInterest = monthlyInterest(annually_rate, totalAutoLoan, month);
		System.out.println("monthly interest: " + monthlyInterest);
		scanner.close();
	}
	
	// OUTPUTS
	public static double monthlyPayment(double p, double i, double n) {
		return  (p + (p / i / n)) / n;
//		return p * ( i * Math.pow(1 + i, n)) / ((Math.pow(1 + i, n - 1)));
	}
	
	// OUTPUTS
	public static double monthlyInterest(double i, double p, double n) {
		return ((i / 12) * p ) / n;
	}

}
