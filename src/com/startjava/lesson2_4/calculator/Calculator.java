package com.startjava.lesson2_4.calculator;

public class Calculator {

	private String mathExpession;

	public Calculator(String mathExpession) {
		this.mathExpession = mathExpession;
	}

	public int calculate() {
		String[] mathExpressions = mathExpession.split(" ");
		
		switch(mathExpressions[1].charAt(0)) {
			case '+':
				return Integer.parseInt(mathExpressions[0]) + Integer.parseInt(mathExpressions[2]);
			case '-':
				return Integer.parseInt(mathExpressions[0]) - Integer.parseInt(mathExpressions[2]);
			case '*':
				return Integer.parseInt(mathExpressions[0]) * Integer.parseInt(mathExpressions[2]);
			case '/':
				return Integer.parseInt(mathExpressions[0]) / Integer.parseInt(mathExpressions[2]);
			case '^':
				return (int) Math.pow(Integer.parseInt(mathExpressions[0]), Integer.parseInt(mathExpressions[2]));
			case '%':
				return Integer.parseInt(mathExpressions[0]) % Integer.parseInt(mathExpressions[2]);
		}
		return 0;
	}	
}