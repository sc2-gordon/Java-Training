package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int health;
    private int damage;
    private String weapon;
    private String type;

    public Monster(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weapon = "Claws";
        this.type = "Goblin";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", weapon='" + weapon + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> saveState = new ArrayList<String>();
        saveState.add(0, this.name);
        saveState.add(1, "" + this.health);
        saveState.add(2, "" + this.damage);
        saveState.add(3, this.weapon);
        saveState.add(4, this.type);

        return saveState;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.damage = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
            this.type = savedValues.get(4);
        }
    }
}
