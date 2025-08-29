package com.java.chapter2;

//Fig. 2.7: Sum.java
//Program that displays the sum of two integers.
import java.util.Scanner; // the program uses the Scanner class

public class Sum 
{
    // the main method begins execution of the Java application
    public static void main(String args[])
    {
        // create Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2
        
        System.out.print("Enter the first integer: "); // prompt
        number1 = input.nextInt(); // read the first number from the user
        
        System.out.print("Enter the second integer: "); // prompt
        number2 = input.nextInt(); // read the second number from the user
        
        sum = number1 + number2; // add the numbers
        System.out.printf("The sum is %d\n", sum); // display the sum
        
    } // end of main method
    
} // end of class Sum 
	