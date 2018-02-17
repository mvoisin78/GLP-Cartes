package game.card;

public class TestMainCardDeck {

	public static void main(String[] args) {
		
		Draw draw = new Draw();
		draw.init();
		draw.shuffle();
		for(int i=0; i<54;i++) {
			System.out.println(draw.getCard(i).getValue() +"    " + draw.getCard(i).getColor());
		}		
	}
}
