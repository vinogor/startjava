import java.util.Scanner;

public class GuessNumber {

	private Player player1;
	private Player player2;
	Scanner inputSymbols = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		System.out.println("Старт игры!");

		int randomNumber = (int) (Math.random() * 101);
		System.out.print("компьютер загадал число: " + randomNumber);
		System.out.println();

		while (!(player1.getIsPlayerWin() || player2.getIsPlayerWin())) {		
			System.out.print("игрок по имени " + player1.getName() + ", введите число от 0 до 100: ");
		    player1.setNumber(inputSymbols.nextInt());

			System.out.print("игрок по имени " + player2.getName() + ", введите число от 0 до 100: ");
		    player2.setNumber(inputSymbols.nextInt());

		    player1.setIsPlayerWin(whoWin(player1.getName(), player1.getNumber(), randomNumber));
		    player2.setIsPlayerWin(whoWin(player2.getName(), player2.getNumber(), randomNumber));
		}
	}

	private boolean whoWin(String playerName, int playerNumber, int randomNumber) {
		if (playerNumber == randomNumber) {
			System.out.println("игра окончена. Победитель: " + playerName);
			return true;
		} else if (playerNumber < randomNumber) {
			System.out.println(playerName + ", введённое вами число меньше того, что загадал компьютер");
			return false;
		} else if (playerNumber > randomNumber) {
			System.out.println(playerName + ", введённое вами число больше того, что загадал компьютер");
			return false;
		} else {
			return false;
		}	
	}
} 