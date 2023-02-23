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

                    // logic to check hero and zombie have health left
                    if (zHealth > 0){
                        zHealth -= base;
                    }
                    if (hHealth > 0){
                        hHealth -= zBaseAttack;
                    }

            } while (zHealth >= 0 && hHealth >= 0);
            //Display winners

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
                //Hero Attacks
                int base = hero.getBaseAttack();
                int dragonHealthBar = dHealth - base;
                System.out.println(hero.getName() + " hit for " + base + " damage");
                System.out.println(dragon.getName() + " has " + dragonHealthBar + " health left!");

                //Dragon attack
                int dBaseAttack = dragon.getBaseAttack();
                int heroHealthBar = hHealth - dBaseAttack;
                System.out.println("\n" + dragon.getName() + " hit for " + dBaseAttack + " damage");
                System.out.println(hero.getName() + " has " + heroHealthBar + " health left!");

                // logic to check hero and dragon have health left
                if (dHealth > 0){
                    dHealth -= base;
                }
                if (hHealth > 0){
                    hHealth -= dBaseAttack;
                }

            } while (dHealth >= 0 && hHealth >= 0);
            //Display winner between dragon and hero
            if (hHealth <= 0){
                System.out.println("\nThe mighty hero " + hero.getName() + " was defeated by " + dragon.getName());
            }

            if (dHealth <= 0){
                System.out.println("\n" + dragon.getName() + " was defeated by the mighty hero " + hero.getName());
            }


        } else if (randomOpponent == 3) {
            System.out.println("You will be fighting: The Werewolf");
            TimeUnit.SECONDS.sleep(2);
            do {

                //Hero Attack
                int base = hero.getBaseAttack();
                int werewolfHealthBar = wHealth - base;
                System.out.println(hero.getName() + " hit for " + base + " damage");
                System.out.println(werewolf.getName() + " has " + werewolfHealthBar + " health left!");

                //Werewolf attack

                int wBaseAttack = werewolf.getBaseAttack();
                int heroHealthBar = hHealth - wBaseAttack;
                System.out.println("\n" + werewolf.getName() + " hit for " + wBaseAttack + " damage");
                System.out.println(hero.getName() + " has " + heroHealthBar + " health left!");

                if (wHealth > 0) {
                    wHealth -= base;
                }
                if (hHealth > 0) {
                    hHealth -= wBaseAttack;
                }
            } while (wHealth >= 0 && hHealth >= 0);
            //Display winner

            if (hHealth <= 0){
                System.out.println("\nThe mighty hero " + hero.getName() + " was defeated by " + werewolf.getName());
            }

            if (wHealth <= 0){
                System.out.println("\n" + werewolf.getName() + " was defeated by the mighty hero " + hero.getName());
            }


                }






            }

}
