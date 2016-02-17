package practicum7;

import java.util.ArrayList;

import lib.TextIO;

public class NameAge {

	public static void main(String[] args) {
		
		ArrayList<Human> persons = new ArrayList<>();
		while (true) {
			System.out.println("Please insert a name");
			String name = TextIO.getlnString().trim();
			if (name.isEmpty()) {
				break;
			}
			else {
				System.out.println("Please insert an age");
				int age = TextIO.getlnInt();
				Human person = new Human (name, age);
				persons.add(person);
			}
		}
		System.out.println(persons);
		
//		for (Human person : persons) {
//			person.greet();
//		}
	}	
}		
	

