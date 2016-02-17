package practicum5;

import junit.framework.TestCase;

public class CharactersTest extends TestCase {

	public void testxCharacters() {
		
		assertEquals("---", Characters.xCharacters('-', 3));
	}
	
	public void testxCharactersExtremes() {
		
		assertEquals("", Characters.xCharacters('-', 0));
		assertEquals("", Characters.xCharacters('-', -5));
		assertEquals("aa", Characters.xCharacters('a', 3));
	}
}
