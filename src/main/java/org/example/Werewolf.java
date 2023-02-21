package org.example;

import java.util.Random;

public class Werewolf {
    private String name = "The Werewolf";
    private int health = 100;
    private int baseAttack;

    //Constructor
    public Werewolf(){
        this.name = name;
        this.health = getHealth();
        this.baseAttack = getBaseAttack();
        System.out.println("You will be fighting: " + name);
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


