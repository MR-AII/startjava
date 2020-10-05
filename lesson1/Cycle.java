public class Cycle {
	public static void main(String[] args) {
		System.out.println("Вывод всех чисел [0, 20]");
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("Вывод всех чисел [6, -6] с шагом итерации 2");
		int num = 6;
		while(num >= -6) {
			System.out.println(num);
			num -= 2;
		}

		System.out.println("Сумма всех нечетных чисел [10, 20]");
		num = 10;
		int sumOdd = 0;
		do {
			if (num % 2 != 0) {
				sumOdd += num;
			}
			num++;
		} while(num <= 20); 
		System.out.println(sumOdd);
	}
}