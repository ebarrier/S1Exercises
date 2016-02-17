package practicum3;

import lib.TextIO;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		int num = TextIO.getlnInt();
		
		if (num % 2 == 0) {
			System.out.println("The number you typed is even!");
		}
		else {
			System.out.println("The numer you typed is odd!");
		}
	}

}
