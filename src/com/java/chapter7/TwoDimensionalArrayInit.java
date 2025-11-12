// Fig. 7.17: TwoDimensionalArrayInit.java
// Initialization of two-dimensional arrays.

package com.java.chapter7;

public class TwoDimensionalArrayInit {

    // create and print two-dimensional arrays
    public static void main(String args[]) {

        int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int array2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

        System.out.println("Values in array1 by row are");
        printArray(array1); // display array1 by rows

        System.out.println("\nValues in array2 by row are");
        printArray(array2); // display array2 by rows

    } // end of main

    // prints rows and columns of a two-dimensional array
    public static void printArray(int array[][]) {

        // iterate through the rows of the array
        for (int row = 0; row < array.length; row++) {

            // iterate through the columns of the current row
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d ", array[row][column]);

            System.out.println(); // start a new output line

        } // end for

    } // end of method printArray

} // end of class TwoDimensionalArrayInit
