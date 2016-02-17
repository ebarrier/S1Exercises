package test1;

public class SumNeg {

	public static void main(String[] args) {
		System.out.println(negSumma(new int[] { 0 }));
		System.out.println(negSumma(new int[] { -1, -2, 0, 5, 6 }));
		System.out.println(negSumma(new int[] { -100, 100 }));
		System.out.println(negSumma(new int[] { -10, -1, -3, -5, 1, 10 }));

		
	}

	
	public static int negSumma(int[] m) {
		
		int sum = 0;
		
		for (int i = 0; i < m.length; i++) {
			if (m[i] < 0) {
				sum = sum + m[i];
			}
		
		}
		
		return sum;
	}

}
