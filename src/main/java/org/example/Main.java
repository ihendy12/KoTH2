package org.example;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        //initiate the other classes
        Hero hero = new Hero();
        Zombie zombie = new Zombie();
        Dragon dragon = new Dragon();
        Werewolf werewolf = new Werewolf();
        // health holding variables
        int zHealth = zombie.getHealth();
        int dHealth = dragon.getHealth();
        int wHealth = werewolf.getHealth();
        int hHealth = hero.getHealthBar();

        //Start of program - asking to name the hero
        System.out.print(hero.getName());

        // get random opponent and wait three seconds for emphasis
        int randomOpponent = (int) Math.floor(Math.random() * 3 + 1);
        System.out.println(randomOpponent);
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(". ");
        TimeUnit.SECONDS.sleep(1);

        //Get random person's turn
        int whoGoesFirst = (int) Math.floor(Math.random() * 2 + 1);



        // Battle Phase
        if (randomOpponent == 1) {
            System.out.println("You will be fighting: The Zombie");
            TimeUnit.SECONDS.sleep(2);
            do {
                //Hero attacks First
                    int base = hero.getBaseAttack();
                    int zombieHealthBar = zHealth - base;
                    System.out.println("\n" + hero.getName() + " hit for " + base + " damage");
                    System.out.println(zombie.getName() + " has " + zombieHealthBar + " health left!");


                    //Zombie attack
                    int zBaseAttack = zombie.getBaseAttack();
                    int heroHealthBar = hHealth - zBaseAttack;
                    System.out.println("\n" + zombie.getName() + " hit for " + zBaseAttack + " damage");
                    System.out.println(hero.getName() + " has " + heroHealthBar + " health left!");

                    if (zHealth > 0){
                        zHealth -= base;
                    }
                    if (hHealth > 0){
                        hHealth -= zBaseAttack;
                    }

            } while (zHealth >= 0 && hHealth >= 0);
            if (hHealth <= 0){
                System.out.println("\nThe mighty hero " + hero.getName() + " was defeated by " + zombie.getName());
            }
            if (zHealth <= 0){
                System.out.println("\n" + zombie.getName() + " was defeated by the mighty hero " + hero.getName());
            }

        } else if (randomOpponent == 2) {
            System.out.println("You will be fighting: The Dragon");
            TimeUnit.SECONDS.sleep(2);
            do {
                int base = hero.getBaseAttack();
                int dragonHealthBar = dHealth - base;
                System.out.println(hero.getName() + " hit for " + base + " damage");
                System.out.println(dragon.getName() + " has " + dragonHealthBar + " health left!");
                if (dHealth > 0){
                    dHealth -= base;
                }
            } while (dHealth >= 0);
            System.out.println("you win!");


        } else if (randomOpponent == 3) {
            System.out.println("You will be fighting: The Werewolf");
            TimeUnit.SECONDS.sleep(2);
            do {
                int base = hero.getBaseAttack();
                int werewolfHealthBar = wHealth - base;
                System.out.println(hero.getName() + " hit for " + base + " damage");
                System.out.println(werewolf.getName() + " has " + werewolfHealthBar + " health left!");
                if (wHealth > 0) {
                    wHealth -= base;
                }
            } while (wHealth >= 0);
            System.out.println("you win!");
                }




            // Display winners


            }

}
