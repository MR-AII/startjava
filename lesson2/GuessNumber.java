import java.util.Scanner;

public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private int randomNum = (int) (Math.random() * 101);
    private Player playerOne;
    private Player playerTwo ;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        System.out.println(randomNum);
        while(true) {
            System.out.print(playerOne.getName() + " введите ваше число: ");
            playerOne.setNumber(scanner.nextInt());
            if (playerOne.getNumber() > randomNum) {
                System.out.println(playerOne.getName() + " ваше число больше чем загадал кампуктер \n");
            } else if (playerOne.getNumber() < randomNum) {
                System.out.println(playerOne.getName() + " ваше число меньше чем загадал кампуктер \n");
            } else if (playerOne.getNumber() == randomNum) {
                System.out.println(playerOne.getName() + " вы угадали!");
                break;
            }

            System.out.print(playerTwo.getName() + " введите ваше число: ");
            playerTwo.setNumber(scanner.nextInt());
            if (playerTwo.getNumber() > randomNum) {
                System.out.println(playerTwo.getName() + " ваше число больше чем загадал кампуктер \n");
            } else if (playerTwo.getNumber() < randomNum) {
                System.out.println(playerTwo.getName() + " ваше число меньше чем загадал кампуктер \n");
            } else if (playerTwo.getNumber() == randomNum) {
                System.out.println(playerTwo.getName() + " вы угадали! \n");
                break;
            }
        }
    }
}