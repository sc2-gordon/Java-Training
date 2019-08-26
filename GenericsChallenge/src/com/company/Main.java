package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// ArrayList<team> teams;
        // Collections.sort(teams);
        FootballPlayer tim = new FootballPlayer("Tim");
        FootballPlayer allen = new FootballPlayer("Allen");
        FootballPlayer percy = new FootballPlayer("Percy");
        FootballPlayer george = new FootballPlayer("George");

        BaseballPlayer peter = new BaseballPlayer("Peter");

        HockeyPlayer joe = new HockeyPlayer("Joe");

        Team<FootballPlayer> polar = new Team<>("Polar");
        Team<FootballPlayer> caps = new Team<>("Caps");
        Team<BaseballPlayer> ice = new Team<>("Ice");
        Team<HockeyPlayer> reverie = new Team<>("Reverie");

        polar.addPlayer(tim);
        polar.addPlayer(allen);
        polar.addPlayer(percy);
        caps.addPlayer(george);
        ice.addPlayer(peter);
        reverie.addPlayer(joe);
        caps.matchResult(polar,3,1);

        League<Team<FootballPlayer>> english = new League<>("English");
        english.addTeams(polar);
        english.addTeams(caps);
        english.printTeams();
    }
}
