package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntegers = getIntegers(5);
//        for(int i=0;i<myIntegers.length;i++){
//            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));
//    }
//
//    public static int[] getIntegers(int number){
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] value = new int[number];
//
//        for(int i=0;i<value.length; i++){
//            value[i] = scanner.nextInt();
//        }
//
//        return value;
//    }
//
//    public static double getAverage(int[] array){
//        int sum = 0;
//        for(int i=0;i<array.length;i++){
//            sum += array[i];
//        }
//
//        return (double) sum/(double)array.length;

        int[] myArray = getIntegers(5);
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);


    }

    public static int[] getIntegers(int number){
        int[] value = new int[number];

        System.out.println("Please type out 5 numbers");

        for(int i=0;i<value.length;i++){
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element " + i + " typed value was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;

        while(flag){
            flag=false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
