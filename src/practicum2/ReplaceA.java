package practicum2;

import lib.TextIO;

public class ReplaceA {
	public static void main(String[] args) {
		System.out.println("Please enter a sentence");
		String sentence = TextIO.getlnString();
		System.out.println(sentence.replace('a', '_'));
	}

}
