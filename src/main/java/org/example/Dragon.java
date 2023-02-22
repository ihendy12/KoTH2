package org.example;

import java.util.Random;

public class Dragon {
    private String name = "The Dragon";
    private int health = 150;
    private int baseAttack;

    //Constructor
    public Dragon(){
        this.name = name;
        this.health = getHealth();
        this.baseAttack = getBaseAttack();

    }

    Random rand = new Random();

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

    public int getBaseAttack() {
        int upperBound = 5;
        baseAttack = rand.nextInt(upperBound);
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }
}


