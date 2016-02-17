package practicum3;

import lib.TextIO;

public class Password {
	public static void main(String[] args) {
		System.out.println("Please enter a password");
		String pass1 = TextIO.getlnString();
		System.out.println("Please enter the password again for checking");
		String pass2 = TextIO.getlnString();
		
		if (pass1.equals(pass2)) {
			System.out.println("The passwords match, well done!");
		}
		else {
			System.out.println("The passwords do not match sorry");
		}
	}

}
