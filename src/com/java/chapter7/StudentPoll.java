// Fig. 7.8: StudentPoll.java
// Survey analysis program.

package com.java.chapter7;

public class StudentPoll {

    public static void main(String args[]) {

        // array of survey responses
        int responses[] = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
                10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6,
                4, 8, 6, 8, 10 };

        int frequency[] = new int[11]; // array of frequency counters

        // for each response, select the element in responses and use that value
        // as the frequency index to determine which element to increment
        for (int answer = 0; answer < responses.length; answer++)
            ++frequency[responses[answer]];

        System.out.printf("%s%10s\n", "Rating", "Frequency");

        // print the value of each array element
        for (int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%6d%10d\n", rating, frequency[rating]);

    } // end of main

} // end of class StudentPoll