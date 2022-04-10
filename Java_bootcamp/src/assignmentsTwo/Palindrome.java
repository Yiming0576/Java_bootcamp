package assignmentsTwo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// INPUTS
		System.out.println("Enter a word: ");
		String  word =reader.next();
		
		// OUTPUTS
		System.out.println(palindrome(word));
		reader.close();
	}
	
	// PROCESSING
	public static boolean palindrome(String word) {
		int i = 0, j = word.length() - 1;
		
		while(i < j) {
			
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
			
		
		
	}

}
