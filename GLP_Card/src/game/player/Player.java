package game.player;

import java.util.ArrayList;

import game.card.*;

public abstract class Player {
    private Score score;
    private String name;
    private Hand hand;
    private ArrayList<Card> selectedCards; //Cards selected by the player to compar with the history to verify if he can play this card
    
    public Player(String name) {
        hand = new Hand();
        score = new Score();
        this.name = name;
    }
    
    public Hand getHand() {
        return hand;
    }
    
    public String getName() {
        return name;
    }
    
    public Score getScore() {
        return score;
    }
    
    public void addSelectedCard(Card card) {
        selectedCards.add(card);
    }
    
    public void supSelectedCard(Card card) {
    	selectedCards.remove(card);
    }
    
    public void resetSelectedCard() {
        selectedCards.clear();
    }
}
