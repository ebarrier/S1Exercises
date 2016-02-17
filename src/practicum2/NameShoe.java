package practicum2;

import lib.TextIO;

public class NameShoe {
	public static void main(String[] args) {
		System.out.print("Please enter your name");
		String name = TextIO.getlnString();
		System.out.println("Please enter your shoe size");
		int shoeSize = TextIO.getlnInt();
		
		System.out.println("Your name is " + name + " and your shoe size is " + shoeSize + ".");
		
		System.out.format("Your name is %s and your shoe size is %s.", name, shoeSize);
	}
}
