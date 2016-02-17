package practicum4;

public class Matrix2 {
	
	public static void main(String[] args) {
		
		int size = 7;
		
		int lineSize = size * 2 + 3;
		//String line = String.format("%" + lineSize + "s", "").replace(' ', '-');
		String line = "";
		for (int i = 0; i < lineSize; i++) {
			line = line + "-";
		}
		System.out.println(line);
				
	
		for (int row = 0; row < size; row++) {
			
			System.out.print("| ");
			
			for (int col = 0; col < size; col++) {
				if (row == col || row + col == size-1) {
					System.out.print("1" + " ");
				}
				else {
					System.out.print("0" + " ");
				}
			}
			System.out.println("|");
		}
		
		System.out.println(line);
	}

}
