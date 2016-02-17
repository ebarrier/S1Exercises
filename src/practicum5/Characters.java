package practicum5;

public class Characters {
	
	//Write a method that creates a String consisting of x amount of given character.
	public static String xCharacters(char c, int x) {
		String output = "";
		for (int i = 0; i < x; i++) {
			output = output + c;
			System.out.println(output);
		}
		return output;
	}

	public static void main(String[] args) {
		xCharacters('L', 100);
		}
}