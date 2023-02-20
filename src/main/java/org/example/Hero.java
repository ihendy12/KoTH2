package org.example;
import java.util.Random;

public class Hero {

    //Attributes
    private String name;
    private int healthBar = 100;
    private int baseAttack;


    //invoking Random

    Random rand = new Random();
    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }

    public int getBaseAttack() {
        int upperBound = 25;
        baseAttack = rand.nextInt(upperBound);
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    //Constructors


    public Hero(String name) {
        this.name = name;
        this.healthBar = getHealthBar();
        this.baseAttack = getBaseAttack();
    }
}
