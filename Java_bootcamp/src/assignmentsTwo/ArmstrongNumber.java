package assignmentsTwo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		// INPUTS
		System.out.println("Enter a low: ");
		int num1 = reader.nextInt();
		System.out.println("Enter a high: ");
		int num2 = reader.nextInt();
		
		// call the function
		findArmstrong(num1, num2);
		
		// OUTPUTS
		System.out.println();
		reader.close();
		
		
	}
	
	// PROCESSING
	public static void findArmstrong(int low, int high) {
		
		for( int i = low + 1; i < high; ++i) {
			
			int x = i;
			int n = 0;
			while( x != 0) {
				x /= 10;
				++n;
			}
			
			int pow_sum = 0;
			x = i;
			while (x != 0) {
				int digit = x % 10;
				pow_sum += Math.pow(digit, n);
				x /= 10;
			}
			
			
			if (pow_sum == i) {
				System.out.print(i + " ");
			}
		}
	}

}
