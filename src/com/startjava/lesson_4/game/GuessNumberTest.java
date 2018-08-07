package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner inputSymbols = new Scanner(System.in);
    private static String startAgain;
    private static String[] playersNames = new String[2];

    public static void main(String[] args) {
        enterNames();
        GuessNumber game = initPlayers();
        do {
            game.startGame();
            checkDesireToContinue();
        } while (startAgain.equals("yes"));
    }

    private static void enterNames() {
        System.out.print("������� ��� 1�� ������ (eng): ");
        playersNames[0] = inputSymbols.next();
        System.out.print("������� ��� 2�� ������ (eng): ");
        playersNames[1] = inputSymbols.next();
    }

    private static GuessNumber initPlayers() {
        Player player1 = new Player(playersNames[0]);
        Player player2 = new Player(playersNames[1]);
        return new GuessNumber(player1, player2);
    }

    private static void checkDesireToContinue() {
        do {
            System.out.print("������ ����������? [yes/no]: ");
            startAgain = inputSymbols.next();
        } while (!(startAgain.equals("yes") || startAgain.equals("no")));
    }
}

		