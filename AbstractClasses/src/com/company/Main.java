package com.company;

public class Main {

    public static void main(String[] args) {
         Dog dog = new Dog("yum");
         dog.breathe();
         dog.eat();

         Parrot parrot = new Parrot("Lop");
         parrot.breathe();
         parrot.eat();
         parrot.fly();

         Penguin penguin = new Penguin("Joey");
         penguin.eat();
         penguin.breathe();
         penguin.fly();
    }
}
