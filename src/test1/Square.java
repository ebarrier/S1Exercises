package test1;

public class Square {

	public static void main(String[] args) {
		System.out.println(summaRuut(5., -5.));
		System.out.println(summaRuut(1., 2.));
		System.out.println(summaRuut(2., 2.));
		System.out.println(summaRuut(-6., 1.));
		System.out.println(summaRuut(-4.2, 1.));
		
	}

	public static double summaRuut(double a, double b) {
		
		double sum = a + b;
		double root = Math.pow(sum, 2);
		
		return root;
	}

}
