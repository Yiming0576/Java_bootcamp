package assignmentsOne;

import java.util.Scanner;

public class GCFAndLCF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		
		int gcf = GCF(number1, number2);
		System.out.println(number1 + " and " + number2 + " greatest common factor: " + gcf);
		int lcf = LCF(number1, number2);
		System.out.println(number1 + " and " + number2 + " least common factor: " + lcf);
		
		scanner.close();
	}
	
	// PROCESSING
	public static int GCF(int x, int y) {
		if (y == 0) {
			return x;
		}
		return (GCF(y, x % y));
	}
	
	//PROCESSING
	public static int LCF(int x, int y) {
		return x * y / GCF(x, y);
	
	}
}
