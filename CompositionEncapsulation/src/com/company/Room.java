package com.company;

public class Room {
    private Walls theWall;
    private Door theDoor;
    private Chair theChair;
    private Table theTable;

    public Room(Walls theWall, Door theDoor, Chair theChair, Table theTable) {
        this.theWall = theWall;
        this.theDoor = theDoor;
        this.theChair = theChair;
        this.theTable = theTable;
    }

    public Walls getTheWall() {
        return theWall;
    }

    public Door getTheDoor() {
        return theDoor;
    }

    public Chair getTheChair() {
        return theChair;
    }

    public Table getTheTable() {
        return theTable;
    }
}
