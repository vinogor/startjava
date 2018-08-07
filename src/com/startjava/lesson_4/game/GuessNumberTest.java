/**
 * Модифицируйте программу Угадай число, используя для хранения, названных игроками чисел, массивы:
 * <p>
 * + перед началом игры выведите сообщение: У вас 10 попыток
 * + по окончанию игры отобразите, в две строки через пробел, все названные игроками числа
 * + если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток, то выводить весь массив не нужно
 * + в конце игры выведите сообщение "Игрок " + имя + " угадал число " + число + " с " + номер + " попытки"
 * + если игроки не угадали число за 10 попыток, то отобразите сообщение: "У " + имя + " закончились попытки
 * <p>
 * + Создайте дополнительное поле в классе Player, которое будет хранить введенные пользователем числа
 * + Для считывания части массива используйте метод класса Arrays.copyOf
 */

package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner inputSymbols = new Scanner(System.in);
    private static String startAgain;

    public static void main(String[] args) {

        GuessNumber game = enterNames();
//		System.out.print("Введите имя 1го игрока (eng): ");
//		Player player1 = new Player(inputSymbols.next());
//		System.out.print("Введите имя 2го игрока (eng): ");
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
            System.out.print("Хотите продолжить? [yes/no]: ");
            startAgain = inputSymbols.next();
        } while (!(startAgain.equals("yes") || startAgain.equals("no")));
    }

    private static GuessNumber enterNames() {
        System.out.print("Введите имя 1го игрока (eng): ");
        Player player1 = new Player(inputSymbols.next());
        System.out.print("Введите имя 2го игрока (eng): ");
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

		