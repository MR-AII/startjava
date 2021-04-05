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
            inputNum(playerOne, i);
            inputNum(playerTwo, i);
            if (compareNum(playerOne, i) || compareNum(playerTwo, i)) {
                break;
            }
        }

        showPlayerNums(playerOne, i);
        showPlayerNums(playerTwo, i);
    }

    public boolean compareNum(Player player, int i) {
        int num = player.getEnteredNums(i)[i - 1];

        String text1 = player.getName() + " ваше число больше чем загадал компьютер. Осталось попыток: " + player.getTryCount() + "\n";
        String text2 = player.getName() + " ваше число меньше чем загадал компьютер. Осталось попыток: " + player.getTryCount() + "\n";
        String text3 = "Игрок: " + player.getName() + " угадал число: " + randomNum + " с " + i + " попытки";
        System.out.println(num == randomNum ? text3 : num > randomNum ? text1 : text2);

        return num == randomNum;
    }

    public void inputNum(Player player, int i) {
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