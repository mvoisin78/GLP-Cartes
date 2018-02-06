package player;

public abstract class Player {
	private Score score;
	private String name;
	private Hand hand;
	
	public Player(String name) {
		hand = new Hand();
		score = new Score();
		this.name = name;
	}
}