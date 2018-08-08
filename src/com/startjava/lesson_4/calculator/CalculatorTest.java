package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static String startAgain;
    private static Scanner inputSymbols = new Scanner(System.in);


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String mathExpression;

        do {
            mathExpression = inputMathExpression();
            init(calc,  mathExpression);
            calc.calculate();
            checkDesireToContinue();
        } while (startAgain.equals("yes"));
    }

    private static String inputMathExpression() {
        System.out.print("Введите математическое выражение: ");
        return inputSymbols.nextLine();
    }

    private static void init(Calculator calc, String mathExpression) {
        String partsOfMathExpression[] = mathExpression.split(" ");
        calc.setFirstNumber(Integer.parseInt(partsOfMathExpression[0]));
        calc.setMathOperation(partsOfMathExpression[1]);
        calc.setSecondNumber(Integer.parseInt(partsOfMathExpression[2]));
    }

    private static void checkDesireToContinue() {
        do {
            System.out.print("Хотите продолжить? [yes/no]: ");
            startAgain = inputSymbols.next();
            inputSymbols.nextLine();
        } while (!(startAgain.equals("yes") || startAgain.equals("no")));
    }
}