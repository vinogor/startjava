public class Player {
	private String name;
	private int number;
	private boolean isPlayerWin;

	public Player(String name) {
		this.name = name;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public void setIsPlayerWin (boolean isPlayerWin) {
		this.isPlayerWin = isPlayerWin;
	}

	public String getName() {
		return name;
	}	 

	public int getNumber() {
		return number;
	}

	public boolean getIsPlayerWin() {
		return isPlayerWin;
	}
} 