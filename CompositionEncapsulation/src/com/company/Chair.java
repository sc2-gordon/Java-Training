package com.company;

public class Chair {
    private String type;
    private int numOfChairs;

    public Chair(String type, int numOfChairs) {
        this.type = type;
        this.numOfChairs = numOfChairs;
    }

    public void displayChair() {
        System.out.println("There are " + this.numOfChairs + " of chairs of the " + this.type + " type.");
    }

    public String getType() {
        return type;
    }

    public int getNumOfChairs() {
        return numOfChairs;
    }
}
