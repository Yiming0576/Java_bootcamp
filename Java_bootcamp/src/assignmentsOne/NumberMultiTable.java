package assignmentsOne;

import java.util.Scanner;

public class NumberMultiTable {

	public static void main(String[] args) {
		
		// INPUTS
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = scanner.nextInt();
		
		// CALL FUNCTION
		multiTable(number);
		scanner.close();

	}
	
	// PROCESSING
	public static void multiTable(int x) {
		int multitable = 0;
		for (int i = 1; i < 100; i++) {
			multitable = i * x;
			
			//OUTPUTS
			System.out.println("i:" + i + "*" + x + " = " + multitable);
		}
	}

}
