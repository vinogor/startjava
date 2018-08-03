package com.startjava.lesson_2.calculator;

public class Calculator {

	private int firstNumber;
	private String mathOperation;
	private int secondNumber;

//	public Calculator(int firstNumber, String mathOperation, int secondNumber) {
//		this.firstNumber = firstNumber;
//		this.mathOperation = mathOperation;
//		this.secondNumber = secondNumber;
//	}

	public void setFirstNumber (int firstNumber) {
	this.firstNumber = firstNumber;
	}

	public void setMathOperation (String mathOperation) {
	this.mathOperation = mathOperation;
	}

	public void setSecondNumber (int secondNumber) {
	this.secondNumber = secondNumber;
	}

    public void runCalculator() {
    	System.out.print("Результат вычислений: ");
		switch (mathOperation) {
			case "+": System.out.println(firstNumber + secondNumber); break;
			case "-": System.out.println(firstNumber - secondNumber); break;
			case "*": System.out.println(firstNumber * secondNumber); break;
			case "/": System.out.println(firstNumber / secondNumber); break;
			case "%": System.out.println(firstNumber % secondNumber); break;
			case "^": {
				int resultOfСalculation = 1; // = 1 - чтобы работало возведение в степень 
				for (int i = 0; i < secondNumber; i++) {
					resultOfСalculation *= firstNumber;
				}
				System.out.println(resultOfСalculation); break;
			}
		}
 	}
}

