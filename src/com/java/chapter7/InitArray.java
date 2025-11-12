// Fig. 7.2: InitArray.java
// Creation of an array

package com.java.chapter7;

public class InitArray {

    public static void main(String args[]) {

        int array[];               // declare an array with the same name
        array = new int[10];       // create space for the array

        System.out.printf("%s%8s\n", "Index", "Value"); // column headers

        // print the value of each array element
        for (int counter = 0; counter < array.length; counter++) 
            System.out.printf("%5d%8d\n", counter, array[counter]);
        
    } // end of main

} // end of class InitArray