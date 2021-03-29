package com.startjava.lesson2_4.calculator;

public class Calculator {

	private String mathExpession;

	public Calculator(String mathExpession) {
		this.mathExpession = mathExpession;
	}

	public int calculate() {
		String[] arrExpressions = mathExpession.split(" ");

		int[] numbers = new int[2];
		numbers[0] = Integer.parseInt(arrExpressions[0]);
		numbers[1] = Integer.parseInt(arrExpressions[2]);

		char[] mathOper = new char[1];
		mathOper[0] = arrExpressions[1].charAt(0);

		switch(mathOper[0]) {
			case '+':
				return numbers[0] + numbers[1];
			case '-':
				return numbers[0] - numbers[1];
			case '*':
				return numbers[0] * numbers[1];
			case '/':
				return numbers[0] / numbers[1];
			case '^':
				return (int) Math.pow(numbers[0], numbers[1]);
			case '%':
				return numbers[0] % numbers[1];
		}
		return 0;
	}	
}