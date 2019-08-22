package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    private boolean duplex = false;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplex) {
        if(tonerLevel>0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }

        if(numberOfPagesPrinted>=0) {
            this.numberOfPagesPrinted = numberOfPagesPrinted;
        }

        this.duplex = duplex;
    }

    public void fillUpToner(int fill){
        if(fill >0 && (this.tonerLevel + fill) <= 100){
            this.tonerLevel += fill;
        } else if(fill<=0) {
            System.out.println("Please choose a valid amount to fill. Fill not successful.");
        } else {
            this.tonerLevel = 100;
        }
    }

    public void printPage(int amount){
        if(amount>0 && this.tonerLevel>0) {
            if(duplex){
                this.numberOfPagesPrinted += (amount/2);
                System.out.println("Printing " + (amount/2) + " number of pages!");
            } else {
                this.numberOfPagesPrinted += amount;
                System.out.println("Printing " + amount + " number of pages!");
            }
            for(int i=1;i<=amount;i++){
                this.tonerLevel -= 1;
            }
            System.out.println("Number of pages printed: " + this.numberOfPagesPrinted);
            System.out.println("Toner left: " + this.tonerLevel);
        } else if (this.tonerLevel<=0) {
            System.out.println("Not enough toner. Please top up.");
        } else {
            System.out.println("Please choose a valid number to print. Printing not successful.");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
