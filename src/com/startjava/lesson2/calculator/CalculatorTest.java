package com.startjava.lesson2.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String reply = "yes";

		while(reply.equals("yes")) {
			Calculator calc = new Calculator();

			System.out.println("Введите первое число: ");
			calc.setFirstNum(scanner.nextInt());

			System.out.println("Введите знак математической операции: ");
			calc.setMathOper(scanner.next().charAt(0));

			System.out.println("Введите второе число: ");
			calc.setSecondNum(scanner.nextInt());

			System.out.println("Результат вычисления = " + calc.calculate());

			do {
				System.out.println("Хотите продолжить вычисления? [yes/no]");
				reply = scanner.nextLine();
			} while (!reply.equals("yes") && !reply.equals("no"));
		}
		scanner.close();
	}
}