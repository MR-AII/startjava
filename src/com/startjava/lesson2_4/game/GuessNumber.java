package com.startjava.lesson2_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private int randomNum = (int) (Math.random() * 101);
    private Player playerOne;
    private Player playerTwo;
    private int playerNum;


    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        System.out.println(randomNum);

        while (true) {
            playerOne.setTryCount(10);
            playerTwo.setTryCount(10);

            for (int i = 1; i <= 10; i++) {
                System.out.print(playerOne.getName() + " введите число: ");
                playerOne.setEnteredNum(scanner.nextInt(), i - 1);
                playerNum = playerOne.getEnteredNums()[i - 1];
                if (playerNum > randomNum) {
                    playerOne.tryCountDecrement();
                    printMessage1(playerOne);
                } else if (playerNum < randomNum) {
                    playerOne.tryCountDecrement();
                    printMessage2(playerOne);
                } else {
                    printMessage3(playerOne, i);
                    break;
                }

                System.out.print(playerTwo.getName() + " введите число: ");
                playerTwo.setEnteredNum(scanner.nextInt(), i - 1);
                playerNum = playerTwo.getEnteredNums()[i - 1];
                if (playerNum > randomNum) {
                    playerTwo.tryCountDecrement();
                    printMessage1(playerTwo);
                } else if (playerNum < randomNum) {
                    playerTwo.tryCountDecrement();
                    printMessage2(playerTwo);
                } else {
                    printMessage3(playerTwo, i);
                    break;
                }
            }
            showPlayerNums(playerOne);
            System.out.println("");
            showPlayerNums(playerTwo);
            break;
        }
    }

    public void printMessage1(Player player) {
        System.out.println(player.getName() + " ваше число больше чем загадал компьютер. Осталось попыток: " + player.getTryCount() + "\n");
    }

    public void printMessage2(Player player) {
        System.out.println(player.getName() + " ваше число меньше чем загадал компьютер. Осталось попыток: " + player.getTryCount() + "\n");
    }

    public void printMessage3(Player player, int winTry) {
        System.out.println("Игрок: " + player.getName() + " угадал число: " + randomNum + " с " + winTry + " попытки");
    }

    public void showPlayerNums(Player player) {
        System.out.print("Введенные числа игрока - " + player.getName() + ": ");
        for (int playerNum : player.getEnteredNums()) {
            System.out.print(playerNum + " ");
        }
    }
}