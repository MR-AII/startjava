import java.util.Scanner;

public class GuessNumber {

	private Scanner scanner = new Scanner(System.in);
	private Player playerOne = new Player();
	private Player playerTwo = new Player();
	private String p1Name;
	private String p2Name;
	private int randomNum = (int) (Math.random() * 101);

	public String getP1Name() {
		return p1Name;
	}

	public void setP1Name(String p1Name) {
		this.p1Name = p1Name;
	}

	public String getP2Name() {
		return p2Name;
	}

	public void setP2Name(String p2Name) {
		this.p2Name = p2Name;
	}

	public void start() {
		System.out.println(randomNum);
		while(true) {
			System.out.print(p1Name + " введите ваше число: ");
			playerOne.setNumber(scanner.nextInt());
			if (playerOne.getNumber() > randomNum) {
				System.out.println(p1Name + " ваше число больше чем загадал кампуктер");
			} else if (playerOne.getNumber() < randomNum) {
				System.out.println(p1Name + " ваше число меньше чем загадал кампуктер");
			} else if (playerOne.getNumber() == randomNum) {
				System.out.println(p1Name + " вы угадали!");
				break;
			}

			System.out.print(p2Name + " введите ваше число: ");
			playerTwo.setNumber(scanner.nextInt());
			if (playerTwo.getNumber() > randomNum) {
				System.out.println(p2Name + " ваше число больше чем загадал кампуктер");
			} else if (playerTwo.getNumber() < randomNum) {
				System.out.println(p2Name + " ваше число меньше чем загадал кампуктер");
			} else if (playerTwo.getNumber() == randomNum) {
				System.out.println(p2Name + " вы угадали!");
				break;
			}
		}
	}
}