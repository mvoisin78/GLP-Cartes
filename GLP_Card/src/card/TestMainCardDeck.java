package card;

public class TestMainCardDeck {

	public static void main(String[] args) {
		CardDeck deck1 = new CardDeck();
		deck1.InitPackage();
		for(int i=0; i<52;i++) {
			System.out.println(deck1.getCardValue(deck1.getCard(i)) +" " + deck1.getCardColor(deck1.getCard(i)));
		}
		
	}

}