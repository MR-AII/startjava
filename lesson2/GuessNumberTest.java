import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());

        String reply = "yes";
        while (reply.equals("yes")) {
            GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                reply = scanner.nextLine();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}