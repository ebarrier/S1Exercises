package practicum4;

public class NumberLines {

	public static void main(String[] args) {
		
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + "  ");
		}
		
		System.out.println();
		
		for (int i = 0; i <= 10; i++) {
			System.out.print((10 - i) + "  ");
		}
		
		// --------------------------------------------
		
		System.out.println();
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "  ");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i <= 10; i += 2) {
				System.out.print(i + "  ");
		}
		
		// --------------------------------------------
		
		System.out.println();

		for (int i = 0; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.print((30 - i) + "  ");
			}
		}
		
		System.out.println();
		
		for (int i = 30; i >= 0; i--) {
			if (i % 3 == 0) {
				System.out.print(i + "  ");
			}
		}
	}
}
