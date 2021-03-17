public class GuessNumber {

	private int randomNum = (int) (Math.random() * 101);
	boolean isWin = false;

	public void start(int playerNum, String playerName) {
		if (playerNum > randomNum) {
			System.out.println(playerName + " ваше число больше чем загадал компьютер.");
		} else if (playerNum < randomNum) {
			System.out.println(playerName + " ваше число меньше чем загадал компьютер.");
		} else if (playerNum == randomNum) {
			isWin = true;
		}
	}
}