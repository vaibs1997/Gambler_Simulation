package com.bridgelabz.gamblersimulation;

public class GamblerSimulation {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambler Simulation");

        int EVERY_DAY_STAKE = 100;
        int EVERY_GAME_BET = 1;

        System.out.println("Starting amount of stake is "+EVERY_DAY_STAKE);
        System.out.println("Amount to bet after every play "+EVERY_GAME_BET);
        int play = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println("Gamblers play:"+play);

        if(play == 1) {
            System.out.println("Player won the first play");
        }
        else {
            System.out.println("Player lost the first play");
        }

    }
}
