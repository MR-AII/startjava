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
			num = num - 2;
		}

		System.out.println("Сумма всех нечетных чисел [10, 20]");

		int i = 10;
		int sumOddNumbers = 0;
		do {
			if (i % 2 != 0) {
				sumOddNumbers = sumOddNumbers + i;
			}
			i++;
		} while(i <= 20); 
		System.out.println(sumOddNumbers);
		

	}
}