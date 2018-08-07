/**
 *
 * ������������� ��������� ������ �����, ��������� ��� ��������, ��������� �������� �����, �������:
 *
 * + ����� ������� ���� �������� ���������: � ��� 10 �������
 * + �� ��������� ���� ����������, � ��� ������ ����� ������, ��� ��������� �������� �����
 * + ���� ������ ��������� �� ��������, �.�. ������������ ������ ����� ����� ��� �� 10 �������, �� �������� ���� ������ �� �����
 * + � ����� ���� �������� ��������� "����� " + ��� + " ������ ����� " + ����� + " � " + ����� + " �������"
 * + ���� ������ �� ������� ����� �� 10 �������, �� ���������� ���������: "� " + ��� + " ����������� �������
 *
 * + �������� �������������� ���� � ������ Player, ������� ����� ������� ��������� ������������� �����
 * + ��� ���������� ����� ������� ����������� ����� ������ Arrays.copyOf
 *
 */

package com.startjava.lesson_4.game;
import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner inputSymbols = new Scanner(System.in);
	private static String startAgain;

    public static void main(String[] args) {

		System.out.print("������� ��� 1�� ������ (eng): ");
		Player player1 = new Player(inputSymbols.next());
		System.out.print("������� ��� 2�� ������ (eng): ");
		Player player2 = new Player(inputSymbols.next());
    	GuessNumber game = new GuessNumber(player1, player2);

		do {
			game.startGame();
			wantToContinue();
		} while (startAgain.equals("yes"));
    }

	private static void wantToContinue() {
		do {
			System.out.print("������ ����������? [yes/no]: ");
			startAgain = inputSymbols.next();
		} while (!(startAgain.equals("yes") || startAgain.equals("no")));
	}
}

		