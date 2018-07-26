public class GuessNumber {
	public void startGame() {
		System.out.println("Старт игры!");
		
		Player player1 = new Player("Коля");
		Player player2 = new Player("Петя");

		int numberX = (int) (Math.random() * 101);
		System.out.println("компьютер загадал число: " + numberX);

		boolean player1win = false;
		boolean player2win = false;

		while (!player1win || !player2win) {
	
			player1.guess();
			player2.guess();

			if (player1.getNumber() == numberX) {
				System.out.println("игра окончена. Победитель: " + player1.getName());
				player1win = true;
			} else if (player1.getNumber() < numberX) {
				System.out.println(player1.getName() + ", введённое вами число меньше того, что загадал компьютер");
			} else if (player1.getNumber() > numberX) {
				System.out.println(player1.getName() + ", введённое вами число больше того, что загадал компьютер");
			}

			if (player2.getNumber() == numberX) {
				System.out.println("игра окончена. Победитель: " + player2.getName());
				player2win = true;
			} else if (player2.getNumber() < numberX) {
				System.out.println(player2.getName() + ", введённое вами число меньше того, что загадал компьютер");
			} else if (player2.getNumber() > numberX) {
				System.out.println(player2.getName() + ", введённое вами число больше того, что загадал компьютер");
			}
		}
	}
}