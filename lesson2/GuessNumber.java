import java.util.Scanner;

public class GuessNumber {

	private Scanner scanner = new Scanner(System.in);
	private Player playerOne;
	private Player playerTwo;
	private int randomNum = (int) (Math.random() * 101);

	public void start() {
		System.out.println(randomNum);
		while(true) {
			System.out.print("Игрок 1 введите ваше число: ");
			playerOne.setNumber(scanner.nextInt());
			if (playerOne.getNumber() > randomNum) {
				System.out.println(playerOne.getName() + " ваше число больше чем загадал кампуктер");
			} else if (playerOne.getNumber() < randomNum) {
				System.out.println(playerOne.getName() + " ваше число меньше чем загадал кампуктер");
			} else if (playerOne.getNumber() == randomNum) {
				System.out.println(playerOne.getName() + " вы угадали!");
				break;
			}

			System.out.print("Игрок 2 введите ваше число: ");
			playerTwo.setNumber(scanner.nextInt());
			if (playerTwo.getNumber() > randomNum) {
				System.out.println(playerTwo.getName() + " ваше число больше чем загадал кампуктер");
			} else if (playerTwo.getNumber() < randomNum) {
				System.out.println(playerTwo.getName() + " ваше число меньше чем загадал кампуктер");
			} else if (playerTwo.getNumber() == randomNum) {
				System.out.println(playerTwo.getName() + " вы угадали!");
				break;
			}
		}
	}
}