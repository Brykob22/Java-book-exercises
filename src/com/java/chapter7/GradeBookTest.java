// Fig. 7.15: GradeBookTest.java
// Creates a GradeBook object using an array of grades.

package com.java.chapter7;

public class GradeBookTest {

    // main method begins program execution
    public static void main(String args[]) {

        // one-dimensional array of student grades
        int gradesArray[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming", gradesArray);

        myGradeBook.displayMessage();
        myGradeBook.processGrades();

    } // end of main

} // end of class GradeBookTest