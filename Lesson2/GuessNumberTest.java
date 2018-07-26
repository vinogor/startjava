import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
    	Scanner inputSymbols = new Scanner(System.in);
    	String startAgain = "yes";
		while (startAgain.equals("yes")) {
			GuessNumber.startGame(); 
			System.out.print("Хотите продолжить? [yes/no]: ");
	    	startAgain = inputSymbols.next();

	    	while (!(startAgain.equals("yes") || startAgain.equals("no"))) {
	    		System.out.print("Хотите продолжить? [yes/no]: ");
	  		    startAgain = inputSymbols.next();	    		 
	    	} 
		}
    } 
}

	//	GuessNumber game = new GuessNumber();