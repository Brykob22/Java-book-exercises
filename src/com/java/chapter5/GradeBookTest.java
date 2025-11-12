//Fig. 5.10: GradeBookTest.java
//Creates a GradeBook object, inputs grades, and displays a report.

package com.java.chapter5;

public class GradeBookTest {
	
    public static void main(String args[]) {

        // create a GradeBook object called myGradeBook and
        // pass the course name to the constructor
        GradeBook myGradeBook = new GradeBook(
            "CS101 Introduction to Java Programming"
        );

        myGradeBook.displayMessage();      // display a welcome message
        myGradeBook.inputGrades();         // read grades from user
        myGradeBook.displayGradeReport();  // display report based on entered grades
        
    } // end main
    
} // end class GradeBookTest