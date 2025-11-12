//Fig. 6.8: RollDie.java
//Roll a six-sided die 6000 times.

package com.java.chapter6;

import java.util.Random;

public class RollDie {
	
    public static void main(String args[]) {

        Random randomNumbers = new Random(); // creates a random number generator

        // frequency counters for each die face
        int frequency1 = 0; // counts how many times 1 was rolled
        int frequency2 = 0; // counts how many times 2 was rolled
        int frequency3 = 0; // counts how many times 3 was rolled
        int frequency4 = 0; // counts how many times 4 was rolled
        int frequency5 = 0; // counts how many times 5 was rolled
        int frequency6 = 0; // counts how many times 6 was rolled

        int face; // stores the value of the most recent die roll

        // loop that simulates rolling the die 6000 times
        for (int roll = 1; roll <= 6000; roll++) {
        	
            face = 1 + randomNumbers.nextInt(6); // generates a random number from 1 to 6

            // use switch to increment the counter for the corresponding face
            switch (face) {
            
                case 1: ++frequency1; break; // if 1 is rolled, increment frequency1
                case 2: ++frequency2; break; // if 2 is rolled, increment frequency2
                case 3: ++frequency3; break; // if 3 is rolled, increment frequency3
                case 4: ++frequency4; break; // if 4 is rolled, increment frequency4
                case 5: ++frequency5; break; // if 5 is rolled, increment frequency5
                case 6: ++frequency6; break; // if 6 is rolled, increment frequency6
                
            }
            
        }

        // display results
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                       frequency1, frequency2, frequency3, frequency4,
                       frequency5, frequency6);
    }
    
}