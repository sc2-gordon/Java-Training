package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // Handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2019-yearOfBirth;
//            if(age>=0 && age<=100){
//                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//            } else{
//                System.out.println("Invalid year of birth");
//            }
//        } else{
//            System.out.println("Unable to parse year of birth");
//        }
//        scanner.close();
//        getSumNumbers();
//        MinMax();
//        inputThenPrintSumAndAverage();
//        System.out.println(getBucketCount(3.26,0.75));
    }

//    public static void getSumNumbers(){
//        Scanner scanner = new Scanner(System.in);
//        int x = 1;
//        int count = 0;
//
//        while(x<11) {
//            System.out.println("Enter number #" + x);
//            boolean hasNextInt = scanner.hasNextInt();
//
//            if (!hasNextInt) {
//                System.out.println("Invalid Number");
//            } else {
//                x += 1;
//                count += scanner.nextInt();
//            }
//            scanner.nextLine();
//        }
//
//        scanner.close();
//
//        System.out.println("Your sum is " + count);
//    }

//    public static void MinMax() {
//        Scanner scanner = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
////        boolean first = true;
//
//        while(true){
//            System.out.println("Enter number:");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if(isAnInt){
//                int number = scanner.nextInt();
//
////                if(first){
////                    first = false;
////                    min = number;
////                    max = number;
////                }
//
//                if(number>max){
//                    max = number;
//                }
//
//                if(number<min){
//                    min = number;
//                }
//            } else {
//                break;
//            }
//
//            scanner.nextLine(); // handle input
//        }
//
//        System.out.println("min = " + min + ", max = " + max);
//        scanner.close();
//    }

//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//
//        int i = 1;
//        long newXX = 0;
//        double XX = 0;
//        double YY = 0;
//        long newYY = 0;
//        boolean checkInt = scanner.hasNextInt();
//        while(true) {
//            if (checkInt) {
//                boolean doubleCheckInt = scanner.hasNextInt();
//                if(!doubleCheckInt){
//                    System.out.println("SUM = " + newXX + " AVG = " + newYY);
//                    break;
//                }
//                XX += scanner.nextInt();
//                YY = (XX/i);
//                i++;
//                newYY = Math.round(YY);
//                newXX = Math.round(XX);
//            } else {
//                System.out.println("SUM = " + newXX + " AVG = " + newYY);
//                break;
//            }
//            scanner.nextLine();
//        }
//        scanner.close();
//    }

//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
//        double wallArea = width*height;
//        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
//            return -1;
//        } else {
//            double currentPaint = extraBuckets*areaPerBucket;
//            wallArea -= currentPaint;
//            double bucketLeft = Math.ceil(wallArea / areaPerBucket);
//            return (int)bucketLeft;
//        }
//    }
//
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        double wallArea = width*height;
//        if(width<=0 || height<=0 || areaPerBucket<=0) {
//            return -1;
//        } else {
//            double bucketLeft = Math.ceil(wallArea / areaPerBucket);
//            return (int)bucketLeft;
//        }
//    }
//
//    public static int getBucketCount(double area, double areaPerBucket){
//        if(area<=0 || areaPerBucket<=0) {
//            return -1;
//        } else {
//            double bucketLeft = Math.ceil(area/areaPerBucket);
//            return (int)bucketLeft;
//        }
//    }
}
