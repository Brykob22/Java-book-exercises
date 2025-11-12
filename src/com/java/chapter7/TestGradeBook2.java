// Fig. 7.19: TestGradeBook2.java
// Application that creates a GradeBook2 object using a two-dimensional array of grades.

package com.java.chapter7;

public class TestGradeBook2 {

    // main method begins program execution
    public static void main(String args[]) {

        // two-dimensional array of student grades
        int gradesArray[][] = {
            {87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 84},
            {87, 93, 73}
        };

        // create a GradeBook2 object
        GradeBook2 myGradeBook = new GradeBook2(
            "CS101 Introduction to Java Programming", gradesArray);

        // display a welcome message
        myGradeBook.displayMessage();

        // perform various operations on the grades
        myGradeBook.processGrades();

    } // end of main
    
} // end of class TestGradeBook2