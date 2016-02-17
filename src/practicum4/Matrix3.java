package practicum4;

public class Matrix3 {
	public static void main(String[] args) {
		
		int size = 10;
		
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (row+col < size) {
					System.out.print(col+row + " ");				
				}
				else {
					System.out.print(col-(size-row)+ " ");
				}
			}
			System.out.println("");
		}
	}
}
