package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
		int firstNumber = 4;
		int secondNumber = 10;
		String mathOperation = "*";
		if (mathOperation.equals("+")) {
			System.out.println(firstNumber + secondNumber);
		} else if (mathOperation.equals("-")) {
			System.out.println(firstNumber - secondNumber);
		} else if (mathOperation.equals("*")) {
			System.out.println(firstNumber * secondNumber);
		} else if (mathOperation.equals("/")) {
			System.out.println(firstNumber / secondNumber);
		} else if (mathOperation.equals("%")) {
			System.out.println(firstNumber % secondNumber);
		} else if (mathOperation.equals("^")) {
			int resultOfСalculation = 1; // = 1 - чтобы работало возведение в степень 
			for (int i = 0; i < secondNumber; i++) {
				resultOfСalculation *= firstNumber;
			}
			System.out.println(firstNumber + " " + mathOperation + " " + secondNumber + " = " + resultOfСalculation);
		}
 	}
}

