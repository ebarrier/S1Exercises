package practicum3;

import lib.TextIO;

public class Agediff {
	public static void main(String[] args) {
		System.out.println("Please enter an age");
		int age1 = TextIO.getlnInt();
		System.out.println("Please enter another age");
		int age2 = TextIO.getlnInt();
		
		int diff = Math.abs(age1 - age2);
		
		if (diff <= 5) { 
			System.out.println("Good");
		}
		else if (diff <= 10) { // instead of (diff > 5 &&  diff <= 10): unnecessary condition
			System.out.println("Very good");
		}
		else if (diff <= 15) { // instead of (diff > 10 && diff <= 15): unnecessary condition
			System.out.println("Impressive");
		}
		else {
			System.out.println("Incredible");
		}
	}

}
