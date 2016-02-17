package practicum5;

import lib.TextIO;

public class MinMax2 {
	
	public static int getNumber(String question, int min, int max) {
		
		while (true) {
			System.out.println(question);
			int num = TextIO.getlnInt();
			if (num >= min && num <= max) {
				return num;
			}
			System.out.format("Wrong input! ", min, max);
		} 
	}

	public static int getNumber(int min, int max){
		String question = String.format("Please insert a number between %d and %d.", min, max);
		return getNumber(question, min, max);
	}

	public static void main(String[] args) {
		System.out.println("The number you typed is: " + getNumber(0, 100));
	}
	
}
