package card;
	
	public enum EnumColor {
		
	Heart(0), Spade(1), Diamond(2), Club(3), Joker(4);
	private int color;
	
	EnumColor (int color) { 
		this.color = color;
	}
	
	public int getValue() {
		return color;
	}
}
