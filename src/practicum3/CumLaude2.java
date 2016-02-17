package practicum3;

import lib.TextIO;

public class CumLaude2 {
	
	public static void main(String[] args) {
		
		double averageGrade;
		
		while (true) {
			System.out.println("Please insert your average grade");
			averageGrade = TextIO.getlnDouble();
			if (averageGrade < 0) {
				System.out.println("Your grade cannot be negative. Please insert again");
			}
			else {
				break;
			}
		}
			
		System.out.println("Please insert your thesis grade");
		
		double thesisGrade = TextIO.getlnDouble();
		
		boolean gradeGood = averageGrade >= 4.5;
		boolean thesisGood = thesisGrade == 5;
		
		if (gradeGood && thesisGood) {
			System.out.println("Congratulations you are Cum Laude!");
		}
		else {
			System.out.println("Sorry you are not Cum Laude, try again!");
			
		}
	}

}
