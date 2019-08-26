package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public void printTeams(){
        Collections.sort(teams);
        for(T t: teams){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

    public void addTeams(T teamName){
        teams.add(teamName);
        System.out.println(teamName.getName() + " has been added to the " + this.name + " league");
    }
}
