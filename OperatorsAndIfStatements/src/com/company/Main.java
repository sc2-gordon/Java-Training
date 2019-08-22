package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1+2;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        result++;
        System.out.println(result);
        result+=1;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 3;
        System.out.println(result);

        boolean isAlien = true;
        if(isAlien == false) {
            System.out.println("It is not an alien");
        }

        int topScore = 80;
        if(topScore > 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Something");
        }

        if(topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or");
        }

        String wasAlien = isAlien ? "True!" : "False!";

        System.out.println(wasAlien);

        double firstNum = 20.00;
        double secondNum = 80.00;
        double sum = (firstNum + secondNum) * 100.00;
        double remainder = sum % 40.00;
        boolean isItTrue = remainder == 0 ? true : false;
        System.out.println(isItTrue);
        if(!isItTrue){
            System.out.println("Get some remainder");
        }
    }
}
