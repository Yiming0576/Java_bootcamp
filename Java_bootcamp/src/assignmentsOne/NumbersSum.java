package assignmentsOne;

import java.util.Scanner;

public class NumbersSum {
	
	public static void main(String[] args) {
		// OUTPUTS
		System.out.println("Sum:" + sumNumber());
	}
	
	public static int sumNumber() {
		// INPUTS AND PROCESSING 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers:  \nEnter a letter 0 to stop: ");
		int sum = 0;
		while(true) {
			int number = scanner.nextInt();
			if (number == 0) {  // to end of the loop
				break; 
			} else {
				sum = sum + number;
			}
			
		}
		scanner.close();
		return sum;
	}
}