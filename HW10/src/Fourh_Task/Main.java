package Fourh_Task;

public class Main {

	public static void main(String[] args) {

		String line = "I love playing footbal and I love to write Java code also I like listening music";
		String [] wordsArr = line.toLowerCase().split(" ");
		
		String temp = "";
		int count = 0, tempCount = 0;
	
		for(int i=0; i < wordsArr.length; i++) {
			tempCount = 0;
			for(int j=0; j < wordsArr.length; j++) {
				if(wordsArr[i].equals(wordsArr[j])) {
					tempCount++;
				}							
			}
			if(tempCount > count) {
				count = tempCount;
				temp = wordsArr[i];
			}
		}
		
		System.out.println("The most repeated word is: '" + temp.toUpperCase() + "'.");
	}
}
