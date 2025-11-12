// Fig. 7.3: InitArray2.java
// Initialization of array elements using an array initializer

package com.java.chapter7;

public class InitArray2 {

    public static void main(String args[]) {

        // the initializer list specifies the value for each element
        int array[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

        System.out.printf("%s%8s\n", "Index", "Value"); // column headers

        // print the value of each array element
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);

    } // end of main

} // end of class InitArray2