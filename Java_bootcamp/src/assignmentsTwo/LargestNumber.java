package assignmentsTwo;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		// INPUTS
		System.out.println("Enter a number: ");
		int num1 = reader.nextInt();
		System.out.println("Enter a number: ");
		int num2 = reader.nextInt();
		System.out.println("Enter a number: ");
		int num3 = reader.nextInt();
		
		// call the function
		int largestNumber = getLargestNumber(num1, num2, num3);
		System.out.println("Largest number is " + largestNumber);
		reader.close();
	}
	
	// PROCESSING
	public static int getLargestNumber(int num1, int num2, int num3) {
		int largestNumber = 0;
		
		if (num1 > num2 && num1 > num2) {
			largestNumber = num1;
		} else if (num2 > num1 && num2 > num3) {
			largestNumber = num2;
		} else {
			largestNumber = num3;
		}
		return largestNumber;
		
	}

}
