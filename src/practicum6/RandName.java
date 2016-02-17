package practicum6;

import java.util.ArrayList;

import lib.TextIO;


public class RandName {
	
	public static void main(String[] args) {
		
		int numNames;
		
		System.out.println("Please enter how many names you would like to enter in the list.");
		numNames = TextIO.getlnInt();
		
		String[] names = new String[numNames];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Please type a name");
			names[i] = TextIO.getlnString();
		} 
		
		int randomIndex = (int) (Math.random() * names.length);
		
		System.out.println("Random name " + names[randomIndex]);
		
		
		//Other way
				
		ArrayList<String> names2 = new ArrayList<>();
		
		System.out.println("Please insert the number of names you woud like to have in your list");
		
		int numNames2 = TextIO.getlnInt();
		
		System.out.format("Please insert %d names:%n", numNames2);
		
		for (int i = 0; i < numNames2; i++) {
			names2.add(TextIO.getln());
		}
		System.out.println(names2);
		
		int randomIndex2 = (int) (Math.random() * numNames2);
		System.out.println("A random name: " + names2.get(randomIndex2));
			
		}
		
		
	}
