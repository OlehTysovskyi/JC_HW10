package Third_Task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("-Enter your sentence:");
		String line = new String(scn.nextLine());
		
		int countWords = 0;

		if (line.length() != 0) {
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == ' ') {
					countWords++;
				}
			}
		}
		else {
			System.err.println("You didn't enter a sentence");
		}
	
		System.out.println("-The number of words in your sentence is: " + (countWords + 1) + ".");

	}
}
