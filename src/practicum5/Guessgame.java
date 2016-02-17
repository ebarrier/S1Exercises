package practicum5;

import lib.TextIO;

public class Guessgame {

	//Write a method that asks user for input (by using TextIO), 
	//and returns the input only when user inserts a value between given minimum and maximum, otherwise asks to reinsert the number. 
	public static void main(String[] args) {
		System.out.println("Try to guess a number between 1 and 100");
		System.out.println("What do you think the number is?");
		
		int randomnum = (int) Math.random()	* 100 + 1;
		int guess = TextIO.getlnInt();
		
		if (guess < randomnum) {
			System.out.println("The number is higher");
		}
		else if (guess > randomnum) {
			System.out.println("The number is smaller");
		}
		else {
			System.out.println("Congratulations you found the number");
		}
		
		
	}
}
