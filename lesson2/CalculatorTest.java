import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scanner = null; 
		String reply = "yes";

		while(reply.equals("yes")) {
			Calculator calc = new Calculator();

			scanner = new Scanner(System.in);
			System.out.println("Введите первое число: ");
			calc.setFirstNum(scanner.nextInt());

			System.out.println("Введите знак математической операции: ");
			calc.setMathOper(scanner.next().charAt(0));

			System.out.println("Введите второе число: ");
			calc.setSecondNum(scanner.nextInt());

			System.out.println("Результат вычисления = " + calc.calculate());

			while(!reply.equals("no")) {
				System.out.println("Хотите продолжить вычисления? [yes/no]");
				scanner = new Scanner(System.in);
				reply = scanner.nextLine();
				if (!(reply.equals("yes") | reply.equals("no"))) {
					continue;
				}
				break;
			}
		}
		scanner.close();
	}
}