package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadRoll, String meat) {
        super(breadRoll, meat, 10);
    }

    @Override
    public void viewHamburger() {
        super.viewHamburger();
        System.out.println("The deluxe burger is fixed at $10. No changes can be made to it. Chips and a drink will be provided.");

        System.out.println(getBurgerName() + "\n" + "Bread: " + getBreadRoll() + "\n" + "Meat: " + getMeat());
    }

    @Override
    public void addLettuce() {
        super.addLettuce();
        System.out.println("Not possible to add anything for a deluxe order.");
    }

    @Override
    public void addTomato() {
        super.addTomato();
        System.out.println("Not possible to add anything for a deluxe order.");
    }

    @Override
    public void addPickles() {
        super.addPickles();
        System.out.println("Not possible to add anything for a deluxe order.");
    }

    @Override
    public void addCheese() {
        super.addCheese();
        System.out.println("Not possible to add anything for a deluxe order.");
    }
}
