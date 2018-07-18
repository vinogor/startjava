

public class Calculator {
    public static void main(String[] args) {

int a = 4, b = 10; // первое и второе вводимое число
int s = 1; // результат вычислений, s = 1 - чтобы работало возведение в степень 
String mathOp = "^";

	if (mathOp.equals("+"))
		s = a + b;
	else if (mathOp.equals("-"))
		s = a - b;
	else if (mathOp.equals("*"))
		s = a * b;
	else if (mathOp.equals("/"))
		s = a / b;
	else if (mathOp.equals("%"))
		s = a % b;
	else if (mathOp.equals("^")) {
		for (int i = 0; i < b; i++)
			s = s * a;
	}

	System.out.println(a + " " + mathOp + " " + b + " = " + s);
   
	}
}

