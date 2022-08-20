package First_Task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("-Enter word for checking :");
			StringBuffer word = new StringBuffer(scn.next().toUpperCase());
			
			try {		
				if(word.length() == 5) {
					if((word.charAt(0) == word.charAt(4)) && (word.charAt(1) == word.charAt(3))) {
						System.out.println("Your word - IS palindrome.");
					}
					else {
						System.out.println("Your word - IS NOT palindrome.");
					}
				}
				else {
					throw new MyException();
				}
			}
			catch (MyException e) {
				System.out.println("!-You didn't enter word with 5 letters, try one more time.");
			}
		}
		
//		if(word == word.reverse()) {
//			System.out.println("Word '" + word + "' - IS palindrome");
//		}
//		else {
//			System.out.println("Word '" + word + "' - IS NOT palindrome");
//		}
	}
}
