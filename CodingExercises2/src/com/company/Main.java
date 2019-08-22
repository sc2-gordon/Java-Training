package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getDurationString(24,55));
//        System.out.println(area(-1.0,4.0));
//        printYearsAndDays(561600);
//        printEqual(1,2,3);
        System.out.println(isCatPlaying(false,35));
    }

//    public static String getDurationString(int minutes, int seconds){
//        if(minutes<0 || seconds<0 || seconds>59){
//            return "Invalid Value";
//        }
//        int hours = minutes / 60;
//        minutes = minutes % 60;
//        return (hours + "h " + minutes + "m " + seconds + "s");
//    }
//
//    public static String getDurationString(int seconds){
//        if(seconds<0){
//            return "Invalid Value";
//        }
//        int newMinutes = seconds / 60;
//        int newSeconds = seconds % 60;
//        return getDurationString(newMinutes,newSeconds);
//    }

//    public static double area(double radius){
//        if(radius<0){
//            return -1;
//        }
//        return radius * radius * Math.PI;
//    }
//
//    public static double area(double x, double y){
//        if(x<0 || y<0){
//            return -1;
//        }
//        return x * y;
//    }

//    public static void printYearsAndDays(long minutes){
//        if(minutes<0){
//            System.out.println("Invalid Value");
//        } else {
//            long hours = minutes / 60;
//            long days = hours / 24;
//            long years = days / 365;
//            long remainingDays = days % 365;
//
//            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
//        }
//    }

//    public static void printEqual(int x, int y, int z){
//        if(x<0 || y<0 || z<0){
//            System.out.println("Invalid Value");
//        } else if(x == y && y == z){
//            System.out.println("All numbers are equal");
//        } else if(x != y && x != z && y != z){
//            System.out.println("All numbers are different");
//        } else {
//            System.out.println("Neither all are equal or different");
//        }
//    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer == true){
            if(temperature>=25 && temperature<=45){
                return true;
            } else {
                return false;
            }
        } else {
            if(temperature>=25 && temperature<=35){
                return true;
            } else {
                return false;
            }
        }
    }
}
