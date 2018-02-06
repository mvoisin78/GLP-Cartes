package card;

import java.util.ArrayList;
public class History {
	private ArrayList<Card> discardPile;
	
	public History(){
		discardPile = new ArrayList<Card>();
	}
	
	public void addCard(Card card){
		discardPile.add(card);
	}
	
	public ArrayList<Card> getHistory(){
		return discardPile;
	}
	
	public Card getLastCard(){
		return discardPile.get(discardPile.size());
	}
}
