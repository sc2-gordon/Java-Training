package com.company;

public class Vehicle {
    private String steering;
    private int changingGears;
    private int movingSpeed;

    public Vehicle(String steering, int changingGears, int movingSpeed) {
        this.steering = steering;
        this.changingGears = changingGears;
        this.movingSpeed = movingSpeed;
    }

    public Vehicle(){
        this.steering = "Default";
        this.changingGears = 1;
        this.movingSpeed = 15;
    }

    public Vehicle(String steering){
        this.steering = steering;
        this.changingGears = 1;
        this.movingSpeed = 15;
    }

    public Vehicle(int changingGears, int movingSpeed){
        this.steering = "Default";
        this.changingGears = changingGears;
        this.movingSpeed = movingSpeed;
    }

    public void getSteering() {
        if(this.steering == "Left"){
            System.out.println("Turning Left");
        } else if(this.steering == "Right"){
            System.out.println("Turning Right");
        } else {
            System.out.println("Please select either to turn left or right");
        }
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void getChangingGears() {
        switch(this.changingGears){
            case 1:
                System.out.println("Gear shifted to 1");
                break;
            case 2:
                System.out.println("Gear shifted to 2");
                break;
            case 3:
                System.out.println("Gear shifted to 3");
                break;
            case 4:
                System.out.println("Gear shifted to 4");
                break;
            case 5:
                System.out.println("Gear shifted to 5");
                break;
            case 6:
                System.out.println("Gear shifted to Reverse");
                break;
        }
    }

    public void setChangingGears(int changingGears) {
        this.changingGears = changingGears;
    }

    public void getMovingSpeed() {
        if(this.movingSpeed<0){
            System.out.println("You are going in reverse! Please choose a proper speed");
        } else if(this.movingSpeed==0){
            System.out.println("You are not moving. Please choose a proper speed!");
        } else {
            System.out.println("You are moving at " + this.movingSpeed + "mph");
        }
    }

    public void setMovingSpeed(int movingSpeed) {
        this.movingSpeed = movingSpeed;
    }
}
