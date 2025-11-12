package com.java.chapter6;

//Fig. 6.7: RandomIntegers.java
//Shifted and scaled random integers.

import java.util.Random; // the program uses the Random class

public class RandomIntegers {
	
    public static void main(String args[]) {

        Random randomNumbers = new Random(); // random number generator
        int face; // stores each generated random integer

        // iterate 20 times
        for (int counter = 1; counter <= 20; counter++) {
        	
            // choose a random integer from 1 to 6 (like rolling a die)
            face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face); // display the generated value

            // if counter is divisible by 5, start a new output line
            if (counter % 5 == 0)
                System.out.println();
        } // end for
        
    } // end main
    
} // end class RandomIntegers