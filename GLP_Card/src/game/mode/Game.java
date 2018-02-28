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
		switch(playedCards.size()) {
			case 1:
				if(playedCards.get(0).getValue() != EnumValue.JOKER) {
					return 0; // 0 => Simple
				}
				break;
			
			case 2:
				if(playedCards.get(0)==playedCards.get(1)) {
					return 1; // 1 => Double
				}
				break;	
			
			case 3:
				if(playedCards.get(0)==playedCards.get(1) && playedCards.get(0)==playedCards.get(2)) {
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
					int fCard = playedCards.get(0).getValue().getEnumValue(); //First card value
					int sCard = playedCards.get(1).getValue().getEnumValue(); //Second card value
					int tCard = playedCards.get(2).getValue().getEnumValue(); // Third card value
					if(fCard + 1 == sCard && sCard + 1 == tCard) {
						return 4; // 4 => Set of 3 cards
					}
					else if(fCard == 17 && (sCard + 1 == tCard)) { // If first card is a Joker
						return 4;
					}
					else if(sCard == 17 && (fCard + 2 == tCard)) { // If second card is a Joker
						return 4;
					}
					else if(tCard == 17 && (fCard + 1 == sCard)) { // If third card is a Joker
						return 4;
					}
				}
				break;
			default: 
				System.out.println("Try again.");
				break;
			}
		return 666;
	}
}