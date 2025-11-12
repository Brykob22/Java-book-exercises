// Fig. 7.4: InitArray3.java
// Calculating the values to store in the elements of an array

package com.java.chapter7;

public class InitArray3 {

    public static void main(String args[]) {

        final int ARRAY_LENGTH = 10; // declare constant
        int array[] = new int[ARRAY_LENGTH]; // create the array

        // calculate the value for each element of the array
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s\n", "Index", "Value"); // column headers

        // print the value of each element of the array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);

    } // end of main

} // end of class InitArray3