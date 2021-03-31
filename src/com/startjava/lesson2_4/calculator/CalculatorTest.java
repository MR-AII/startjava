package com.startjava.lesson2_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc;
		String reply = "да";

		while(reply.equals("да")) {
			System.out.print("Введите математическое выражение: ");
			calc = new Calculator(scanner.nextLine());
			System.out.println("Результат вычисления = " + calc.calculate());

			do {
				System.out.println("Хотите продолжить вычисления? [да/нет]");
				reply = scanner.nextLine();
			} while (!reply.equals("да") && !reply.equals("нет"));
		}
		scanner.close();
	}
}