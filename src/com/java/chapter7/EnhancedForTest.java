// Fig. 7.12: EnhancedForTest.java
// Use of the enhanced for statement to sum the total of integers in an array

package com.java.chapter7;

public class EnhancedForTest {

    public static void main(String args[]) {

        int array[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        // add the value of each element to the total
        for (int number : array)
            total += number;

        System.out.printf("Total of the elements in the array: %d\n", total);

    } // end of main

} // end of class EnhancedForTest