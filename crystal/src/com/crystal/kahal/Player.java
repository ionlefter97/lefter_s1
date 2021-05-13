package com.crystal.kahal;

public class Player {
    private String name;
    private int score;
    private int movementNumber;


    public Player() {
        name = null;
        score = 0;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getTheStones(int[] arrayBoard, int position){
        return arrayBoard[position];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMovementNumber() {
        return movementNumber;
    }

    public void setMovementNumber(int movementNumber) {
        this.movementNumber = movementNumber;
    }

}
