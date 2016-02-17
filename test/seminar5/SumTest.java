package seminar5;

import junit.framework.TestCase;

public class SumTest extends TestCase {
	
	public void testsum() {
		
		assertEquals(7, Sum.sum(3, 4, 0));
		assertEquals(-1, Sum.sum(0,-10, 9));
		assertEquals(-100, Sum.sum(0,-99, -10));
		assertEquals(100, Sum.sum(0,99, 10));
	}
	
	public void testsumExtreme() {
		
		assertEquals(100, Sum.sum(0, Integer.MAX_VALUE, 1));
	
	}

	public void testsumbis() {
		
		Sum.sum(0, Integer.MAX_VALUE, 1);
		
	}
	
}
