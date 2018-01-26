package card;

public class CardDeck {
	private Card[] deck;
	private static final int CARD_NUMBER = 54;
	
	public CardDeck(){
		deck = new Card[CARD_NUMBER];
	}
	
	public void InitPackage() { //Set the Values and Type for each card in the deck
		int cardNumber = 0;
		for (EnumColor color : EnumColor.values()) {
			for(EnumValue value : EnumValue.values()) {
				if (color.getValue()!=4 && value.getValue()!=17) { //Exclude Joker
					deck[cardNumber] = new Card(color, value);
					cardNumber ++;
				}
			}
			
		}
		deck[52] = new Card(EnumColor.Joker,EnumValue.Joker); //init Jokers
		deck[53] = new Card(EnumColor.Joker,EnumValue.Joker);
		
		
	}

	public Card getCard(int cardNumber) {
		return deck[cardNumber];
	}
	
	public EnumValue getCardValue(Card card) {
		return card.getValue();
	}
	
	public EnumColor getCardColor(Card card) {
		return card.getColor();
	}
}
