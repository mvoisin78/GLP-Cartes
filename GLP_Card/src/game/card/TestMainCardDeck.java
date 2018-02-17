package game.card;
import game.player.*;

public class TestMainCardDeck {

	public static void main(String[] args) {
		
		Draw draw = new Draw();
		History history = new History();
		Hand hand = new Hand();
		Probability proba = new Probability(draw, history, hand);
		
		draw.init();
		draw.shuffle();
		for(int i=0; i<54;i++) {
			System.out.println(draw.getCard(i).getValue() +"    " + draw.getCard(i).getColor());
		}
		System.out.println("--------------------------------------");
		System.out.println("Player hand : ");
		for(int index = 0; index <5; index++) {
			hand.add(draw.getCard(index));
			//history.addCard(draw.getCard(index));
			draw.deleteCard(index);
			System.out.println(hand.getCardHand(index).getValue());
		}
		System.out.println("--------------------------------------");
		EnumValue playedCard = hand.getCardHand(1).getValue();
		System.out.println("Card played = " + playedCard);
		hand.removeCard(1);
		proba.followRisk(playedCard);
		
	}
}
