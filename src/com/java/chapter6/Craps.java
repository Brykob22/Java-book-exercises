//Fig. 6.9: Craps.java
//The Craps class simulates the dice game "craps".

package com.java.chapter6;

import java.util.Random;

public class Craps {

    // creates a random number generator to use in the rollDice method
    private Random randomNumbers = new Random();

    // enumeration with constants representing the game state
    private enum Status { CONTINUE, WON, LOST };

    // constants representing common dice rolls
    private final static int SNAKE_EYES = 2;
    private final static int THREE = 3;
    private final static int SEVEN = 7;
    private final static int ELEVEN = 11;
    private final static int BOX_CARS = 12;

    // runs a game of craps
    public void play() {
    	
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON, or LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice) {
        
            case SEVEN: // win with 7 on first roll
            case ELEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case THREE: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so set the point
                gameStatus = Status.CONTINUE; // game not finished
                myPoint = sumOfDice; // save the point
                System.out.printf("The point is %d\n", myPoint);
                break; // optional at the end of switch
                
        }

        // while the game is not finished
        while (gameStatus == Status.CONTINUE) { // not WON or LOST
        	
            sumOfDice = rollDice(); // roll the dice again

            // determine the game status
            if (sumOfDice == myPoint) // win by making the point
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN) // lose by rolling 7 before point
                gameStatus = Status.LOST;
            
        }

        // display message whether player won or lost
        if (gameStatus == Status.WON)
            System.out.println("The player wins");
        else
            System.out.println("The player loses");
        
    }

    // rolls the dice, calculates the sum, and displays the results
    public int rollDice() {
    	
        // choose random values for the dice
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of dice values

        // display the results of this roll
        System.out.printf("The player rolled %d + %d = %d\n",
                          die1, die2, sum);

        return sum; // return the sum of the dice
        
    }
    
} // end of Craps class