package com.startjava.lesson2_4.calculator;

public class Calculator { 

	private int firstNum;
	private int secondNum;
	private char mathOper;
	private String mathExpession;

	public Calculator(String mathExpession) {
		this.mathExpession = mathExpession;
	}

	public int calculate() {
		String[] arrExpressions = mathExpession.split(" ");
		firstNum = Integer.parseInt(arrExpressions[0]);
		secondNum = Integer.parseInt(arrExpressions[2]);
		mathOper = ;
		switch(mathOper) {
			case '+':
				return firstNum + secondNum;
			case '-':
				return firstNum - secondNum;
			case '*':
				return firstNum * secondNum;
			case '/':
				return firstNum / secondNum;
			case '^':
				int result  = 1;
				for (int i = 0; i < secondNum; i++) {
					result *= firstNum;
				}
				return result;
			case '%':
				return firstNum % secondNum;
		}
		return 0;
	}	
}