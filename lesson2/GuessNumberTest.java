import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		String reply = "yes";

		while(reply.equals("yes")) {
			Scanner scanner = new Scanner(System.in);
			GuessNumber guessNumber = new GuessNumber();
			guessNumber.start();
			
			do {			
				System.out.println("Хотите продолжить игру? [yes/no]");
				reply = scanner.nextLine();
			} while (!reply.equals("yes") && !reply.equals("no"));
		}
	}
}