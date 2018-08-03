package com.startjava.lesson_4.calculator;

public class Calculator {

    private int firstNumber;
    private String mathOperation;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void runCalculator() {
        System.out.print("Результат вычислений: ");
        switch (mathOperation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "%":
                System.out.println(firstNumber % secondNumber);
                break;
            case "^":
                System.out.println((int) Math.pow(firstNumber, secondNumber));
                break;
            case "max":
                System.out.println(Math.max(firstNumber, secondNumber));
                break;
            case "min":
                System.out.println(Math.min(firstNumber, secondNumber));
                break;
        }
    }
}


