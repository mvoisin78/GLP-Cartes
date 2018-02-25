package game.mode;
import java.util.ArrayList;
import java.util.Iterator;

import game.card.*;
import game.player.*;


public class Testround {


	public static void main(String[] args) {
		Draw draw = new Draw();
		draw.init();
		Game game = new Game(draw);
		
		Player p1 = new HumanPlayer("J1");
		Player p2 = new HumanPlayer("J2");
		
		ArrayList<Player> players = new ArrayList<>();
		players.add(p1);
		players.add(p2);
		
		game.start(players);
		
		Iterator<Player> pIterator = players.iterator();
		while(pIterator.hasNext()) {
			Player currentPlayer = pIterator.next();
			Hand currentPlayerHand = currentPlayer.getHand();
			System.out.println("--------------------------------------");
			for(int index=0; index< currentPlayerHand.getSizeHand();index++) {
				System.out.println(currentPlayerHand.getCardHand(index).getValue());
			}
		}
		
	}

}
