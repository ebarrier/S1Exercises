package practicum7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import lib.TextIO;

public class NameResult {

	public static void main(String[] args) {
		
		ArrayList<Athlete> athletes = new ArrayList<>();
		
		while (true) {
			System.out.println("Please inster a name and a result in one line");
			String input = TextIO.getlnString().trim();
			
			if (input.isEmpty()) {
				break;
			}
			
			String[] words = input.split(" ");
			
			String name = words[0];
			double result = Double.parseDouble(words[1]);
			
			
			Athlete champion = new Athlete(name, result);
			athletes.add(champion);
		}
		
		Collections.sort(athletes, new Comparator<Athlete>() {
			@Override
			public int compare(Athlete a1, Athlete a2) {
				return -a1.getResult().compareTo(a2.getResult());
			}
		});
		
		for (Athlete athlete : athletes) {
			System.out.format("%5.1f %s\n", athlete.getResult(), athlete.getName());
		}
	}
	
}
