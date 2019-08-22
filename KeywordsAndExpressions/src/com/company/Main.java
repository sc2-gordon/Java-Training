package com.company;

public class Main {

    public static void main(String[] args) {

//        int highScore = calcScore(true, 800, 5, 100);
//        System.out.println(highScore);
//
//        highScore = calcScore(true, 10000, 8, 200);
//        System.out.println(highScore);

        displayHighScorePosition("Sean", calculateHighScorePosition(1500));
        displayHighScorePosition("Luke", calculateHighScorePosition(900));
        displayHighScorePosition("Kristy", calculateHighScorePosition(400));
        displayHighScorePosition("Rex", calculateHighScorePosition(50));


    }

//    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//        } else {
//            return -1;
//        }
//
//    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if (score >= 500){
            return 2;
        } else if (score >= 100){
            return 3;
        } else {
            return 4;
        }
    }
}
