package assignmentsThree;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the r: ");
		double r = sc.nextDouble();
		areaOfCircle(r);
		sc.close();
		
	}
	
	public static double areaOfCircle(double r) {
		return Math.pow(r, r) * 3.14;
	}

}
