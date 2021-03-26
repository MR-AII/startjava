package com.startjava.lesson1;

public class Calculator {

	private int firstNum;
	private int secondNum;
	private char mathOper;

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public char getMathOper() {
		return mathOper;
	}

	public void setMathOper(char mathOper) {
		this.mathOper = mathOper;
	}

	public int resultCalculation(int a, int b, char symbol) {
		int sum = 0;
		switch(symbol) {
			case '+': sum = a + b;
				break;
			case '-': sum = a - b;
				break;
			case '*': sum = a * b;
				break;
			case '/': sum = a / b;
				break;
			case '^':
				sum  = 1;
				for (int i = 0; i < b; i++) {
					sum *= a;
				}
				break;
			case '%': sum = a % b;
				break;
		}
		System.out.println(sum);
		return sum;
	}	
}