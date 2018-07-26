import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
    	Scanner inputSymbols = new Scanner(System.in);
    	GuessNumber game = new GuessNumber();
    	String startAgain = "yes";
		while (startAgain.equals("yes")) {
			game.startGame();
			System.out.print("Хотите продолжить? [yes/no]: ");
	    	startAgain = inputSymbols.next();

	    	while (!(startAgain.equals("yes") || startAgain.equals("no"))) {
	    		System.out.print("Хотите продолжить? [yes/no]: ");
	  		    startAgain = inputSymbols.next();	    		 
	    	} 
		}
    } 
}

		