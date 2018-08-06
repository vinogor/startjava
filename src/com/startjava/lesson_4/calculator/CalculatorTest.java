/**
 * доступные команды + - * / % ^ min max
 */

package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner inputSymbols = new Scanner(System.in);
        Calculator calc = new Calculator();
        String startAgain;

        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = inputSymbols.nextLine();
            String partsOfMathExpression[] = mathExpression.split(" ");
            sendPartsOfMathExpression(partsOfMathExpression, calc);
            calc.calculate();

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                startAgain = inputSymbols.next();
            } while (!(startAgain.equals("yes") || startAgain.equals("no")));
            inputSymbols.nextLine();
        } while (startAgain.equals("yes"));
    }

    private static void sendPartsOfMathExpression(String[] parts, Calculator calc) {
        calc.setFirstNumber(Integer.parseInt(parts[0]));
        calc.setMathOperation(parts[1]);
        calc.setSecondNumber(Integer.parseInt(parts[2]));
    }
}