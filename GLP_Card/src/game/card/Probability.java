package game.card;
import game.player.*;

public class Probability {
	private History history;
	private Draw draw;
	private int probability;
	private Hand hand;
	
	public Probability(Draw draw, History history, Hand hand){
		this.draw = draw;
		this.history = history;
		this.hand = hand;
		probability = 54;
	}
	
	
	public void followRisk(Card playedCard){
		historyProba(playedCard);
		handProba(playedCard);
	}
	
	public void historyProba(Card playedCard) { //Increment for each card who follow the played Card in the History
		int index;
		int historySize = history.getSizeHistory();
		Card sameCard; // Compared card for find same
		EnumValue sameCardValue;
		int followCardValue;
		
		EnumValue playedCardEnumValue = playedCard.getValue();
		int playedCardValue = playedCardEnumValue.getEnumValue() + 1; // The EnumValue +1 (following) for the played card
	
		for (index = 0; index < historySize; index++) {
			
			sameCard = history.getCardHistory(index);
			sameCardValue = sameCard.getValue();
			followCardValue = sameCardValue.getEnumValue() + 1; //The EnumValue +1 (following) for each card in the players hand
			
			if(playedCardValue == followCardValue) {
					probability --;
			}
		}
	}
	
	public void handProba(Card playedCard) { // Decrement for each card who follow the played Card in the player's hand
		int index;
		int handSize = hand.getSizeHand();
		int followCardValue;
		Card sameCard;
		EnumValue sameCardValue;
		
		EnumValue playedCardEnumValue = playedCard.getValue();
		int playedCardValue = playedCardEnumValue.getEnumValue() + 1; // The EnumValue +1 (following) for the played card
	
		for (index = 0; index < handSize; index++) {
			
			sameCard = hand.getCardHand(index);
			sameCardValue = sameCard.getValue();
			followCardValue = sameCardValue.getEnumValue() + 1; //The EnumValue +1 (following) for each card in the players hand
			
			if(playedCardValue == followCardValue) {
					probability --;
			}
		}
	}
}

// cartes en main - Carte History - Nbr de carte dans les mains adverses 