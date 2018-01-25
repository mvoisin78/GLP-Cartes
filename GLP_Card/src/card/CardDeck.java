package card;

public class CardDeck {
	private Card[] deck;
	private static final int CARD_NUMBER = 54;
	
	public CardDeck(){
		deck = new Card[CARD_NUMBER];
	}
	
	public void InitPackage() { //Set the Values and Type for each card in the deck

		int i;
		for(i=0;i<=12;i++) { // Init the 54 first card
			deck[i]= new Card(EnumColor.Club,i+1); 
			deck[i+13]= new Card(EnumColor.Diamond,i+1);
			deck[i+26]=new Card(EnumColor.Heart,i+1);
			deck[i+39]=new Card(EnumColor.Spade, i+1);
		}
		deck[53]=new Card(EnumColor.Joker, 15); //Init Jokers
		deck[54]=new Card(EnumColor.Joker, 15);
		
	}

	public Card getCard(int cardNumber) {
		return deck[cardNumber];
	}
	
	public int getCardValue(Card card) {
		return card.getValue();
	}
	
	public EnumColor getCardColor(Card card) {
		return card.getColor();
	}
}
