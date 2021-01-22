package snake;
public enum Snakedir {
	P1_UP('W'),P1_DOWN('S'),P1_LEFT('A'),P1_RIGHT('D')
   ,P2_UP,P2_DOWN,P2_LEFT,P2_RIGHT;
	private int integerValue; //int equivalent
	private char charValue; //char equivalent in input
	private int settedValue; // user defines own controls
	// notice that integerValue matches that of ordinal() defined by Enum
	Snakedir(char charValue){
		this.charValue=charValue;
	}
	Snakedir(){
	}

	public char getChar() {
		return charValue;
	}
	public int getCustom() {
		return settedValue;
	}
	public void setValue(char customValue) {
		charValue = customValue;
	}
}
