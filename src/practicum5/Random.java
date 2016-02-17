package practicum5;

public class Random {
	
	
	//Write a method that returns a random integer number which is between the given values. 
	public static int random(int min, int max) {
		int random = (int)(Math.random() * (max - min + 1)) + min;
		return random;
	}

	public static void main(String[] args) {
		System.out.println(random(6, 7));
	}
	
}
