/**
 * ��������� ������� + - * / % ^ min max
 */

package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static String startAgain;
    private static Scanner inputSymbols = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            System.out.print("������� �������������� ���������: ");
            String mathExpression = inputSymbols.nextLine();
            String partsOfMathExpression[] = mathExpression.split(" ");
            sendPartsOfMathExpression(partsOfMathExpression, calc);
            calc.calculate();
            wantToContinue();
            inputSymbols.nextLine();
        } while (startAgain.equals("yes"));
    }

    private static void sendPartsOfMathExpression(String[] parts, Calculator calc) {
        calc.setFirstNumber(Integer.parseInt(parts[0]));
        calc.setMathOperation(parts[1]);
        calc.setSecondNumber(Integer.parseInt(parts[2]));
    }

    private static void wantToContinue() {
        do {
            System.out.print("������ ����������? [yes/no]: ");
            startAgain = inputSymbols.next();
        } while (!(startAgain.equals("yes") || startAgain.equals("no")));
    }
}