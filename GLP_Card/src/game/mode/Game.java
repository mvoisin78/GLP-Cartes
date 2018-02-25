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
}
