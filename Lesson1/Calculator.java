public class Calculator {
    public static void main(String[] args) {
		int firstInputNumber = 4;
		int secondInputNumber = 10;
		int resultOfСalculation = 1; // = 1 - чтобы работало возведение в степень 
		String mathOperation = "^";
		if (mathOperation.equals("+")) {
			resultOfСalculation = firstInputNumber + secondInputNumber;
		}
		else if (mathOperation.equals("-")) {
			resultOfСalculation = firstInputNumber - secondInputNumber;
		}
		else if (mathOperation.equals("*")) {
			resultOfСalculation = firstInputNumber * secondInputNumber;
		}
		else if (mathOperation.equals("/")) {
			resultOfСalculation = firstInputNumber / secondInputNumber;
		}
		else if (mathOperation.equals("%")) {
			resultOfСalculation = firstInputNumber % secondInputNumber;
		}
		else if (mathOperation.equals("^")) {
			for (int i = 0; i < secondInputNumber; i++) {
				resultOfСalculation *= firstInputNumber;
			}
		}
		System.out.println(firstInputNumber + " " + mathOperation + " " + secondInputNumber + " = " + resultOfСalculation);
 	}
}

