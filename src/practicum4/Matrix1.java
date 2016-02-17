package practicum4;

public class Matrix1 {

	public static void main(String[] args) {
		
		int size = 7;
		
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (row == col) {
					System.out.print("1" + " ");
				}
				else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}

	}

}
