//Fig. 5.9: GradeBook.java
//The GradeBook class uses the switch statement to count grades
//A, B, C, D, and F.

package com.java.chapter5;

import java.util.Scanner; // program uses the Scanner class

public class GradeBook {
	
    private String courseName;   // name of the course represented by this GradeBook
    private int total;           // sum of all grades
    private int gradeCount;      // number of grades entered
    private int aCount;          // count of A grades
    private int bCount;          // count of B grades
    private int cCount;          // count of C grades
    private int dCount;          // count of D grades
    private int fCount;          // count of F grades

    // constructor initializes courseName;
    // int instance variables are automatically initialized to 0 by default
    public GradeBook(String name) {
        courseName = name; // initialize courseName
    }

    // method to set the course name
    public void setCourseName(String name) {
        courseName = name; // store the course name
    }

    // method to get the course name
    public String getCourseName() {
        return courseName;
    }

    // display a welcome message to the GradeBook user
    public void displayMessage() {
        // getCourseName gets the course name
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    }

    // input an arbitrary number of grades from the user
    public void inputGrades() {
    	
        Scanner input = new Scanner(System.in);

        int grade; // grade entered by the user

        System.out.printf("%s\n%s\n %s\n %s\n",
                "Enter integer grades in the range 0 to 100.",
                "Enter the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        // loop until the user enters the end-of-file indicator
        while (input.hasNext()) {
            grade = input.nextInt(); // read grade
            total += grade;          // add grade to total
            ++gradeCount;            // increment number of grades entered

            // call method to increment the appropriate letter grade counter
            incrementLetterGradeCounter(grade);
            
        } // end while
        
    } // end method inputGrades

    // add 1 to the appropriate counter for the specified grade
    public void incrementLetterGradeCounter(int grade) {
    	
        // determine which grade was entered
        switch (grade / 10) {
            case 9: // grade between 90
            case 10: // and 100
                ++aCount; // increment A count
                break; // necessary to exit switch

            case 8: // grade between 80 and 89
                ++bCount; // increment B count
                break; // exit switch

            case 7: // grade between 70 and 79
                ++cCount; // increment C count
                break; // exit switch

            case 6: // grade between 60 and 69
                ++dCount; // increment D count
                break; // exit switch
 
            default: // grade is less than 60
                ++fCount; // increment F count
                break; // optional; switch exits anyway
                
        } // end switch
        
     } // end method incrementLetterGradeCounter

    // display a report based on the grades entered by the user
    public void displayGradeReport() {
    	
        System.out.println("\nGrade Report:");

        // if the user entered at least one grade...
        if (gradeCount != 0) {
            // calculate the average of all grades entered
            double average = (double) total / gradeCount;

            // print summary of results
            System.out.printf("The total of the %d grades entered is %d\n",
                    gradeCount, total);
            System.out.printf("The class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade:",
                    "A: ", aCount,  // display number of A grades
                    "B: ", bCount,  // display number of B grades
                    "C: ", cCount,  // display number of C grades
                    "D: ", dCount,  // display number of D grades
                    "F: ", fCount); // display number of F grades
            
     } // end if
        
        else // no grades were entered, so print the appropriate message
            System.out.println("No grades were entered");
        
    } // end method displayGradeReport 
    
} // end class GradeBook
