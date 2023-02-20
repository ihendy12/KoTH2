package org.example;

import java.util.Random;

public class Zombie {
    private String name = "The Zombie";
    private int health = 50;
    private int baseAttack;

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
