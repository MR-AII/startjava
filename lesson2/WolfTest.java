public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setGender("male");
		wolfOne.setNickname("Yashi");
		wolfOne.setWeight(23.5f) ;
		wolfOne.setAge(10);
		wolfOne.setColor("grey");

		System.out.println("nickname = " + wolfOne.getNickname());
		System.out.println("gender = " + wolfOne.getGender());
		System.out.println("weight = " + wolfOne.getWeight());
		System.out.println("age = " + wolfOne.getAge());
		System.out.println("color = " + wolfOne.getColor());

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}