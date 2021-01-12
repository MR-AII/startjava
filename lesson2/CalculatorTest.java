import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scanner = null; 
		boolean stop = false;

		while(!stop) {
			Calculator calc = new Calculator();

			scanner = new Scanner(System.in);
			System.out.println("Введите первое число: ");
			calc.setFirstNum(scanner.nextInt());

			System.out.println("Введите знак математической операции: ");
			calc.setMathOper(scanner.next().charAt(0));

			System.out.println("Введите второе число: ");
			calc.setSecondNum(scanner.nextInt());

			calc.resultCalculation();

			while(!stop) {
				System.out.println("Хотите продолжить вычисления? [yes/no]");
				scanner = new Scanner(System.in);
				String change = scanner.nextLine();
				if (change.equals("no")) {
					stop = true;
				} else if (change.equals("yes")) {
					break;
				}
			}
		}
		scanner.close();
	}
}