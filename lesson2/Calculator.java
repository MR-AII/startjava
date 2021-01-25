public class Calculator { 

	private int firstNum;
	private int secondNum;
	private char mathOper;

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setMathOper(char mathOper) {
		this.mathOper = mathOper;
	}

	public int calculate() {
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