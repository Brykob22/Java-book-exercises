//Fig. 6.3: MaximumFinder.java
//Method max, declared by the programmer.

package com.java.chapter6;

import java.util.Scanner;

public class MaximumFinder {

    // gets three floating-point values and determines the maximum value
    public void determineMaximum() {
    	
        // creates Scanner object to input data from the command window
        Scanner input = new Scanner(System.in);

        // asks for and receives three floating-point values as input
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // reads the first double value
        double number2 = input.nextDouble(); // reads the second double value
        double number3 = input.nextDouble(); // reads the third double value

        // determines the maximum value
        double result = maximum(number1, number2, number3);

        // displays the maximum value
        System.out.println("The maximum is: " + result);
        
    } // end of method determineMaximum

    // returns the maximum of its three double parameters
    public double maximum(double x, double y, double z) {
    	
        double maximumValue = x; // assume x is the largest to start

        // determines if y is greater than maximumValue
        if (y > maximumValue)
            maximumValue = y;

        // determines if z is greater than maximumValue
        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
        
    } // end of method maximum
    
} // end of class MaximumFinder