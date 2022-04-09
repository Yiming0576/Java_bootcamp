package assignmentsOne;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// INPUTS 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		// OUTPUTS
		System.out.println(leapYear(year));
		scanner.close();

	}
	
	// PROCESSING
	public static boolean leapYear(int year) {
		if (year % 4 == 0 && year % 400 == 0) {
			return true;
		}
		return false; 
	}

}
