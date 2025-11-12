// Fig. 8.7: Date.java
// Date class declaration.

package com.java.chapter8;

public class Date {

    private int month; // 1-12
    private int day;   // 1-31 based on month
    private int year;  // any year

    // constructor: calls checkMonth to confirm proper value for month;
    // calls checkDay to confirm proper value for day
    public Date(int theMonth, int theDay, int theYear) {

        month = checkMonth(theMonth); // validate month
        year  = theYear;              // could validate year
        day   = checkDay(theDay);     // validate day

        System.out.printf("Date object constructor for date %s\n", this);

    } // end of Date constructor

    // utility method to confirm proper month value
    private int checkMonth(int testMonth) {

        if (testMonth > 0 && testMonth <= 12) // validate month
            return testMonth;
        else { // month is invalid
            System.out.printf("Invalid month (%d) set to 1.\n", testMonth);
            return 1; // keep object in consistent state
        }

    } // end of method checkMonth

    // utility method to confirm proper day value based on month and year
    private int checkDay(int testDay) {

        int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check if day is within range for month
        if (testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;

        // check for leap year
        if (month == 2 && testDay == 29 && (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            return testDay;

        System.out.printf("Invalid day (%d) set to 1.\n", testDay);
        return 1; // keep object in consistent state

    } // end of method checkDay

    // returns a String object of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
        
    } // end of method toString

} // end of class Date