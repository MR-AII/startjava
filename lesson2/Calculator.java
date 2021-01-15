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

	public int Calculate() {
		int result = 0;
		switch(mathOper) {
			case '+':
				result = firstNum + secondNum;
				break;
			case '-':
				result = firstNum - secondNum;
				break;
			case '*':
				result = firstNum * secondNum;
				break;
			case '/': 
				result = firstNum / secondNum;
				break;
			case '^':
				result  = 1;
				for (int i = 0; i < secondNum; i++) {
					result *= firstNum;
				}
				break;
			case '%':
				result = firstNum % secondNum;
				break;
		}
		System.out.println("Результат вычисления = " + result);
		return result;
	}	
}