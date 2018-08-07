/**
 *
 * ћодифицируйте программу ”гадай число, использу€ дл€ хранени€, названных игроками чисел, массивы:
 *
 * + перед началом игры выведите сообщение: ” вас 10 попыток
 * + по окончанию игры отобразите, в две строки через пробел, все названные игроками числа
 * + если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток, то выводить весь массив не нужно
 * + в конце игры выведите сообщение "»грок " + им€ + " угадал число " + число + " с " + номер + " попытки"
 * + если игроки не угадали число за 10 попыток, то отобразите сообщение: "” " + им€ + " закончились попытки
 *
 * + —оздайте дополнительное поле в классе Player, которое будет хранить введенные пользователем числа
 * + ƒл€ считывани€ части массива используйте метод класса Arrays.copyOf
 *
 */

package com.startjava.lesson_4.game;
import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner inputSymbols = new Scanner(System.in);
	private static String startAgain;

    public static void main(String[] args) {

		System.out.print("¬ведите им€ 1го игрока (eng): ");
		Player player1 = new Player(inputSymbols.next());
		System.out.print("¬ведите им€ 2го игрока (eng): ");
		Player player2 = new Player(inputSymbols.next());
    	GuessNumber game = new GuessNumber(player1, player2);

		do {
			game.startGame();
			wantToContinue();
		} while (startAgain.equals("yes"));
    }

	private static void wantToContinue() {
		do {
			System.out.print("’отите продолжить? [yes/no]: ");
			startAgain = inputSymbols.next();
		} while (!(startAgain.equals("yes") || startAgain.equals("no")));
	}
}

		