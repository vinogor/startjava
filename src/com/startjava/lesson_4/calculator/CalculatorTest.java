/**
 * доступные команды + - * / % ^ min max
 */

package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static String startAgain;
    private static Scanner inputSymbols = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            inputMathExpression(calc);
//            System.out.print("¬ведите математическое выражение: ");
//            String mathExpression = inputSymbols.nextLine();
//            String partsOfMathExpression[] = mathExpression.split(" ");
//            sendPartsOfMathExpression(partsOfMathExpression, calc);
            calc.calculate();
            checkDesireToContinue();
            inputSymbols.nextLine();
        } while (startAgain.equals("yes"));
    }

    private static void init(String[] parts, Calculator calc) {
        calc.setFirstNumber(Integer.parseInt(parts[0]));
        calc.setMathOperation(parts[1]);
        calc.setSecondNumber(Integer.parseInt(parts[2]));
    }

    private static void checkDesireToContinue() {
        do {
            System.out.print("’отите продолжить? [yes/no]: ");
            startAgain = inputSymbols.next();
        } while (!(startAgain.equals("yes") || startAgain.equals("no")));
    }

    private static void inputMathExpression(Calculator calc) {
        System.out.print("¬ведите математическое выражение: ");
        String mathExpression = inputSymbols.nextLine();
        String partsOfMathExpression[] = mathExpression.split(" ");
        init(partsOfMathExpression, calc);
    }
}