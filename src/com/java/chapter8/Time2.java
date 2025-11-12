// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.

package com.java.chapter8;

public class Time2 {

    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time2 no-argument constructor: initializes each instance variable
    // to zero; ensures Time2 objects start in a consistent state
    public Time2() {
        this(0, 0, 0); // invoke Time2 three-argument constructor
    } // end of Time2 no-argument constructor

    // Time2 constructor: hour supplied, minute and second default to 0
    public Time2(int h) {
        this(h, 0, 0); // invoke Time2 three-argument constructor
    } // end of Time2 one-argument constructor

    // Time2 constructor: hour and minute supplied, second defaults to 0
    public Time2(int h, int m) {
        this(h, m, 0); // invoke Time2 three-argument constructor
    } // end of Time2 two-argument constructor

    // Time2 constructor: hour, minute, and second supplied
    public Time2(int h, int m, int s) {
        setTime(h, m, s); // call setTime to validate time
    } // end of Time2 three-argument constructor

    // Time2 constructor: supplied another Time2 object
    public Time2(Time2 time) {
        // invoke Time2 three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    } // end of Time2 constructor with a Time2 object as argument

    // "set" methods
    // sets a new time value using universal time; ensures data consistency
    // by setting invalid values to zero
    public void setTime(int h, int m, int s) {
        setHour(h);   // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
    } // end of method setTime

    // validates and sets the hour
    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    } // end of method setHour

    // validates and sets the minute
    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);
    } // end of method setMinute

    // validates and sets the second
    public void setSecond(int s) {
        second = ((s >= 0 && s < 60) ? s : 0);
    } // end of method setSecond

    // "get" methods
    // gets the hour value
    public int getHour() {
        return hour;
    } // end of method getHour

    // gets the minute value
    public int getMinute() {
        return minute;
    } // end of method getMinute

    // gets the second value
    public int getSecond() {
        return second;
    } // end of method getSecond

    // converts to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } // end of method toUniversalString

    // converts to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
        
    } // end of method toString

} // end of class Time2