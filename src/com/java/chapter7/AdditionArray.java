// Fig. 7.5: AdditionArray.java
// Calculation of the addition of the elements of an array

package com.java.chapter7;

public class AdditionArray {

    public static void main(String args[]) {

        int array[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        // add the value of each element to the total
        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];

        System.out.printf("Total of the elements in the array: %d\n", total);

    } // end of main

} // end of class AdditionArray