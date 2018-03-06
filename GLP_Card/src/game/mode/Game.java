package game.mode;

import game.player.*;
import game.card.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Game {
	Player currentPlayer;
	int index;
	Hand currentPlayerHand;
	Draw draw;
	
	public Game(Draw draw){
		this.draw = draw;
	}
	
	public void start(ArrayList<Player> players) {
		Iterator<Player> pIterator = players.iterator();
		while(pIterator.hasNext()) {
			currentPlayer = pIterator.next();
			currentPlayerHand = currentPlayer.getHand();
			for(index=0; index < 5; index++) {
				currentPlayerHand.add(draw.getCard(0));
				draw.deleteCard(0);
			}
		}
	}
	
	public int detectGameMode(ArrayList<Card> playedCards) {
		int fCard;
		int sCard;
		int tCard;
		int foCard;
		int fiCard;
		switch(playedCards.size()) {
			case 1:
				if(playedCards.get(0).getValue() != EnumValue.JOKER) {
					return 0; // 0 => Simple
				}
				break;
			
			case 2:
				fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
				sCard = playedCards.get(1).getValue().getEnumValue(); //Second card value
				if(fCard == sCard) {
					return 1; // 1 => Double
				}
				else if(fCard == 17 || sCard == 17){
					return 1;
				}
				break;	
			
			case 3:
				fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
				sCard = playedCards.get(1).getValue().getEnumValue(); //Second card value
				tCard = playedCards.get(2).getValue().getEnumValue(); // Third card value
				if(fCard==sCard && fCard==tCard) {
					return 3; // 3 => Triple game
				}
				else if(playedCards.get(0).getValue() == EnumValue.JOKER && (playedCards.get(1) == playedCards.get(2))) { // If first Card is Joker
					return 3;
				}
				else if(playedCards.get(1).getValue() == EnumValue.JOKER && (playedCards.get(0) == playedCards.get(2))) { // If Second Card is Joker
					return 3; 
				}
				else if(playedCards.get(2).getValue() == EnumValue.JOKER && (playedCards.get(0) == playedCards.get(1))) { // If Third Card is Joker
					return 3; 
				}
				else {
					fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
					sCard = playedCards.get(1).getValue().getEnumValue(); //Second card value
					tCard = playedCards.get(2).getValue().getEnumValue(); // Third card value
					if(fCard + 1 == sCard && sCard + 1 == tCard) {
						return 4; // 4 => Set of 3 cards
					}
					else if(fCard == 17 && (sCard + 1 == tCard)) { // If the first card is a Joker
						return 4;
					}
					else if(sCard == 17 && (fCard + 2 == tCard)) { // If the second card is a Joker
						return 4;
					}
					else if(tCard == 17 && (fCard + 1 == sCard)) { // If the third card is a Joker
						return 4;
					}
				}
				break;
			case 4:
				fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
				sCard = playedCards.get(1).getValue().getEnumValue(); //Second card value
				tCard = playedCards.get(2).getValue().getEnumValue(); // Third card value
				foCard = playedCards.get(3).getValue().getEnumValue(); // Fourth card value
				if(fCard + 1 == sCard && sCard + 1 == tCard && tCard + 1 == foCard) {
					return 5; // 5 => Set of 4 cards
				}
				else if(fCard == 17 && (sCard + 1 == tCard) && (tCard +1 == foCard)) { // If the first card is a Joker
					return 5;
				}
				else if(sCard == 17 && (fCard + 2 == tCard) && (tCard +1 == foCard)) { // If the second card is a Joker
					return 5;
				}
				else if(tCard == 17 && (fCard + 1 == sCard) && (sCard +2 == foCard)) { // If the third card is a Joker
					return 5;
				}
				else if(foCard == 17 && (fCard + 1 == sCard) && (sCard +1 == tCard)) { // If the fourth card is a Joker
					return 5;
				}
				break;
			case 5:
				fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
				sCard = playedCards.get(1).getValue().getEnumValue(); //Second card value
				tCard = playedCards.get(2).getValue().getEnumValue(); // Third card value
				foCard = playedCards.get(3).getValue().getEnumValue(); // Fourth card value
				fiCard = playedCards.get(4).getValue().getEnumValue(); // Fifth card value
				if(fCard + 1 == sCard && sCard + 1 == tCard && tCard + 1 == foCard && foCard +1 == fiCard) {
					return 6; // 6 => Set of 5 cards
				}
				else if(fCard == 17 && (sCard + 1 == tCard) && (tCard +1 == foCard) && (foCard + 1 == fiCard)) { // If the first card is a Joker
					return 6;
				}
				else if(sCard == 17 && (fCard + 2 == tCard) && (tCard +1 == foCard) && (foCard + 1 == fiCard)) { // If the second card is a Joker
					return 6;
				}
				else if(tCard == 17 && (fCard + 1 == sCard) && (sCard +2 == foCard) && (foCard + 1 == fiCard)) { // If the third card is a Joker
					return 6;
				}
				else if(foCard == 17 && (fCard + 1 == sCard) && (sCard +1 == tCard) && (tCard + 2 == fiCard)) { // If the fourth card is a Joker
					return 6;
				}
				else if(fiCard == 17 && (fCard + 1 == sCard) && (sCard +1 == tCard) && (tCard + 1 == foCard)) { // If the fifth card is a Joker
					return 6;
				}
				break;
			default: 
				break;
			}
		System.out.println("Try again.");
		return 666;
	}
	
	public void putCard(ArrayList<Card> playedCards, int mode){
		
	}
	
	public boolean verify(int mode, ArrayList<Card> playedCards, History history){
		int fCard, sCard, tCard, foCard, fiCard;
		int histo;
		switch(mode){
			case 0:
				fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
				histo = history.getLastCard().getValue().getEnumValue(); //Last card value of history
				if(fCard == histo + 1){
					return true;
				}
				else{
					return false;
				}
			case 1:
				fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
				sCard = playedCards.get(1).getValue().getEnumValue(); //Second card value
				histo = history.getLastCard().getValue().getEnumValue(); //Last card value of history
				
			
		}
		return true;
	}
}
