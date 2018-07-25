import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
		
		Scanner inputSymbols = new Scanner(System.in);
		Calculator calc = new Calculator();
    	String startAgain = "да";

    	while (startAgain.equals("да")) {
	    	System.out.print("Введите первое число: ");
	    	int firstNumber = inputSymbols.nextInt();
	    	System.out.print("Введите знак математической операции: ");
	    	String mathOperation = inputSymbols.next();  // когда писал [nextLine()] - то консоль не предлагала ничего ввести. Почему?!
	    	System.out.print("Введите второе число: ");
	    	int secondNumber = inputSymbols.nextInt();

	    	calc.setFirstNumber(firstNumber);
	    	calc.setMathOperation(mathOperation);
	    	calc.setSecondNumber(secondNumber);
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