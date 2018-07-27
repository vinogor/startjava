import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

    	Scanner inputSymbols = new Scanner(System.in);
    	
		System.out.print("Введите имя 1го игрока (eng): ");
		String namePlayer1 = inputSymbols.next();
		Player player1 = new Player(namePlayer1);

		System.out.print("Введите имя 2го игрока (eng): ");
		String namePlayer2 = inputSymbols.next();
		Player player2 = new Player(namePlayer2);

    	GuessNumber game = new GuessNumber(player1, player2);

    	String startAgain = "yes";
		while (startAgain.equals("yes")) {
			game.startGame();
			startAgain = "qqq";
	    	while (!(startAgain.equals("yes") || startAgain.equals("no"))) {
	    		System.out.print("Хотите продолжить? [yes/no]: ");
	  		    startAgain = inputSymbols.next();	    		 
	    	} 
		}
    } 
}

		