package game.mode;
import java.util.ArrayList;
import java.util.Iterator;

import game.card.*;
import game.player.*;


public class Testround {
	
	ArrayList<Player> players = new ArrayList<>();
	Player p1 = new HumanPlayer("J1");
	Player p2 = new HumanPlayer("J2");
	Player p3 = new HumanPlayer("J3");
	Player p4 = new HumanPlayer("J4");
	Player p5 = new HumanPlayer("J5");
	
	public Testround(int nbPlayers) {
		
		Draw draw = new Draw();
		draw.init();
		Game game = new Game(draw);
		
		switch (nbPlayers) {
			case 1: 
				players.add(p1);
				break;
			case 2: 
				players.add(p1);
				players.add(p2);
				break;
			case 3:
				players.add(p1);
				players.add(p2);
				players.add(p3);
				break;
			case 4: 
				players.add(p1);
				players.add(p2);
				players.add(p3);
				players.add(p4);
				break;
			case 5:
				players.add(p1);
				players.add(p2);
				players.add(p3);
				players.add(p4);
				players.add(p5);
				break;
			default:
				break;
		}
		
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
