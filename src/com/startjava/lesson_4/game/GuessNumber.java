package com.startjava.lesson_4.game;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player player1;
	private Player player2;
	Scanner inputSymbols = new Scanner(System.in);
	int randomNumber;
	int numberOfAttempt;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		System.out.println("����� ����! � ������� ������ ���� 10 �������.");
		randomNumber = (int) (Math.random() * 101);
		System.out.print("��������� ������� �����: " + randomNumber);
		System.out.println();

		player1.setIsWin(false);
		player2.setIsWin(false);

		while (!(player1.getIsWin() || player2.getIsWin())) {
			numberOfAttempt++;
			if (numberOfAttempt > 10){
				System.out.println("������� �����������! ����������� ���.");
				break;
			}
			System.out.println("������� �" + numberOfAttempt);
		    inputNumber(player1, numberOfAttempt);
		    inputNumber(player2, numberOfAttempt);
		    whoWin(player1, randomNumber, numberOfAttempt);
		    whoWin(player2, randomNumber, numberOfAttempt);
		}
	}

	private void inputNumber(Player player, int numberOfAttempt) {
			System.out.print("����� �� ����� " + player.getName() + ", ������� ����� �� 0 �� 100: ");
			player.setNumberOfAttempt(numberOfAttempt);
		    player.setNumber(inputSymbols.nextInt());

	}

	private void whoWin(Player player, int randomNumber, int numberOfAttempt) {
		if (player.getNumber() == randomNumber) {
			System.out.println("���� ��������. ����������: " + player.getName());
			System.out.println("����� " + player.getName() + " ������ ����� " + randomNumber + " � " + numberOfAttempt + " �������");
			System.out.print("�������� ������� " + player.getName() + " �����: ");

			int[] realInputNumbers = Arrays.copyOf(player.getInputNumbers(), numberOfAttempt);
			for (int i = 0; i < numberOfAttempt; i++) {
				System.out.print(realInputNumbers[i] + " ");
			}
			System.out.println();
			player.setIsWin(true);
		} else if (player.getNumber() < randomNumber) {
			System.out.println(player.getName() + ", �������� ���� ����� ������ ����, ��� ������� ���������");
		} else if (player.getNumber() > randomNumber) {
			System.out.println(player.getName() + ", �������� ���� ����� ������ ����, ��� ������� ���������");
		} 	
	}
}

