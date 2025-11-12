// Fig. 8.4: TestThis.java
// Implicit and explicit use of "this" to refer to the members of an object.

package com.java.chapter8;

public class TestThis {

    public static void main(String args[]) {

        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());

    } // end of main

} // end of class TestThis

// The SimpleTime class demonstrates the "this" reference
class SimpleTime {

    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // If the constructor uses parameter names identical to
    // the instance variable names, the “this” reference
    // is required to distinguish one name from another
    public SimpleTime(int hour, int minute, int second) {

        this.hour = hour;       // set the hour for the "this" object
        this.minute = minute;   // set the minute for the "this" object
        this.second = second;   // set the second for the "this" object

    } // end of SimpleTime constructor

    // Uses both explicit and implicit "this" references to call toUniversalString
    public String buildString() {

        return String.format("%24s: %s\n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());

    } // end of method buildString

    // Converts to a String in universal-time format (HH:MM:SS)
    public String toUniversalString() {

        // "this" is not required here to access instance variables,
        // because the method has no local variables with the same names
        // as the instance variables
        return String.format("%02d:%02d:%02d",
                this.hour, this.minute, this.second);

    } // end of method toUniversalString

} // end of class SimpleTime