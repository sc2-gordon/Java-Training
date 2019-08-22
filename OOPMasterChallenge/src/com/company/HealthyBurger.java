package com.company;

public class HealthyBurger extends Hamburger {
    private boolean mushrooms;
    private boolean bacon;


    public HealthyBurger(String meat, int price) {
        super("Brown Rye", meat, price);
    }

    public void addMushrooms(){
        this.mushrooms = true;
        setAddPrice(3);
    }

    public void addBacon(){
        this.bacon = true;
        setAddPrice(3);
    }

    @Override
    public void viewHamburger() {
        super.viewHamburger();
        System.out.println("Base burger price starts at $5 with addons being charged accordingly. Your order currently costs $" +
                getPrice() + "." + "\n" + "Additional addons are priced as follows: Lettuce and Tomato, each for $1 while Pickles and Cheese, each for $2. " +
                "For the healthy burger, you can also get mushrooms and bacon, each for $3.");

        System.out.println(getBurgerName() + "\n" + "Bread: " + getBreadRoll() + "\n" + "Meat: " + getMeat() + "\n"
                + "Lettuce: " + isLettuce() + "\n"  + "Tomato: " + isTomato() + "\n"  + "Pickles: " + isPickles() + "\n"
                + "Cheese: " + isCheese() + "\n"  + "Mushrooms: " + this.mushrooms + "\n"  + "Bacon: " + this.bacon);
    }
}
