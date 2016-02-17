package seminar1;

import lib.TextIO;

public class PoliteName {
	public static void main(String[] args) {
		System.out.println("Please enter your name");
		String name = TextIO.getlnString();
		
		System.out.println("Warm welcome " + name + "!");
	}

}
