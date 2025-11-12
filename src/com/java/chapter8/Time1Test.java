// Fig. 8.2: Time1Test.java
// Time1 object used in an application.

package com.java.chapter8;

public class Time1Test {

    public static void main(String args[]) {

        // create and initialize a Time1 object
        Time1 time = new Time1(); // calls Time1 constructor

        // print string representations of time
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println(); // prints a blank line

        // modify time and print updated time
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println(); // prints a blank line

        // set time with invalid values; print updated time
        time.setTime(99, 99, 99);
        System.out.println("After attempting invalid settings:");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());

    } // end of main

} // end of class Time1Test