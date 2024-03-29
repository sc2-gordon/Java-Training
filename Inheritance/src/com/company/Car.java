package com.company;

public class Car extends Vehicle {
    private String model;
    private String make;

    public Car(String steering, int changingGears, int movingSpeed, String model, String make) {
        super(steering, changingGears, movingSpeed);
        this.model = model;
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
