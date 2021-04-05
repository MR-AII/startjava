package com.startjava.lesson2_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private int randomNum = (int) (Math.random() * 101);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        playerOne.setTryCount(10);
        playerTwo.setTryCount(10);

        int i;
        for (i = 1; i <= 10; i++) {
            if (comparesNum(playerOne, i)) {
                printMessage3(playerOne, i);
                break;
            } else if (comparesNum(playerTwo, i)) {
                printMessage3(playerTwo, i);
                break;
            }
        }

        showPlayerNums(playerOne, i);
        showPlayerNums(playerTwo, i);
    }

    public boolean comparesNum(Player player, int i) {
        System.out.print(player.getName() + " введите число: ");
        player.setEnteredNum(scanner.nextInt(), i - 1);

        int num = player.getEnteredNums(i)[i - 1];
        if (num > randomNum) {
            player.tryCountDecrement();
            printMessage1(player);
        } else if (num < randomNum) {
            player.tryCountDecrement();
            printMessage2(player);
        } else {
            return true;
        }
        return false;
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

    public void showPlayerNums(Player player, int i) {
        System.out.print("Введенные числа игрока - " + player.getName() + ": ");
        for (int playerNum : player.getEnteredNums(i - 1)) {
            System.out.print(playerNum + " ");
        }
        System.out.println(" ");
    }
}