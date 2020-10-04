public class ConditionalStatement {
	public static void main(String[] args) {
		int myAge = 27;
		boolean isMale = true;
		float height = 1.79f;
		char nameBegins = 'И';

		if (myAge > 20) {
			System.out.println("я уже взрослый мальчик");
		}

		if (isMale) {
			System.out.println("Йа Мужык");
		}

		if (!isMale) {
			System.out.println("Йа нэ Мужык :-D");
		}

		if (height < 1.80) {
			System.out.println("мой рост меньше 1.80");
		} else {
			System.out.println("мой рост больше 1.80");
		}

		if (nameBegins == 'М') {
			System.out.println("Мое имя начинается с 'М'");
		} else if (nameBegins == 'И') {
			System.out.println("Мое имя начинается с 'И'");
		} else {
			System.out.println("не понятно");
		}
	}
}