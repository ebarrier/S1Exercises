package practicum7;

public class Human {

	public String name;
	public int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		greet();
	}
	
	public void greet() {
		
		if (age > 3) {
			System.out.println("Boo boo");
		}
		else {
			System.out.println("Hello, I am John and I am 15 years old.");
		}
			
		
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", name, age);
	}
	
}
