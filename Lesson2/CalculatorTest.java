import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

    	String startAgain = "да";
    	while (startAgain.equals("да")) {
	    	Scanner inputSymbols = new Scanner(System.in);
			System.out.print("Введите первое число: ");
	    	int firstNumber = inputSymbols.nextInt();
	    	System.out.print("Введите знак математической операции: ");
	    	String mathOperation = inputSymbols.next();  // когда писал [nextLine()] - то консоль не предлагала ничего ввести. Почему?!
	    	System.out.print("Введите второе число: ");
	    	int secondNumber = inputSymbols.nextInt();

	    	Calculator calc = new Calculator(firstNumber, mathOperation, secondNumber);
	    	calc.runCalculator();

	    	System.out.print("Хотите продолжить? [да/нет]: ");
	    	startAgain = inputSymbols.next(); // почему-то завершает программу при любом ответе. Почему и как исправить? 

	  //  	while (startAgain.equals("нет")) {
	  //  		System.out.print("Хотите продолжить? [да/нет]: ");
	  //	    startAgain = inputSymbols.next();	    		 
	  //  	}

		}	
	}
}