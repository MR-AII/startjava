package com.startjava.lesson2_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNums = new int[10];
    private int tryCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
        int i = 0;
        for (int nums : enteredNums) {
            if (nums > 0) {
                i++;
            }
        }
        return Arrays.copyOf(enteredNums, i);
    }

    public void setEnteredNum(int num, int index) {
        enteredNums[index] = num;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public int tryCountDecrement() {
        return tryCount--;
    }
}