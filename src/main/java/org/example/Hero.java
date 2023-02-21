package org.example;
import java.util.Random;
import java.util.Scanner;

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


    public Hero() {

        this.healthBar = getHealthBar();
        this.baseAttack = getBaseAttack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Heroes name: ");
        this.name = name = scanner.nextLine();
        System.out.println("Congratulations, your heroes name is: " + name);

    }


}
