package com.startjava.lesson2_4.game;

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

        while (true) {
            playerOne.setTryCount(10);
            playerTwo.setTryCount(10);

            for (int i = 0; i < 10; i++) {
                System.out.print(playerOne.getName() + " введите число: ");
                playerOne.setEnteredNums(scanner.nextInt(), i);
                if (playerOne.getEnteredNums()[i] > randomNum) {
                    playerOne.tryCountDecrement();
                    System.out.println(playerOne.getName() + " ваше число больше чем загадал компьютер. Осталось попыток: " + playerOne.getTryCount() + "\n");
                } else if (playerOne.getEnteredNums()[i] < randomNum) {
                    playerOne.tryCountDecrement();
                    System.out.println(playerOne.getName() + " ваше число меньше чем загадал компьютер. Осталось попыток: " + playerOne.getTryCount() + "\n");
                } else if (playerOne.getEnteredNums()[i] == randomNum) {
                    System.out.println("Игрок: " + playerOne.getName() + " угадал число: " + randomNum + " с " + i + " попытки");
                    break;
                }

                System.out.print(playerTwo.getName() + " введите число: ");
                playerTwo.setEnteredNums(scanner.nextInt(), i);
                if (playerTwo.getEnteredNums()[i] > randomNum) {
                    playerTwo.tryCountDecrement();
                    System.out.println(playerTwo.getName() + " ваше число больше чем загадал компьютер. Осталось попыток: " + playerTwo.getTryCount() + "\n");
                } else if (playerTwo.getEnteredNums()[i] < randomNum) {
                    playerTwo.tryCountDecrement();
                    System.out.println(playerTwo.getName() + " ваше число меньше чем загадал компьютер. Осталось попыток: " + playerTwo.getTryCount() + "\n");
                } else if (playerTwo.getEnteredNums()[i] == randomNum) {
                    System.out.println("Игрок: " + playerTwo.getName() + " угадал число: " + randomNum + " с " + i + " попытки");
                    break;
                }
            }
            showPlayersNum(playerOne);
            System.out.println("");
            showPlayersNum(playerTwo);
            break;
        }
    }

    public void showPlayersNum(Player player) {
        System.out.print("Введенные числа игрока - " + player.getName() + ": ");
        for (int i = 0; i < player.getEnteredNums().length; i++) {
            if (player.getEnteredNums()[i] > 0) {
                System.out.print(player.getEnteredNums()[i] + " ");
            }
        }
    }
}