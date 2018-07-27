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
		System.out.println("компьютер загадал число: " + randomNumber);

		boolean player1win = false;
		boolean player2win = false;

		while (!(player1win || player2win)) {		
			System.out.print("игрок по имени " + player1.getName() + ", введите число от 0 до 100: ");
		    player1.setNumber(inputSymbols.nextInt());

			System.out.print("игрок по имени " + player2.getName() + ", введите число от 0 до 100: ");
		    player2.setNumber(inputSymbols.nextInt());

		    player1win = player1.whoWin(randomNumber);
			player2win = player2.whoWin(randomNumber);
		}
	}
} 