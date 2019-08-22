package com.company;

public class Door {
    private String design;
    private String colour;

    public Door(String design, String colour) {
        this.design = design;
        this.colour = colour;
    }

    public void displayDoor() {
        System.out.println("The door is of the " + this.design + " design and is " + this.colour + " in colour.");
    }

    public String getDesign() {
        return design;
    }

    public String getColour() {
        return colour;
    }
}
