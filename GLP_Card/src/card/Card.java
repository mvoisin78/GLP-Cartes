package card;

public class Card {
	//private String type; 
	private int value;
	private EnumColor c;  //Clubs - Diamonds - Hearts - Spades
	
	public Card(EnumColor c, int value) { 
		this.c = c;
		this.value = value;
	}

	public EnumColor getColor() {
		return c;
	}

	public int getValue() {
		return value;
	}
	
}
