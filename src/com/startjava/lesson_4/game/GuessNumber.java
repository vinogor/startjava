package com.startjava.lesson_4.game;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player player1;
	private Player player2;
	private Scanner inputSymbols = new Scanner(System.in);
	private int randomNumber;
	private int numberOfAttempt;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		System.out.println("����� ����! � ������� ������ ���� 10 �������.");
		randomNumber = (int) (Math.random() * 101);
		System.out.println("��������� ������� �����: " + randomNumber);

		player1.setIsWin(false);
		player2.setIsWin(false);
		numberOfAttempt = 0;

		while (!(player1.getIsWin() || player2.getIsWin())) {
			numberOfAttempt++;
			if (numberOfAttempt > 10){
				System.out.println("������� �����������! ����������� ���.");
				break;
			}
			System.out.println("������� �" + numberOfAttempt);
		    inputNumber(player1);
		    inputNumber(player2);
		    whoWin(player1);
		    whoWin(player2);
		}
	}

	private void inputNumber(Player player) {
			System.out.print("����� �� ����� " + player.getName() + ", ������� ����� �� 0 �� 100: ");
			player.setNumberOfAttempt(numberOfAttempt);
		    player.setNumber(inputSymbols.nextInt());
	}

	private void whoWin(Player player) {
		if (player.getNumber() == randomNumber) {
			playerWin(player);
		} else if (player.getNumber() < randomNumber) {
			System.out.println(player.getName() + ", �������� ���� ����� ������ ����, ��� ������� ���������");
		} else if (player.getNumber() > randomNumber) {
			System.out.println(player.getName() + ", �������� ���� ����� ������ ����, ��� ������� ���������");
		} 	
	}

	private  void playerWin(Player player){
		System.out.println("���� ��������. ����������: " + player.getName());
		System.out.println("����� " + player.getName() + " ������ ����� " + randomNumber + " � " + numberOfAttempt + " �������");
		System.out.print("�������� ������� " + player.getName() + " �����: ");
		outputAllPlayerAttempts(player);
		player.setIsWin(true);
	}

	private void outputAllPlayerAttempts(Player player) {
		int[] realInputNumbers = Arrays.copyOf(player.getInputNumbers(), numberOfAttempt);
		for (int i = 0; i < numberOfAttempt; i++) {
			System.out.print(realInputNumbers[i] + " ");
		}
		System.out.println();
	}
}

