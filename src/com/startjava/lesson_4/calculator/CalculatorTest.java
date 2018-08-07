package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static String startAgain;
    private static Scanner inputSymbols = new Scanner(System.in);
    private static String mathExpression;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            inputMathExpression(calc);
            init(calc);
            calc.calculate();
            checkDesireToContinue();
            inputSymbols.nextLine();
        } while (startAgain.equals("yes"));
    }

    private static void inputMathExpression(Calculator calc) {
        System.out.print("Введите математическое выражение: ");
        mathExpression = inputSymbols.nextLine();
    }

    private static void init(Calculator calc) {
        String partsOfMathExpression[] = mathExpression.split(" ");
        calc.setFirstNumber(Integer.parseInt(partsOfMathExpression[0]));
        calc.setMathOperation(partsOfMathExpression[1]);
        calc.setSecondNumber(Integer.parseInt(partsOfMathExpression[2]));
    }

    private static void checkDesireToContinue() {
        do {
            System.out.print("Хотите продолжить? [yes/no]: ");
            startAgain = inputSymbols.next();
        } while (!(startAgain.equals("yes") || startAgain.equals("no")));
    }
}