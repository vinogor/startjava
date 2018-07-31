package com.startjava.lesson2.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

    	Scanner inputSymbols = new Scanner(System.in);
    	
		System.out.print("������� ��� 1�� ������ (eng): ");
		String namePlayer1 = inputSymbols.next();
		Player player1 = new Player(namePlayer1);

		System.out.print("������� ��� 2�� ������ (eng): ");
		String namePlayer2 = inputSymbols.next();
		Player player2 = new Player(namePlayer2);

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

		