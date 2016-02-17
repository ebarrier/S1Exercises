package practicum8;

import java.util.ArrayList;
import java.util.Collections;

public class Cardgame {
	
	public static ArrayList<Card> newSetOfCards() {
		ArrayList<Card> set = new ArrayList<>();
		
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				set.add(new Card(rank, suit));
				
			}
		}
		
		return set;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Card> setOfCards = newSetOfCards();
		
		Collections.shuffle(setOfCards);
		
		ArrayList<Card> hand = new ArrayList<>();
		
		int index = 0;
		while (hand.size() < 5) {
			hand.add(setOfCards.remove(index++));
		}
		for (Card card : hand) {
			// what to put in here? :p
			
			}
		System.out.println(hand);
		
		
	}
		
}


