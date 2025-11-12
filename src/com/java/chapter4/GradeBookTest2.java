package com.java.chapter4;

//Fig. 4.10: GradeBookTest.java
//Create a GradeBook object and invoke its determineClassAverage method.

public class GradeBookTest2 {
	
   public static void main( String args[] ) {
	   
     // create myGradeBook object of GradeBook and
     // pass course name to constructor
       GradeBook2 myGradeBook = new GradeBook2(
           "CS101 Introduction to Java Programming" );

       myGradeBook.displayMessage(); // display welcome message
       myGradeBook.determineClassAverage(); // find average of grades
 
   } // end main

} // end class GradeBookTest