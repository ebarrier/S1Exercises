package practicum8;

public enum Rank {
	
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);
	
	private int value;
	
	Rank(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		if (value < 10) {
			return String.valueOf(value);
		}
		return super.toString().toLowerCase();
	}
}
