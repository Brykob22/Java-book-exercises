// Fig. 3.10: GradeBook4.java
// GradeBook4 class with a constructor to initialize the course name.

package com.java.chapter3;

public class GradeBook4 {
	
 private String courseName; // course name for this GradeBook4

   // constructor initializes courseName with String object provided as argument
   public GradeBook4(String name) {
	 
       courseName = name; // initialize courseName
   } // end constructor

   // method to set the course name
   public void setCourseName(String name) {
	 
       courseName = name; // store the course name
   } // end method setCourseName

   // method to get the course name
   public String getCourseName() {
	 
       return courseName;
   } // end method getCourseName

   // display a welcome message to the GradeBook4 user
   public void displayMessage() {
	 
       // this statement calls getCourseName to get the
       // course name that this GradeBook4 represents
       System.out.printf("Welcome to the grade book for\n%s!\n",
           getCourseName());
     
  } // end method displayMessage

} // end class GradeBook4 