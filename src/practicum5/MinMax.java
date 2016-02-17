package practicum5;

import lib.TextIO;

public class MinMax {
	
	public static int getNumber(int min, int max) {
		while (true) {
			System.out.format("Please insert a number between %s and %s", min, max);
			System.out.println();
			int num = TextIO.getlnInt();
			if (num >= min && num <= max) {
				System.out.println("The number you typed is: " + num);
				return num;
			}
			System.out.format("Wrong input! ", min, max);
		} 
	}

	public static void main(String[] args) {
		System.out.println(getNumber(0, 100));
	}
	
}
