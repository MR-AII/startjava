public class Wolf {
	
	private	String gender;
	private	String nickname;
	private	float weight;
	private	int age;
	private	String color;

	//Геттеры
	public String getGender() {
		return gender;
	}

	public String getNickname() {
		return nickname;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	//Сеттеры
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		if (age > 8 ) {
			System.out.println("Некорректный возраст.");
		} else {
			this.age = age;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Wolf going");
	}

	public void sit() {
		System.out.println("Wolf sit down");
	}

	public void run() {
		System.out.println("Wolf running");
	}

	public void howl() {
		System.out.println("Wolf howling");
	}

	public void hunt() {
		System.out.println("Wolf hunting");
	}
}