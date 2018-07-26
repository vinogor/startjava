// создаём экземпляры 2х игроков 
// запускаем метод старта игры

public class GuessNumberTest {
    public static void main(String[] args) {
		Player playerOne = new Player("Коля");
		Player playerTwo = new Player("Петя");

	//	System.out.println(playerOne.getName());

		GuessNumber.Game();
    }
}