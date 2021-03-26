package com.startjava.lesson1;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 27;
		if (age > 20) {
			System.out.println("я уже взрослый мальчик");
		}

		boolean isMale = true;
		if (isMale) {
			System.out.println("Йа Мужык");
		}

		if (!isMale) {
			System.out.println("Йа нэ Мужык :-D");
		}

		float height = 1.79f;
		if (height < 1.80) {
			System.out.println("мой рост меньше 1.80");
		} else {
			System.out.println("мой рост больше 1.80");
		}

		char firstNameLetter = 'И';
		if (firstNameLetter == 'М') {
			System.out.println("Мое имя начинается с 'М'");
		} else if (firstNameLetter == 'И') {
			System.out.println("Мое имя начинается с 'И'");
		} else {
			System.out.println("не понятно");
		}
	}
}