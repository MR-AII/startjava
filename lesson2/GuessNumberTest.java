import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GuessNumber game = new GuessNumber();

		System.out.print("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scanner.nextLine());
		game.setP1Name(firstPlayer.getName());


		System.out.print("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scanner.nextLine());
		game.setP2Name(secondPlayer.getName());

		String reply = "yes";
		while (reply.equals("yes")) {
			game.start();
			do {
				System.out.println("Хотите продолжить игру? [yes/no]: ");
				reply = scanner.nextLine();
			} while (!reply.equals("yes") && !reply.equals("no"));
		}
	}
}