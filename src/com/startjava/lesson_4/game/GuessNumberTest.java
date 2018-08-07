/**
 * ������������� ��������� ������ �����, ��������� ��� ��������, ��������� �������� �����, �������:
 * <p>
 * + ����� ������� ���� �������� ���������: � ��� 10 �������
 * + �� ��������� ���� ����������, � ��� ������ ����� ������, ��� ��������� �������� �����
 * + ���� ������ ��������� �� ��������, �.�. ������������ ������ ����� ����� ��� �� 10 �������, �� �������� ���� ������ �� �����
 * + � ����� ���� �������� ��������� "����� " + ��� + " ������ ����� " + ����� + " � " + ����� + " �������"
 * + ���� ������ �� ������� ����� �� 10 �������, �� ���������� ���������: "� " + ��� + " ����������� �������
 * <p>
 * + �������� �������������� ���� � ������ Player, ������� ����� ������� ��������� ������������� �����
 * + ��� ���������� ����� ������� ����������� ����� ������ Arrays.copyOf
 */

package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner inputSymbols = new Scanner(System.in);
    private static String startAgain;

    public static void main(String[] args) {

        GuessNumber game = enterNames();
//		System.out.print("������� ��� 1�� ������ (eng): ");
//		Player player1 = new Player(inputSymbols.next());
//		System.out.print("������� ��� 2�� ������ (eng): ");
//		Player player2 = new Player(inputSymbols.next());
//    	GuessNumber game = new GuessNumber(player1, player2);

        initGame(game);
//		do {
//			game.startGame();
//			checkDesireToContinue();
//		} while (startAgain.equals("yes"));
    }

    private static void checkDesireToContinue() {
        do {
            System.out.print("������ ����������? [yes/no]: ");
            startAgain = inputSymbols.next();
        } while (!(startAgain.equals("yes") || startAgain.equals("no")));
    }

    private static GuessNumber enterNames() {
        System.out.print("������� ��� 1�� ������ (eng): ");
        Player player1 = new Player(inputSymbols.next());
        System.out.print("������� ��� 2�� ������ (eng): ");
        Player player2 = new Player(inputSymbols.next());
        return new GuessNumber(player1, player2);
    }

    private static void initGame(GuessNumber game) {
        do {
            game.startGame();
            checkDesireToContinue();
        } while (startAgain.equals("yes"));
    }
}

		