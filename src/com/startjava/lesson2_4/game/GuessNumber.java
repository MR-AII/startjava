package com.startjava.lesson2_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private int randomNum = (int) (Math.random() * 101);
    private Player playerOne;
    private Player playerTwo ;
    private int tryCountP1 = 10;
    private int tryCountP2 = 10;
    private int[] player1Nums = new int[10];
    private int[] player2Nums = new int[10];

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        System.out.println(randomNum);
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.print(playerOne.getName() + " введите число: ");
                playerOne.setNumber(scanner.nextInt());
                player1Nums[i] = playerOne.getNumber();
                playerOne.setArraysNum(player1Nums);
                if (playerOne.getNumber() > randomNum) {
                    tryCountP1--;
                    System.out.println(playerOne.getName() + " ваше число больше чем загадал компьютер. Осталось попыток: " + tryCountP1 + "\n");
                } else if (playerOne.getNumber() < randomNum) {
                    tryCountP1--;
                    System.out.println(playerOne.getName() + " ваше число меньше чем загадал компьютер. Осталось попыток: " + tryCountP1 + "\n");
                } else if (playerOne.getNumber() == randomNum) {
                    System.out.println("Игрок: " + playerOne.getName() + " угадал число: " + randomNum + " с " + i + " попытки");
                    break;
                }

                System.out.print(playerTwo.getName() + " введите число: ");
                playerTwo.setNumber(scanner.nextInt());
                player2Nums[i] = playerTwo.getNumber();
                playerTwo.setArraysNum(player2Nums);
                if (playerTwo.getNumber() > randomNum) {
                    tryCountP2--;
                    System.out.println(playerTwo.getName() + " ваше число больше чем загадал компьютер. Осталось попыток: " + tryCountP2 + "\n");
                } else if (playerTwo.getNumber() < randomNum) {
                    tryCountP2--;
                    System.out.println(playerTwo.getName() + " ваше число меньше чем загадал компьютер. Осталось попыток: " + tryCountP2 + "\n");
                } else if (playerTwo.getNumber() == randomNum) {
                    System.out.println("Игрок: " + playerTwo.getName() + " угадал число: " + randomNum + " с " + i + " попытки");
                    break;
                }
            }

            System.out.print("Введенные числа игрока - " + playerOne.getName() + ": ");
            for (int player1Num : player1Nums) {
                if (player1Num > 0) {
                    System.out.print(player1Num + " ");
                }
            }

            System.out.println("");

            System.out.print("Введенные числа игрока - " + playerTwo.getName() + ": ");
            for (int player2Num : player2Nums) {
                if (player2Num > 0) {
                    System.out.print(player2Num + " ");
                }
            }
            break;
        }
    }
}