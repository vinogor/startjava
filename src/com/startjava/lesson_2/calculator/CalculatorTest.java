package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
		
		Scanner inputSymbols = new Scanner(System.in);
		Calculator calc = new Calculator();
    	String startAgain = "yes";

    	while (startAgain.equals("yes")) {
	    	System.out.print("������� ������ �����: ");
	    	int firstNumber = inputSymbols.nextInt();
	    	System.out.print("������� ���� �������������� ��������: ");
	    	inputSymbols.nextLine();
	    	String mathOperation = inputSymbols.nextLine();
	   // 	����� ����� [nextLine()] - �� ������� �� ���������� ������ ������. ������?!
	   //   - ������ ��� � ������ ������� ������ �������� ������ �� ���������� �������, ������� ������� ���� ������ �����
	   //   �������: ????

	    	System.out.print("������� ������ �����: ");
	    	int secondNumber = inputSymbols.nextInt();

	    	calc.setFirstNumber(firstNumber);
	    	calc.setMathOperation(mathOperation);
	    	calc.setSecondNumber(secondNumber);
	    	calc.runCalculator();

	    	System.out.print("������ ����������? [yes/no]: ");
	    	startAgain = inputSymbols.next();

	    	while (!(startAgain.equals("yes") || startAgain.equals("no"))) {
	    		System.out.print("������ ����������? [yes/no]: ");
	  		    startAgain = inputSymbols.next();	    		 
	    	}

		}	
	}
}