package com.company;

public class Hamburger {
    private String breadRoll;
    private String meat;
    private int price;
    private String burgerName = "The Burger!";
    private boolean lettuce;
    private boolean tomato;
    private boolean pickles;
    private boolean cheese;

    public Hamburger(String breadRoll, String meat, int price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        if(price == 10){
            this.price = 10;
        } else {
            this.price = 5;
        }
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public int getPrice() {
        return price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isPickles() {
        return pickles;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setAddPrice(int price) {
        this.price += price;
    }

    public void viewAddons(){
        System.out.println("We have a wide range of selections: " + "\n" + "Lettuce"
                + "\n" + "Tomato" + "\n" + "Pickles" + "\n" + "Cheese" + "\n" + "Alternatively, for the healthy burger, " +
                "you can choose two additional addons: "+ "\n" + "Mushrooms" + "\n" + "Bacon"  + "\n" +
                "No selection is allowed for the deluxe burger as chips and drinks will be provided.");
    }

    public void viewHamburger(){
        System.out.println("Base burger price starts at $5 with addons being charged accordingly. Your order currently costs $" +
                this.price + "." + "\n" + "Additional addons are priced as follows: Lettuce and Tomato, each for $1 while Pickles and Cheese, each for $2.");

        System.out.println(this.burgerName + "\n" + "Bread: " + this.breadRoll + "\n" + "Meat: " + this.meat + "\n"
                + "Lettuce: " + this.lettuce + "\n"  + "Tomato: " + this.tomato + "\n"  + "Pickles: " + this.pickles + "\n"
                + "Cheese: " + this.cheese + "\n");
    }

    public void addLettuce(){
        this.lettuce = true;
        this.price += 1;
    }

    public void addTomato(){
        this.tomato = true;
        this.price += 1;
    }

    public void addPickles(){
        this.pickles = true;
        this.price += 2;
    }

    public void addCheese(){
        this.cheese = true;
        this.price += 2;
    }

    public void order(){
        System.out.println("Your order has been processed. Your burger costs $" + this.price + ".");
    }
}
