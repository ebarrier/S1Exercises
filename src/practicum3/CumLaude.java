package practicum3;

import lib.TextIO;

public class CumLaude {
	public static void main(String[] args) {
		System.out.println("Please enter your overall grade");
		double overall = TextIO.getlnDouble();
		System.out.println("Please enter your thesis grade");
		double thesis = TextIO.getlnDouble();
		
		if (overall >= 4.5 && thesis == 5) {
			System.out.println("Congratulations you are Cum Laude!");
		}
		else {
			System.out.println("Sorry you are not Cum Laude...");
		}
	}

}
