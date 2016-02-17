package seminar7;

import org.apache.commons.codec.digest.DigestUtils;

import lib.TextIO;

public class Md5 {
	
	public static void main(String[] args) {
		System.out.println("Please insert some text");
		String text = TextIO.getlnString();
		System.out.println(DigestUtils.(text));
	}

}
