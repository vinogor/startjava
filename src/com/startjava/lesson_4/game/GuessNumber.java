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
        System.out.println("Старт игры! У каждого игрока есть 10 попыток.");
        createRandomNumber();
        setUp();
        playRounds();
    }

    private void createRandomNumber() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал число: " + randomNumber);
    }

    private void setUp() {
        player1.setIsWin(false);
        player2.setIsWin(false);
        numberOfAttempt = 0;
    }

    private void playRounds() {
        do {
            numberOfAttempt++;
            if (numberOfAttempt > 10) {
                System.out.println("Попытки закончились! Победителей нет.");
                break;
            }
            System.out.println("Попытка №" + numberOfAttempt);
            inputNumber(player1);
            inputNumber(player2);
            checkVictory(player1);
            checkVictory(player2);
        } while (!(player1.getIsWin() || player2.getIsWin()));
    }

    private void inputNumber(Player player) {
        System.out.print("Игрок по имени " + player.getName() + ", введите число от 0 до 100: ");
        player.setNumberOfAttempt(numberOfAttempt);
        player.setNumber(inputSymbols.nextInt());
    }

    private void checkVictory(Player player) {
        if (player.getNumber() == randomNumber) {
            sumUpGame(player);
        } else if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + ", введённое вами число меньше того, что загадал компьютер");
        } else if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + ", введённое вами число больше того, что загадал компьютер");
        }
    }

    private void sumUpGame(Player player) {
        System.out.println("Игра окончена. Победитель: " + player.getName());
        System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + numberOfAttempt + " попытки");
        System.out.print("Введённые игроком " + player.getName() + " числа: ");
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

