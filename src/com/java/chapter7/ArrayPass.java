// Fig. 7.13: ArrayPass.java
// Passing arrays and individual array elements to methods.

package com.java.chapter7;

public class ArrayPass {

    // main creates the array and calls modifyArray and modifyElement
    public static void main(String args[]) {

        int array[] = { 1, 2, 3, 4, 5 };

        System.out.println(
                "Effects of passing a reference to a complete array:\n" +
                "The original array values are:");

        // print original array elements
        for (int value : array)
            System.out.printf(" %d", value);

        modifyArray(array); // pass reference to array
        System.out.println("\n\nThe modified array values are:");

        // print modified array elements
        for (int value : array)
            System.out.printf(" %d", value);

        System.out.printf(
                "\n\nEffects of passing an array element value:\n" +
                "array[3] before modifyElement: %d\n", array[3]);

        modifyElement(array[3]); // attempt to modify array[3]
        System.out.printf(
                "array[3] after modifyElement: %d\n", array[3]);

    } // end of main

    // multiplies each element of an array by 2
    public static void modifyArray(int array2[]) {

        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] *= 2;

    } // end of method modifyArray

    // multiplies the argument by 2
    public static void modifyElement(int element) {

        element *= 2;
        System.out.printf(
                "Value of element in modifyElement: %d\n", element);

    } // end of method modifyElement

} // end of class ArrayPass