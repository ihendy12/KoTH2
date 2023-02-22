package org.example;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        Zombie zombie = new Zombie();
        Dragon dragon = new Dragon();
        Werewolf werewolf = new Werewolf();

        int zHealth = zombie.getHealth();
        int dHealth = dragon.getHealth();
        int wHealth = werewolf.getHealth();


        System.out.print(hero.getName());
        int randomOpponent = (int) Math.floor(Math.random() * 3 + 1);
        System.out.println(randomOpponent);
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(". ");
        TimeUnit.SECONDS.sleep(1);


        if (randomOpponent == 1) {
            System.out.println("You will be fighting: The Zombie");
            TimeUnit.SECONDS.sleep(2);
            do {
                    int base = hero.getBaseAttack();
                    int zombieHealthBar = zHealth - base;
                    System.out.println(hero.getName() + " hit for " + base + " damage");
                    System.out.println(zombie.getName() + " has " + zombieHealthBar + " health left!");
                    if (zHealth > 0){
                        zHealth -= base;
                    } else if (zHealth <= 0){

                        System.out.println("you win!");
                    }
                    else {
                        System.out.println("you win!");
                    }
            } while (zHealth >= 0);

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
                if (wHealth > 0){
                    wHealth -= base;
                } else if (wHealth <= 0){

                    System.out.println("you win!");
                }
                else {
                    System.out.println("you win!");
                }
            } while (wHealth >= 0);

                }




            // minus and return the health of the enemy


            }

}
