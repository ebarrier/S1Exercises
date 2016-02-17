package practicum2;

import lib.TextIO;

public class Group {
	public static void main(String[] args) {
		System.out.println("Please enter how many people there are all together");
		int people = TextIO.getlnInt();
		System.out.println("Please enter how many people can for a group");
		int groupSize = TextIO.getlnInt();
		
		int groups = people / groupSize;
		int leftOut = people % groupSize;
		
		System.out.format("You can make %s groups, and %s will be left out.", groups, leftOut);
	}

}
