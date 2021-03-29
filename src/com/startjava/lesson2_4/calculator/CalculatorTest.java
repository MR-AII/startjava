package com.startjava.lesson2_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc;
		String reply = "yes";

		while(reply.equals("yes")) {
			System.out.print("Введите математическое выражение: ");
			calc = new Calculator(scanner.nextLine());
			System.out.println("Результат вычисления = " + calc.calculate());

			do {
				System.out.println("Хотите продолжить вычисления? [yes/no]");
				reply = scanner.nextLine();
			} while (!reply.equals("yes") && !reply.equals("no"));
		}
		scanner.close();
	}
}