package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myArray = readIntegers(5);
//        System.out.println("The lowest integer for the array is " + findMin(myArray));
        int[] myArray = new int[]{54,14,2,36,9};
        System.out.println("This is the array: " + Arrays.toString(myArray));
        reverse(myArray);

    }

//    public static int[] readIntegers(int count){
//        int[] values = new int[count];
//        System.out.println("Please insert the appropriate amount of numbers that you have chosen: ");
//        for(int i=0;i<values.length;i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static int findMin(int[] array){
//        int lowest = array[0];
//        for(int i=0;i<array.length;i++){
//            if(array[i] < lowest){
//                lowest = array[i];
//            }
//        }
//        return lowest;
//    }

    public static void reverse(int[] array){
        int[] reversed = new int[array.length];
        int value = 0;

        for(int i=(array.length-1);i>=0;i--){
            reversed[value] = array[i];
                value++;
        }

        System.out.println("The reverse of the array is: " + Arrays.toString(reversed));
    }
}
