package practicum6;

import java.util.Arrays;

import lib.TextIO;

public class OppOrder {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please type a number");
			int number = TextIO.getlnInt();
			numbers[i] = number;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for (int i = numbers.length - 2; i >=0; i--) {
			System.out.println(Arrays.toString(numbers));
		}

		
		/*public static void main(String[] args) {
		int count = 5;
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.format("Please insert %d numbers:\n", count);
		for (int i = 0; i < count; i++) {
			numbers.add(TextIO.getlnInt());
		}
		
		// numbers.size - 1 .. 0
		for (int i = 0; i < numbers.size(); i++) {
			int oppositeIndex = numbers.size() - i - 1;
			System.out.print(" " + numbers.get(oppositeIndex));
		}
		System.out.println();
		
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.print(" " + numbers.get(i));
		}
		System.out.println();
		
		Collections.reverse(numbers);
		for (Integer number : numbers) {
			System.out.print(" " + number);
		}

	}*/		
	}

}
