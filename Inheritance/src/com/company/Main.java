package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal",1,1,5,5);
//        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
//        dog.eat();
//        dog.walk();
//        dog.run();

//        Vehicle vehicle = new Vehicle();
//        vehicle.setSteering("Left");
//        vehicle.setChangingGears(5);
//        vehicle.setMovingSpeed(25);
//        vehicle.getSteering();
//        vehicle.getChangingGears();
//        vehicle.getMovingSpeed();

//        Circle circle = new Circle(3.75);
//        System.out.println(circle.getRadius());
//        System.out.println(circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55,7.25);
//        System.out.println(cylinder.getRadius());
//        System.out.println(cylinder.getHeight());
//        System.out.println(cylinder.getArea());
//        System.out.println(cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println(cuboid.getWidth());
        System.out.println(cuboid.getLength());
        System.out.println(cuboid.getArea());
        System.out.println(cuboid.getHeight());
        System.out.println(cuboid.getVolume());
    }
}
