package practicum5;

import junit.framework.TestCase;

public class RandomTest extends TestCase {
		
	public void testRandom() {
		for (int i = 0; i < 100; i++) {
		
			int randomValue = Random.random(0, 100);
			assertTrue("value should be greater equals to 0",
					randomValue >= 0);
			assertTrue("value should be less equals to 100",
					randomValue <= 100);
			
			randomValue = Random.random(0, 1);
			assertTrue("value should be either 0 or 1",
					randomValue == 0 || randomValue == 1);
			
			randomValue = Random.random(6, 7);
			assertTrue("value should be either 6 or 7",
					randomValue == 6 || randomValue == 7);
			
		}
	}
	
	public void testRandomNegative() {
		for (int i = 0; i < 100; i++) {
		
			int randomValue = Random.random(-100, 0);
			assertTrue(randomValue <= 0);
			assertTrue(randomValue >= -100);
			
			randomValue = Random.random(-4, 10);
			assertTrue(randomValue <= 10);
			assertTrue(randomValue >= -4);
			
			randomValue = Random.random(-4, -3);
			assertTrue(randomValue == -3 || randomValue == -4);
		}
	}
	
	public void testRandomInputOrder() {
		for (int i = 0; i < 100; i++) {
			int randomValue = Random.random(100, -200);
			assertTrue("value should be greater equals to -200",
					randomValue >= -200);
			assertTrue("value should be less equals to 100",
					randomValue <= 100);
		}
	}

}
