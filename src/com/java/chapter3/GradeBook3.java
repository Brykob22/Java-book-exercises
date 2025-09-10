package com.java.chapter3;

// Fig. 3.7: GradeBook3.java
// GradeBook3 class that contains an instance variable courseName
// and methods to set and get its value.

public class GradeBook3 {
	
   private String courseName; // course name for this GradeBook3
   private String subjectName; // subject for this GradeBook
 
   // method to set the course name
   public void setCourseName(String name) {
	 
       courseName = name; // store the course name
   } // end method setCourseName

   // method to get the course name
   public String getCourseName() {
	 
       return courseName;
   } // end method getCourseName
 
   //method to set the subject
   public void setSubjectName(String name) {
	 
  	   subjectName = name;
   }
   //method to set the subject 
   public String getSubjectName(){
	 
	   return subjectName; 
   }// end method getSubject 

   // display a welcome message to the GradeBook3 user
   public void displayMessage() {
	 
       // this statement calls getCourseName to get the
       // course name that this GradeBook3 represents
       System.out.printf("Welcome to the grade book for\n%s!\nOf the subject\n%s!\n",
           getCourseName(), getSubjectName());
     
  } // end method displayMessage

} // end class GradeBook3 