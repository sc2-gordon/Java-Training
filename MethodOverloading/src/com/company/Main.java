package com.company;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Sean", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
          System.out.println(calcFeetAndInchesToCentimeters(5,7));
    }

//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score){
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(){
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || inches<0 || inches >12){
            return -1;
        }
        double newInches = feet * 12;
        double value = (newInches + inches) * 2.54;
        return value;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        double newFeet = inches / 12;
        return calcFeetAndInchesToCentimeters(newFeet,0);
    }

}
