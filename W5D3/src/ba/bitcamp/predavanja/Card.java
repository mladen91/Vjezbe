package ba.bitcamp.predavanja;

public class Card {

	public static final int HEART=0;
	public static final int DIAMOND=1;
	public static final int CLUBS=2;
	public static final int SPADES=3;
	public static final int JOKER=4;
	
	public static final int ACE=1;
	public static final int JACK=11;
	public static final int QUEEN=12;
	public static final int KING=13;
	private int value;
	private int suit;
	private boolean isJoker;

	public Card(int value, int suit) throws IllegalArgumentException {
		if (value < 1 || value > 13) {
			throw new IllegalArgumentException("Value is not in range");
		}
		if (suit < 0 || suit > 4) {
			throw new IllegalArgumentException("Suit not in range.");
		}
		this.value = value;
		this.suit = suit;
	}

	public Card() {
		this.value = 4;
		this.suit = 1;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (isJoker == false) {
			throw new UnsupportedOperationException("Can't change value");
		}
		this.value = value;
	}

	public int getSuit() {
		return suit;

	}

	public void setSuit(int suit) {

		if (isJoker == false) {
			throw new UnsupportedOperationException("Can't change value");
		}

		if (suit < 0 || suit > 4) {
			throw new IllegalArgumentException("Suit not in range.");
		}
		this.suit = suit;
	}

	public String getValueString(){
		if (value == 1 || value >10){
			switch (value) {
			case ACE:
				return "Ace";
			case JACK: 
				return "Jack";
			case QUEEN:
				return "Queen";
			case KING: 
				return "King";
				default: 
					return "";
			}
				
			}else {
				return Integer.toString(value);
			}
	}
	
	public String getSuitString(){
		switch(suit){
		case HEART:
			return "Heart";
		case DIAMOND:
			return "Diamond";
		case CLUBS:
			return "Club";
		case SPADES:
			return "Club";
		default:
			return "Joker";
		}
	}
	
	public String getCard() {
		return getValueString() + getSuitString(); 

	}
	public String toString(){
		return getCard();
	}

}
