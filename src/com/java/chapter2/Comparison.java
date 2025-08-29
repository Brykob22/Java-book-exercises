package com.java.chapter2;

//Fig. 2.15: Comparison.java
//Compare integers using if statements, relational operators
//and equality operators.
import java.util.Scanner; // the program uses the Scanner class

public class Comparison 
{
    // the main method begins execution of the Java application
    public static void main(String args[])
    {
        // create Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print("Enter the first integer: "); // prompt
        number1 = input.nextInt(); // read the first number from the user

        System.out.print("Enter the second integer: "); // prompt
        number2 = input.nextInt(); // read the second number from the user

        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);

    } // end of main method
    
} // end of class Comparison
