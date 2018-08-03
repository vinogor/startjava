package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
		
		Scanner inputSymbols = new Scanner(System.in);
		Calculator calc = new Calculator();
    	String startAgain = "yes";

    	while (startAgain.equals("yes")) {
	    	System.out.print("Введите первое число: ");
	    	int firstNumber = inputSymbols.nextInt();
	    	System.out.print("Введите знак математической операции: ");
	    	inputSymbols.nextLine();
	    	String mathOperation = inputSymbols.nextLine();
	   // 	когда писал [nextLine()] - то консоль не предлагала ничего ввести. Почему?!
	   //   - потому что в буфере остаётся символ переноса строки от предыдущей команды, которая забрала себе только цифры
	    	System.out.print("Введите второе число: ");
	    	int secondNumber = inputSymbols.nextInt();

	    	calc.setFirstNumber(firstNumber);
	    	calc.setMathOperation(mathOperation);
	    	calc.setSecondNumber(secondNumber);
	    	calc.runCalculator();

	    	System.out.print("Хотите продолжить? [yes/no]: ");
	    	startAgain = inputSymbols.next();

	    	while (!(startAgain.equals("yes") || startAgain.equals("no"))) {
	    		System.out.print("Хотите продолжить? [yes/no]: ");
	  		    startAgain = inputSymbols.next();	    		 
	    	}

		}	
	}
}