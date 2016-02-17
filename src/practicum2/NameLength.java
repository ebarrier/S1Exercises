package practicum2;

import lib.TextIO;

public class NameLength {
	public static void main(String[] args) {
		System.out.println("Please enter your name");
		String name = TextIO.getlnString();
		int nameLength = name.length();
		System.out.println(nameLength);
		
		System.out.println("abracadabra".length());
	}

}
