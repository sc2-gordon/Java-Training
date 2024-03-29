package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player newProfile = new Player("Torna",100,50);
        System.out.println(newProfile.toString());
        saveObject(newProfile);

        newProfile.setHitPoints(56);
        System.out.println(newProfile);
        newProfile.setWeapon("Stormbringer");
        saveObject(newProfile);
        loadObject(newProfile);
        System.out.println(newProfile);

        ISaveable enemy = new Monster("Boogie", 130, 12);
        System.out.println(enemy.toString());
        ((Monster) enemy).setDamage(24);

        saveObject(enemy);
        loadObject(enemy);
        System.out.println(enemy.toString());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit =false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
//        objectToLoad.read(objectToLoad.write());
//        loadedFiles.add(objectToLoad.write().get(0))
//        System.out.println("Loading...\n" +
//                objectToLoad);

    }
}
