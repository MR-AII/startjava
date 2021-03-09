import java.util.Scanner;

public class GuessNumber {

	Scanner scanner = new Scanner(System.in);
	Player firstPlayer;
	Player secondPlayer;
	String reply = "yes";

	public void start() {
		int guessNum = (int) (Math.random() * 100);

		System.out.println("Введите имя первого игрока: ");
		firstPlayer = new Player(scanner.nextLine());

		System.out.println("Введите имя второго игрока: ");
		secondPlayer = new Player(scanner.nextLine());

		while (true) {
			System.out.println(firstPlayer.getName() + " Введите ваше число: ");
			firstPlayer.setAnswer(scanner.nextInt());

			System.out.println(secondPlayer.getName() + " Введите ваше число: ");
			secondPlayer.setAnswer(scanner.nextInt());

			if (firstPlayer.getAnswer() == guessNum) {
				System.out.println(firstPlayer.getName() + " угадал загаданное число " + guessNum);
			} else if (secondPlayer.getAnswer() == guessNum) {
				System.out.println(secondPlayer.getName() + " угадал загаданное число " + guessNum);
			} else {
				System.out.println("Ни один игрок не угадал. Загаданное число: " + guessNum);
			}
			break;
		}
	}

}