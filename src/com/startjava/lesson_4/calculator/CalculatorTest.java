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

            calc.setFirstNumber(Integer.parseInt(partsOfMathExpression[0]));
            calc.setMathOperation(partsOfMathExpression[1]);
            calc.setSecondNumber(Integer.parseInt(partsOfMathExpression[2]));
            calc.runCalculator();

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                startAgain = inputSymbols.next();
            } while (!(startAgain.equals("yes") || startAgain.equals("no")));
            inputSymbols.nextLine();
        } while (startAgain.equals("yes"));
    }
}