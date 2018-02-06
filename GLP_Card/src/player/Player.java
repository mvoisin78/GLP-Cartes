package player;

public abstract class Player {
	private Score score;
	private String name;
	private Hand hand;
	
	public Player() {
		hand = new Hand();
	}
}