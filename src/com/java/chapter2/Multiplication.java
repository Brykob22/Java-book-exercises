// Example 2.6: Product.java
// Calculate the product of three integers.

package com.java.chapter2;

import java.util.Scanner; // the program uses Scanner

public class Multiplication {
	
    public static void main(String args[]) {
    	
        // create Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int x; // first number entered by user
        int y; // second number entered by user
        int z; // third number entered by user
        int result; // product of the numbers

        System.out.print("Enter the first integer: "); // input prompt
        x = input.nextInt(); // read first integer

        System.out.print("Enter the second integer: "); // input prompt
        y = input.nextInt(); // read second integer

        System.out.print("Enter the third integer: "); // input prompt
        z = input.nextInt(); // read third integer

        result = x * y * z; // calculate product of the numbers

        System.out.printf("The product is %d\n", result);

    } // end of main method
    
} // end of class Product