package assignmentsOne;

import java.util.Scanner;

public class NumsSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("Sum: " + sum(num1, num2));
		scanner.close();
		
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

}
