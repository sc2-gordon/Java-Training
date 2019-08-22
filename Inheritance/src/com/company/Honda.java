package com.company;

public class Honda extends Car {
    private int price;

    public Honda(String steering, int changingGears, int movingSpeed, int price) {
        super(steering, changingGears, movingSpeed, "Honda", "Japanese");
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
