package practicum10;

public class sumOfRowMax {

	public static int max(int[] row) {

		if (row.length == 0) {
			return 0;
		}

		int max = row[0];

		for (int i = 1; i < row.length; i++) {
			if (row[i] > max) {
				max = row[i];
			}

		}
		return max;
	}

	public static int sumOfRowMax(int[][] matrix) {

		int sum = 0;

		for (int[] row : matrix) {
			sum = sum + max(row);
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(max(new int[] { 4, 6, 1, 9 }));
		System.out.println(max(new int[] { -5, -10, -12 }));
		System.out.println(max(new int[] { 0, 2, 1 }));
		
		System.out.println(sumOfRowMax(new int[][] { 
				{ 4, 6, 1, 9 }, // max: 9
				{ -5, -10, -12 }, // max: -5
				{ 0, 2, 1 }, // max: 2
		}));
	}
}
