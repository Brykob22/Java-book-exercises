// Fig. 8.16: TestIncrement.java
// final variable initialized with a constructor argument.

package com.java.chapter8;

public class TestIncrement {

    public static void main(String args[]) {

        Increment value = new Increment(5);

        System.out.printf("Before incrementing: %s\n\n", value);

        for (int i = 1; i <= 3; i++) {

            value.addIncrementToTotal();
            System.out.printf("After increment %d: %s\n", i, value);

        } // end of for

    } // end of main

} // end of class TestIncrement