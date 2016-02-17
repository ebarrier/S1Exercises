package practicum6;

import java.util.ArrayList;

import lib.TextIO;

public class InputName {
	
	public static int countAs(String name) {
		return name.length() - name.toLowerCase().replace("a", "").length();
	}
	//Write a program that lets user insert 10 names, then randomly prints out 
	//one of those names. Improve the program by asking user for the number of users first.
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		while (true) {
			System.out.println("Please insert the names you want");
			String input = TextIO.getlnString().trim();
			if (input.isEmpty()) {
				if (names.isEmpty()) {
					System.out.println("You must enter at least one name");
					continue;
				}
				else
				break;
			}
			names.add(input);
						
		}
		
		
		System.out.println(names);
	}

}
