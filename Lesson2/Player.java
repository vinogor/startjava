// описываем экземпляр игрока (имя, загаданное число), иниц. через конструктор
//
public class Player {
	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}	
}


/*

Класс Player должен иметь следующие поля и методы:
String name — имя игрока (одного!)
int number — введенное пользователем число


числа игроков вводятся игроками )
"инициализируем их через конструктор (имя + число которое они вводят)" - зачем число вводить через конструктор, только имя (edited)
игра запускается в классе GuessNumberTest через вызов метода из класса GuessNumber (edited)


*/