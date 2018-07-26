import java.util.Scanner;

public class Player {
	private String name;
	private int number;
	Scanner inputSymbols = new Scanner(System.in);

//	public setName(String name) {
//		this.name = name;
//	}


	public void chooseName() {
	    name = inputSymbols.next();
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}	 

	public void guess(){
		System.out.print("игрок по имени " + name + ", введите число от 0 до 100: ");
	    number = inputSymbols.nextInt();
	}
} 