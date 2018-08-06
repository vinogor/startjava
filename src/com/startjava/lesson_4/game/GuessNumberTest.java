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
	static Scanner inputSymbols = new Scanner(System.in);
    public static void main(String[] args) {

		System.out.print("������� ��� 1�� ������ (eng): ");
		Player player1 = new Player(inputSymbols.next());
		System.out.print("������� ��� 2�� ������ (eng): ");
		Player player2 = new Player(inputSymbols.next());
    	GuessNumber game = new GuessNumber(player1, player2);
    	String startAgain;

		do {
			game.startGame();
			do {
	    		System.out.print("������ ����������? [yes/no]: ");
	  		    startAgain = inputSymbols.next();	    		 
	  		} while (!(startAgain.equals("yes") || startAgain.equals("no")));
		} while (startAgain.equals("yes"));
    }
}

		