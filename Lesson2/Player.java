public class Player {
	private String name;
	private int number;
	private boolean isPlayerWin;
	private int randomNumber;

	public Player(String name) {
		this.name = name;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public void setIsPlayerWin (boolean isPlayerWin) {
		this.isPlayerWin = isPlayerWin;
	}

	public void setRandomNumber (int randomNumber) {
		this.randomNumber = randomNumber;
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

	public int getRandomNumber() {
		return randomNumber;
	}
} 