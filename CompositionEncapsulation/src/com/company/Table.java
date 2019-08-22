package com.company;

public class Table {
    private String type;
    private int numOfTables;

    public Table(String type, int numOfTables) {
        this.type = type;
        this.numOfTables = numOfTables;
    }

    public void displayTables() {
        System.out.println("There are " + this.numOfTables + " number of tables with the " + this.type + " design.");
    }

    public String getType() {
        return type;
    }

    public int getNumOfTables() {
        return numOfTables;
    }
}
