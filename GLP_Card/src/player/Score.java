package player;

public class Score {
	private final static int BASELINE_SCORE = 100;
	private final static int MIN_SCORE = 0;
	private int score;
	
	public Score () {
		score = BASELINE_SCORE;
	}
	
	public void IncrementerScore (int x) {
		score += x;
	}
	
	public void DecrementerScore (int x) {
		if(score - x > MIN_SCORE) {
			score -= x;
		}
		else {
			score = 0;
			System.out.println("Le joueur n'a plus de points.");
		}
	}
	
	public int getScore() {
		return score;
	}

}
