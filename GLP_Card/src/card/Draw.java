package card;

import java.util.ArrayList;
import java.util.Collections;

public class Draw {
	
	private ArrayList<Card> draw;
	private CardDeck deck;
	
	public Draw () {
		draw = new ArrayList<Card>();
		deck.InitPackage();
	}
	
	public boolean videPioche () {
		return draw.isEmpty();
	}
	
	public void init () {
		int i;

		for (i=0 ; i<54 ; i++){		 
			draw.add(deck.getCard(i));
		}
		
		Collections.shuffle(draw);
	}

}
