public class Player {
	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public boolean whoWin (int randomNumber) {
		if (number == randomNumber) {
			System.out.println("игра окончена. Победитель: " + name);
			return true;
		} else if (number < randomNumber) {
			System.out.println(name + ", введённое вами число меньше того, что загадал компьютер");
			return false;
		} else if (number > randomNumber) {
			System.out.println(name + ", введённое вами число больше того, что загадал компьютер");
			return false;
		} else {
			return false;
		}		
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}	 


} 