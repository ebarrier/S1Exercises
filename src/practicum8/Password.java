package practicum8;

import org.apache.commons.codec.digest.DigestUtils;

public class Password {
	
	public static final String LOOKUP_HASH
		= "faefdc03852fb43584f106daf4940cae";
	
	public static final String POSSIBLE
		= "abcdefghijklmnopqrstuvwxyz0123456789";
	
	
	public static boolean hasTheRightHash(String text) {
		return DigestUtils.md5Hex(text).equals(LOOKUP_HASH);
	}
	
	public static void main(String[] args) {
				
		int length = POSSIBLE.length();
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				for (int k = 0; k < length; k++) {
					for (int l = 0; l < length; l++) {
						String word = String.valueOf(POSSIBLE.charAt(i))
						+POSSIBLE.charAt(j)
						+POSSIBLE.charAt(k)
						+POSSIBLE.charAt(l);
					if (hasTheRightHash(word)) {
						System.out.println("found the word " + word);
						return;
					}
					}
				}
			}
		}
	}

}
