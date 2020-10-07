public class MyFirstGame {
	public static void main(String[] args) {
		int guesNum = 14;
		int userNum = 45;
		while (true) {
			if (userNum > guesNum) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				userNum--;
			} else if (userNum < guesNum) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				userNum++;
			} else if (userNum == guesNum) {
				System.out.println("Вы угадали!");
				break;
			}
		}
	}
}