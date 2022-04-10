package assignmentsTwo;

import java.util.Scanner;

public class Greeting {
	/*
	 * Take name as input and print a greeting message for that particular name.
	 */
	public static void main(String[] args) {
		// Inputs
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.next();
		
		//Call the function
		greeting(name);
		scanner.close();
	}
	// PROCESSING AND OUTPUTS
	public static void greeting(String name) {
		System.out.println("Hello " + name + "!");
	}

}
