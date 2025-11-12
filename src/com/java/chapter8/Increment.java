// Fig. 8.15: Increment.java
// final instance variable in a class.

package com.java.chapter8;

public class Increment {

    private int total = 0; // the total of all increments
    private final int INCREMENT; // constant variable (not initialized)

    // constructor initializes the final instance variable INCREMENT
    public Increment(int incrementValue) {
        INCREMENT = incrementValue; // initializes the constant variable (once)

    } // end of Increment constructor

    // adds INCREMENT to total
    public void addIncrementToTotal() {
        total += INCREMENT;

    } // end of addIncrementToTotal method

    // returns String representation of Increment object data
    public String toString() {
        return String.format("total = %d", total);

    } // end of toString method

} // end of class Increment