public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.gender = "male";
		wolfOne.nickname = "Yashi";
		wolfOne.weight = 23.5f;
		wolfOne.age = 8;
		wolfOne.color = "grey";
		System.out.println("nickname = " + wolfOne.nickname);
		System.out.println("gender = " + wolfOne.gender);
		System.out.println("weight = " + wolfOne.weight);
		System.out.println("age = " + wolfOne.age);
		System.out.println("color = " + wolfOne.color);
		wolfOne.go();
		wolfOne.sitDown();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunts();
	}
}