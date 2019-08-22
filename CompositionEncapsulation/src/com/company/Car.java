package com.company;

public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine(){
        System.out.println(this.name + "'s engine has been started.");
    }

    public void accelerate(){
        System.out.println(this.name + " is accelerating. All " + this.cylinders + " are functional.");
    }

    public void brake(){
        System.out.println("Braking. All " + this.cylinders + " have ceased. " + this.name + " is coming to a stop.");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}
