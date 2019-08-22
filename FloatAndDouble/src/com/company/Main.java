package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue =5F/3F;
        double myDoubleValue = 5D/3D;
        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("MyFloatValue: " + myFloatValue);
        System.out.println("MyDoubleValue: " + myDoubleValue);

        double pound = 200d;
        double kilo = pound * 0.45359237d;
        System.out.println("The correct conversion of " + pound + "lbs is " + kilo + "kg");
    }
}
