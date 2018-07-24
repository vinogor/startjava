public class MyFirstGame {
    public static void main(String[] args) {
    	int inputNumber = -10;
    	int computerNumber = 3;
    	while (true) {
		    if (inputNumber < computerNumber) {
		    	System.out.println("Введённое вами число [" + inputNumber + "] меньше того, что загадал компьютер");
		    	inputNumber++;
		    } else if (inputNumber > computerNumber) {
		    	System.out.println("Введённое вами число [" + inputNumber + "] больше того, что загадал компьютер");
		    	inputNumber--;
		    } else {
		    	System.out.println("Вы угадали! Компьютер загадал: " + inputNumber);
		    	break;
	    	}
	    } 
	}
}