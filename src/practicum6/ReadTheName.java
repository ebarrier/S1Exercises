package practicum6;

public class ReadTheName {
	
	public static void main(String[] names) {

		String name = "alien";
		String friends = "";
		if (names.length > 0) {
			name = names[0];
			if (names.length > 1) {
				friends += "Oh, you have friends too!? (";
				for (int i = 1; i < names.length; i++) {
					if (i != 1) {
						friends += ", ";
					}
					friends += names[i];
				}
				friends += ")";
			}
		}
		
		System.out.format("\n\nHello %s! How are you!?\n\n%s\n", name, friends);
	}
	
}

// to insert arguments without the commmand line, go to run -> run configurations  

//String name = "alien";
//StringBuilder friends = new StringBuilder();
//if (names.length > 0) {
//	name = names[0];
//	if (names.length > 1) {
//		friends.append("Oh, you have friends too!? (");
//		for (int i = 1; i < names.length; i++) {
//			if (i != 1) {
//				friends.append(", ");
//			}
//			friends.append(names[i]);
//		}
//		friends.append(")");
//	}
//	else {
//		friends.append("Error! No friends found!");
//	}
//}
//
//System.out.format("\n\nHello %s! How are you!?\n\n", name);
//System.out.println(friends);
//}
//
//}