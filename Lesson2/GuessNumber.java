import java.util.Scanner;

public class GuessNumber {

	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {

		System.out.println("Старт игры!");

		int guessThisNumber = (int) (Math.random() * 101);
		System.out.println("компьютер загадал число: " + guessThisNumber);

		boolean player1win = false;
		boolean player2win = false;

		Scanner inputSymbols = new Scanner(System.in);

		while (!(player1win || player2win)) {		

			System.out.print("игрок по имени " + player1.getName() + ", введите число от 0 до 100: ");
		    player1.setNumber(inputSymbols.nextInt());

			System.out.print("игрок по имени " + player2.getName() + ", введите число от 0 до 100: ");
		    player2.setNumber(inputSymbols.nextInt());

		    player1win = whoWin (player1.getNumber(), player1.getName(), guessThisNumber);
			player2win = whoWin (player2.getNumber(), player2.getName(), guessThisNumber);
		}
	}

	private boolean whoWin (int a, String n, int b) {
		if (a == b) {
			System.out.println("игра окончена. Победитель: " + n);
			return true;
		} else if (a < b) {
			System.out.println(n + ", введённое вами число меньше того, что загадал компьютер");
			return false;
		} else if (a > b) {
			System.out.println(n + ", введённое вами число больше того, что загадал компьютер");
			return false;
		} else {
			return false;
		}		
	}
} 