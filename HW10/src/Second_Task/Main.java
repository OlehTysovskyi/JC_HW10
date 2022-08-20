package Second_Task;

public class Main {
	
	public static void main(String[] args) {
		
		String line = new String("You are the best java developer");
		char[] lineArr = line.toCharArray();
		
		char [] symArr = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
		
		for(int i=0; i < lineArr.length; i++) {
			for(int j=0; j < symArr.length; j++) {
				if(lineArr[i] == symArr[j]) {
					line = line.replace(symArr[j], '-');
				}		
			}
		}
		
		System.out.println(line);
	}	
}
