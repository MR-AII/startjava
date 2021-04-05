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
        System.out.println(randomNum);
        playerOne.setTryCount(10);
        playerTwo.setTryCount(10);

        int i;
        for (i = 1; i <= 10; i++) {
            enteringNum(playerOne, i);
            enteringNum(playerTwo, i);
            if (compareNum(playerOne, i)) {
                break;
            } else if (compareNum(playerTwo, i)) {
                break;
            }
        }

        showPlayerNums(playerOne, i);
        showPlayerNums(playerTwo, i);
    }

    public boolean compareNum(Player player, int i) {
        int num = player.getEnteredNums(i)[i - 1];
        if (num > randomNum) {
            System.out.println(player.getName() + " ваше число больше чем загадал компьютер. Осталось попыток: " + player.getTryCount() + "\n");
        } else if (num < randomNum) {
            System.out.println(player.getName() + " ваше число меньше чем загадал компьютер. Осталось попыток: " + player.getTryCount() + "\n");
        } else {
            System.out.println("Игрок: " + player.getName() + " угадал число: " + randomNum + " с " + i + " попытки");
            return true;
        }
        return false;
    }

    public void enteringNum(Player player, int i) {
        System.out.print(player.getName() + " введите число: ");
        player.setEnteredNum(scanner.nextInt(), i - 1);
        player.tryCountDecrement();
    }

    public void showPlayerNums(Player player, int i) {
        System.out.print("Введенные числа игрока - " + player.getName() + ": ");
        for (int num : player.getEnteredNums(i)) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
}