package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;
    private boolean isWin;
    private int[] inputNumbers = new int[10];
    private int numberOfAttempt;

    public Player(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
        inputNumbers[numberOfAttempt - 1] = number;
    }

    public int getNumber() {
        return number;
    }

    public void setIsWin(boolean isWin) {
        this.isWin = isWin;
    }

    public boolean getIsWin() {
        return isWin;
    }

    public void setNumberOfAttempt(int numberOfAttempt) {
        this.numberOfAttempt = numberOfAttempt;
    }

    public int[] getInputNumbers() {
        return inputNumbers;
    }
}