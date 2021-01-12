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

	public int resultCalculation() {
		int sum = 0;
		switch(mathOper) {
			case '+': sum = firstNum + secondNum;
				break;
			case '-': sum = firstNum - secondNum;
				break;
			case '*': sum = firstNum * secondNum;
				break;
			case '/': sum = firstNum / secondNum;
				break;
			case '^':
				sum  = 1;
				for (int i = 0; i < secondNum; i++) {
					sum *= firstNum;
				}
				break;
			case '%': sum = firstNum % secondNum;
				break;
		}
		System.out.println("Результат вычисления = " + sum);
		return sum;
	}	
}