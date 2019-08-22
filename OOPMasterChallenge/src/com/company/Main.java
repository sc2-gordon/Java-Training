package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Classic", "Chicken", 1);
	    hamburger.setBurgerName("The Classic");
	    hamburger.addCheese();
	    hamburger.addTomato();
	    hamburger.order();

	    HealthyBurger healthyBurger = new HealthyBurger("Pork",1);
	    healthyBurger.addBacon();
	    healthyBurger.addLettuce();
	    healthyBurger.addMushrooms();
	    healthyBurger.order();

	    DeluxeBurger deluxeBurger = new DeluxeBurger("Sesame", "Beef");
	    deluxeBurger.order();
    }
}
