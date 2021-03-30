package com.startjava.lesson2_4.game;

public class Player {

    private String name;
    private int number;
    private int[] arraysNum = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getArraysNum() {
        return arraysNum;
    }

    public void setArraysNum(int[] arraysNum) {
        this.arraysNum = arraysNum;
    }
}