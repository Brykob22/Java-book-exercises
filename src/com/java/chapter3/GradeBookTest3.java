package com.java.chapter3;

// Fig. 3.8: GradeBookTest3.java
// Create and manipulate a GradeBook3 object.
import java.util.Scanner; // program uses Scanner class

public class GradeBookTest3 {
	
 // main method begins program execution
 public static void main(String args[]) {
	 
     // create Scanner to obtain input from command window
     Scanner input = new Scanner(System.in);

     // create a GradeBook3 object and assign it to myGradeBook
     GradeBook3 myGradeBook = new GradeBook3();

     // display initial value of courseName
     System.out.printf("Initial course name is: %s\n\n", 
         myGradeBook.getCourseName());
     
     // display initial value of courseName
     System.out.printf("Initial subject name is: %s\n\n", 
         myGradeBook.getSubjectName());

     // prompt for and read course name
     System.out.println("Please enter the course name:");
     String theName = input.nextLine(); // read a line of text
     myGradeBook.setCourseName(theName); // set the course name
     
     System.out.println(); // output a blank line
     // prompt for and read subject name 
     System.out.println("Please enter the subject name:");
     String theNameSubject = input.nextLine(); // read a line of text
     myGradeBook.setSubjectName(theNameSubject); // set the subject name

     System.out.println(); // output a blank line

     // display welcome message after specifying course name
     myGradeBook.displayMessage();
     
    } // end main

} // end class GradeBookTest3 