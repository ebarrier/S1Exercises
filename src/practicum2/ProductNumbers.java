package practicum2;

import lib.TextIO;

public class ProductNumbers {
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		double num1 = TextIO.getlnDouble();
		System.out.println("Please enter another number");
		double num2 = TextIO.getlnDouble();
		
		double product = num1 * num2;
		
		System.out.println("The product of the numbers you entered is " + product);
	}

}
