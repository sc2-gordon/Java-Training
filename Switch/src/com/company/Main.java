package com.company;

public class Main {

    public static void main(String[] args) {
//        printDayOfTheWeek(4);
//        printTwice(8);
//        printNumberInWord(-4);
        System.out.println(getDaysInMonth(1,-2020));

//	    int switchValue = 3;
//	    switch (switchValue) {
//            case 1:
//                System.out.println("Value is 1");
//                break;
//
//            case 2:
//                System.out.println("Value is 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("It's one of three numbers!");
//                break;
//
//            default:
//                System.out.println("It's neither 1 nor 2");
//        }
//
//        char charValue = 'C';
//	    switch(charValue){
//            case 'A': case 'B': case 'C': case 'D': case 'E':
//                System.out.println("The letter " + charValue + " was found!");
//                break;
//
//            default:
//                System.out.println("Not found");
//                break;
//        }
//
//        String month = "JANUARy";
//	    switch (month.toLowerCase()){
//            case "january":
//                System.out.println("Jan");
//                break;
//
//            case "june":
//                System.out.println("Jun");
//                break;
//
//            default:
//                System.out.println("Not sure");
//                break;
//        }

    }

//    public static void printDayOfTheWeek(int day){
//        switch (day){
//            case 0:
//                System.out.println("It's a Monday!");
//                break;
//
//            case 1:
//                System.out.println("It's a Tuesday!");
//                break;
//
//            case 2:
//                System.out.println("It's a Wednesday!");
//                break;
//
//            case 3:
//                System.out.println("It's a Thursday!");
//                break;
//
//            case 4:
//                System.out.println("It's a Friday!");
//                break;
//
//            case 5:
//                System.out.println("It's a Saturday!");
//                break;
//
//            case 6:
//                System.out.println("It's a Sunday!");
//                break;
//
//            default:
//                System.out.println("Invalid Day");
//                break;
//        }
//    }
//
//    public static void printTwice(int day){
//        if(day == 0){
//            System.out.println("It's a Monday!");
//        } else if(day == 1){
//            System.out.println("It's a Tuesday!");
//        } else if(day == 2){
//            System.out.println("It's a Wednesday!");
//        } else if(day == 3){
//            System.out.println("It's a Thursday!");
//        } else if(day == 4){
//            System.out.println("It's a Friday!");
//        } else if(day == 5){
//            System.out.println("It's a Saturday!");
//        } else if(day == 6){
//            System.out.println("It's a Sunday!");
//        } else {
//            System.out.println("Invalid Day");
//        }
//    }

//    public static void printNumberInWord(int number){
//        switch (number){
//            case 0:
//                System.out.println("ZERO");
//                break;
//            case 1:
//                System.out.println("ONE");
//                break;
//            case 2:
//                System.out.println("TWO");
//                break;
//            case 3:
//                System.out.println("THREE");
//                break;
//            case 4:
//                System.out.println("FOUR");
//                break;
//            case 5:
//                System.out.println("FIVE");
//                break;
//            case 6:
//                System.out.println("SIX");
//                break;
//            case 7:
//                System.out.println("SEVEN");
//                break;
//            case 8:
//                System.out.println("EIGHT");
//                break;
//            case 9:
//                System.out.println("NINE");
//                break;
//            default:
//                System.out.println("OTHER");
//                break;
//        }
//    }

    public static boolean isLeapYear(int year){
            if(year >= 1 && year <=9999) {
                if((year % 4)==0 && (year%100) != 0){
                    return true;
                } else if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
    }

    public static int getDaysInMonth(int month, int year){
        if (year<1 || year>9999){
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;
            }
        }

    }
}
