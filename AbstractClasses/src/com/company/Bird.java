package com.company;

public class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying!");
    }
}
