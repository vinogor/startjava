package com.startjava.lesson_4.game;
import java.util.Scanner;

public class GuessNumber {
	private Player player1;
	private Player player2;
	Scanner inputSymbols = new Scanner(System.in);
	int randomNumber;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		System.out.println("����� ����!");
		randomNumber = (int) (Math.random() * 101);
		System.out.print("��������� ������� �����: " + randomNumber);
		System.out.println();

		player1.setIsWin(false);
		player2.setIsWin(false);

		while (!(player1.getIsWin() || player2.getIsWin())) {		
		    inputNumber(player1);
		    inputNumber(player2);
		    whoWin(player1, randomNumber);
		    whoWin(player2, randomNumber);
		}
	}

	private void inputNumber(Player player) {
			System.out.print("����� �� ����� " + player.getName() + ", ������� ����� �� 0 �� 100: ");
		    player.setNumber(inputSymbols.nextInt());
	}

	private void whoWin(Player player, int randomNumber) {
		if (player.getNumber() == randomNumber) {
			System.out.println("���� ��������. ����������: " + player.getName());
			player.setIsWin(true);
		} else if (player.getNumber() < randomNumber) {
			System.out.println(player.getName() + ", �������� ���� ����� ������ ����, ��� ������� ���������");
		} else if (player.getNumber() > randomNumber) {
			System.out.println(player.getName() + ", �������� ���� ����� ������ ����, ��� ������� ���������");
		} 	
	}
}

