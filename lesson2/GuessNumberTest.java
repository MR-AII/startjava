import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GuessNumber game = new GuessNumber();
		String reply = "yes";

		System.out.print("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scanner.nextLine());

		System.out.print("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scanner.nextLine());

		do {
			while(!game.isWin) {
				System.out.println(firstPlayer.getName() + " введите число от 0до 100: ");
				firstPlayer.setNumber(scanner.nextInt());
				game.start(firstPlayer.getNumber(), firstPlayer.getName());

				System.out.println(secondPlayer.getName() + " введите число от 0до 100: ");
				secondPlayer.setNumber(scanner.nextInt());
				game.start(secondPlayer.getNumber(), secondPlayer.getName());

				if (game.isWin) {
					System.out.println("победитель!");
				}
			}

			System.out.println("Хотите продолжить игру? [yes/no]");
			reply = scanner.nextLine();
		} while (!reply.equals("yes") && !reply.equals("no"));
	}
}