package test1;

public class Range {

	public static void main(String[] args) {
		System.out.println(posPaarisarv(0));
		System.out.println(posPaarisarv(-1));
		System.out.println(posPaarisarv(-2));
		System.out.println(posPaarisarv(3));
		System.out.println(posPaarisarv(4));
		System.out.println(posPaarisarv(2));
		System.out.println(posPaarisarv(10));
	}

	public static boolean posPaarisarv(int n) {
		
		if (n > 0) {
			if (n%2 == 0) {
				return true;
			}
		}
		return false;
		
	}

}
