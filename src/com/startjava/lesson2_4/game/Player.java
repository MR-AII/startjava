package com.startjava.lesson2_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNums = new int[10];
    private int tryCount;
    private int index;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums(int index) {
        this.index = index;
        return Arrays.copyOf(enteredNums, index);
    }

    public void setEnteredNum(int num, int index) {
        this.index = index;
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