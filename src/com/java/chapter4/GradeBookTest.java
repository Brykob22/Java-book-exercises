//Fig. 4.7: GradeBookTest.java
//Create a GradeBook object and invoke its determineClassAverage method.

package com.java.chapter4;

public class GradeBookTest {
	
  public static void main( String args[] ) {
	 
     // create myGradeBook object of class GradeBook and
     // pass course name to constructor
      GradeBook myGradeBook = new GradeBook(
          "CS101 Introduction to Java Programming" );

      myGradeBook.displayMessage(); // display welcome message
      myGradeBook.determineClassAverage(); // find average of 10 grades

  } // end main

} // end class GradeBookTest