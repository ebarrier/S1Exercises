package test1;

import java.util.ArrayList;

public class Mean {

	
	//Write a method in Java to find the number of elements strictly less than arithmetic mean of all elements of a given array of real numbers d 
	//(arithmetic mean = sum_of_elements / number_of_elements). 
	
	public static void main(String[] args) {
		System.out.println(allaKeskmise(new double[] { 2., 4., 4., 6. }));
		System.out.println(allaKeskmise(new double[] { -2., 4., 4., 42. }));
		System.out.println(allaKeskmise(new double[] { -2., -100., 4., 12345. }));
		System.out.println(allaKeskmise(new double[] { 0., 0, 0 }));
		
	}

	public static int allaKeskmise(double[] d) {
		
		double mean = 0;
		double sum = 0;
		ArrayList newList = new ArrayList();
		int numberElements = 0;
		
		for (int i = 0; i < d.length; i++) {
			sum = sum + d[i];
		}
		
		mean = sum / d.length;
		System.out.println("mean = " + mean);
		
		for (int i = 0; i < d.length; i++) {
			if (d[i] < mean) {
				newList.add(d[i]);
			}
		}
		
		numberElements = newList.size();
		
		return numberElements;
	}

}
