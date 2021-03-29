package com.startjava.lesson2_4.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger j1 = new Jaeger();
		j1.setModelName("Crimson Typhoon");
		j1.setMark("Mark-4");
		j1.setOrigin("China");
		j1.setHeight(76.2f);
		j1.setWeight(1.722f);
		j1.setSpeed(9);
		j1.setStrength(8);
		j1.setArmor(6);
		System.out.println("Егерь =: " + j1.getModelName() + "\n" + "Марка =: " + j1.getMark() + "\n" + "Состояние дрифт =: " + j1.drift() + "\n");
		
		Jaeger j2 = new Jaeger();
		j2.setModelName("Cayote Tango");
		j2.setMark("Mark-1");
		j2.setOrigin("Japan");
		j2.setHeight(85.34f);
		j2.setWeight(2.312f);
		j2.setSpeed(5);
		j2.setStrength(7);
		j2.setArmor(4);
		System.out.println("Егерь =: " + j2.getModelName() + "\n" + "Марка =: " + j2.getMark() + "\n" + "Текущее действие =: " + j2.scanKaiju());
	}
}