package seminar5;

public class Sum {
	
	// result should be between -100 and 100
	public static int sum(int a, int b, int c) {
		long sum = (long) a + b + c;
		
		if (sum < -100) {
			return -100;
		}
		else if (sum > 100) {
			return 100;
		}
		else {
			return (int) sum;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Sum.sum(0, Integer.MAX_VALUE, 1));
	}

}
