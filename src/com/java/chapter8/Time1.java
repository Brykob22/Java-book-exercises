// Fig. 8.1: Time1.java
// The Time1 class declaration stores time in 24-hour format.

package com.java.chapter8;

public class Time1 {

    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // sets a new time value using universal time; ensures data consistency by
    // setting invalid values to zero
    public void setTime(int h, int m, int s) {

        hour = ((h >= 0 && h < 24) ? h : 0);      // validate hour
        minute = ((m >= 0 && m < 60) ? m : 0);    // validate minute
        second = ((s >= 0 && s < 60) ? s : 0);    // validate second

    } // end of method setTime

    // converts to String object in universal-time format (HH:MM:SS)
    public String toUniversalString() {

        return String.format("%02d:%02d:%02d", hour, minute, second);

    } // end of method toUniversalString

    // converts to String object in standard-time format (H:MM:SS AM or PM)
    public String toString() {

        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));

    } // end of method toString

} // end of class Time1