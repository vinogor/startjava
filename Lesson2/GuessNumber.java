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
		player1.setRandomNumber(randomNumber);
		player2.setRandomNumber(randomNumber);

		System.out.print("компьютер загадал число: " + randomNumber);
		System.out.println();

		player1.setIsPlayerWin(false);
		player2.setIsPlayerWin(false);

		while (!(player1.getIsPlayerWin() || player2.getIsPlayerWin())) {		
		//	System.out.print("игрок по имени " + player1.getName() + ", введите число от 0 до 100: ");
		//   player1.setNumber(inputSymbols.nextInt());

		//	System.out.print("игрок по имени " + player2.getName() + ", введите число от 0 до 100: ");
		//    player2.setNumber(inputSymbols.nextInt());

		//    player1.setIsPlayerWin(whoWin(player1.getName(), player1.getNumber(), randomNumber));
		//    player2.setIsPlayerWin(whoWin(player2.getName(), player2.getNumber(), randomNumber));

		//    player1.setIsPlayerWin(whoWin(player1));
		//    player2.setIsPlayerWin(whoWin(player2));
		    inputNumber(player1);
		    inputNumber(player2);

		    whoWin(player1);
		    whoWin(player2);
		}
	}

	private void inputNumber(Player player) {
			System.out.print("игрок по имени " + player.getName() + ", введите число от 0 до 100: ");
		    player.setNumber(inputSymbols.nextInt());
	}

	private void whoWin(Player player) {
		if (player.getNumber() == player.getRandomNumber()) {
			System.out.println("игра окончена. Победитель: " + player.getName());
			player.setIsPlayerWin(true);
		} else if (player.getNumber() < player.getRandomNumber()) {
			System.out.println(player.getName() + ", введённое вами число меньше того, что загадал компьютер");
			player.setIsPlayerWin(false);
		} else if (player.getNumber() > player.getRandomNumber()) {
			System.out.println(player.getName() + ", введённое вами число больше того, что загадал компьютер");
			player.setIsPlayerWin(false);
		} 	
	}


/*
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

*/

} 