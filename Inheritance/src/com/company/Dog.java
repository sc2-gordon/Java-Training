package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("The dog chews");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("The dog walks");
        super.move(5);
    }

    public void run(){
        System.out.println("The dog runs");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("The dog moves its legs");
    }

    @Override
    public void move(int speed) {
        System.out.println("The dog moves");
        moveLegs(speed);
        super.move(speed);
    }
}
