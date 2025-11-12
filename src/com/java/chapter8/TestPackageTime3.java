// Fig. 8.19: TestPackageTime3.java
// Using a Time3 object in an application.

package com.java.chapter8;

public class TestPackageTime3 {

    public static void main(String[] args) {

        // create and initialize a Time3 object
        Time3 time = new Time3(); // calls Time3 constructor

        // display string representations of the time
        System.out.print("Initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Initial standard time is: ");
        System.out.println(time.toString());
        System.out.println(); // blank line

        // change time and display updated time
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println(); // blank line

        // set time with invalid values; display updated time
        time.setTime(99, 99, 99);
        System.out.println("After attempting invalid settings:");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());

    } // end of main

} // end of class TestPackageTime3