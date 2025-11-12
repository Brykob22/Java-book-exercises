// Fig. 7.21: CommandLineArrayInit.java
// Demonstrates using command-line arguments to initialize an array.

package com.java.chapter7;

public class CommandLineArrayInit {

    public static void main(String args[]) {

        // check the number of command-line arguments
        if (args.length != 3)
            System.out.println(
                "Error: Re-enter the complete command, including\n" +
                "the array size, the starting value, and the increment.");
        else {

            // get the array size from the first command-line argument
            int arrayLength = Integer.parseInt(args[0]);
            int array[] = new int[arrayLength]; // create the array

            // get the starting value and increment from the command-line arguments
            int startValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calculate the value for each element of the array
            for (int count = 0; count < array.length; count++)
                array[count] = startValue + increment * count;

            System.out.printf("%s%8s\n", "Index", "Value");

            // display the index and value of each array element
            for (int count = 0; count < array.length; count++)
                System.out.printf("%5d%8d\n", count, array[count]);

        } // end of else

    } // end of main

} // end of class CommandLineArrayInit