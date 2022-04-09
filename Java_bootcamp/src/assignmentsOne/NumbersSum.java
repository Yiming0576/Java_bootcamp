package assignmentsOne;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		System.out.println("Sum:" + sumNumber());
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static int sumNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers:  \nEnter a letter x to stop: ");
		int sum = 0;
		while(true) {
			String number = scanner.next();
			if (number.equals('x')) {
				break;
			} else {
				sum = sum + Integer.parseInt(number);
			}
			
		}
		return sum;
	}
}