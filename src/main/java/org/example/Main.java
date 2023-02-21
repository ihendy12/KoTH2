package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.print(hero.getName()+ ", ");
        int randomOpponent = (int) Math.floor(Math.random() * 3 + 1);


        if (randomOpponent == 1){
            Zombie zombie = new Zombie();
        } else if (randomOpponent == 2 ){
            Dragon dragon = new Dragon();
        } else if (randomOpponent == 3){
            Werewolf werewolf = new Werewolf();
        }







    }


}