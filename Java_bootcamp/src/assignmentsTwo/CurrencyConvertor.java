package assignmentsTwo;

import java.util.Scanner;

public class CurrencyConvertor {

	public static void main(String[] args) {
		// Chinese yuan convert to USA dollar (1 dollar to 6.35 yuan)
		Scanner reader = new Scanner(System.in);
		System.out.println("How much ?");
		double money = reader.nextDouble();
		
		double yuan = chineseToUSA(money);
		System.out.println("You have " + yuan + " yuan");
		double dollar = usaToChinese(money);
		System.out.println("You have " + dollar + " dollars");
		reader.close();
		
	}
	
	// Chinese Yuan convert to  USA dollar
	public static double chineseToUSA(double money) {
		return money / 6.35;
	}
	
	// dollars convert to Chinese 
	public static double usaToChinese(double money) {
		return money * 6.35;
	}

}
