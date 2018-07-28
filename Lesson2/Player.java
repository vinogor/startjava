public class Player {
	private String name;
	private int number;
	private boolean isWin;

	public Player(String name) {
		this.name = name;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public void setIsWin (boolean isWin) {
		this.isWin = isWin;
	}

	public String getName() {
		return name;
	}	 

	public int getNumber() {
		return number;
	}

	public boolean getIsWin() {
		return isWin;
	}
} 