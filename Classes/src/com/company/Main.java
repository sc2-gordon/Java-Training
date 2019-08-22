package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());


        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubtractionResult());
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("multiply = " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide = " + simpleCalculator.getDivisionResult());


        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullname = " + person.getFullName());
    }
}
