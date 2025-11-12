// Fig. 7.14: GradeBook.java
// Grade book that uses an array to store test grades.

package com.java.chapter7;

public class GradeBook {

    private String courseName; // name of the course this GradeBook represents
    private int grades[]; // array of student grades

    // two-argument constructor initializes courseName and the grades array
    public GradeBook(String name, int gradesArray[]) {

        courseName = name; // initialize courseName
        grades = gradesArray; // store grades

    } // end of GradeBook constructor with two arguments

    // method to set the course name
    public void setCourseName(String name) {

        courseName = name; // store course name

    } // end of method setCourseName

    // method to get the course name
    public String getCourseName() {

        return courseName;

    } // end of method getCourseName

    // display a welcome message to GradeBook user
    public void displayMessage() {

        // getCourseName retrieves the course name
        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                getCourseName());

    } // end of method displayMessage

    // perform various operations on the data
    public void processGrades() {

        // print the grades array
        printGrades();

        // call getAverage to calculate the average grade
        System.out.printf("\nClass average is %.2f\n", getAverage());

        // call getMinimum and getMaximum
        System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n",
                getMinimum(), getMaximum());

        // call printBarChart to print grade distribution chart
        printBarChart();

    } // end of method processGrades

    // determine minimum grade
    public int getMinimum() {

        int lowGrade = grades[0]; // assume grades[0] is the lowest

        // iterate through the grades array
        for (int grade : grades) {

            // if grade is less than lowGrade, assign it to lowGrade
            if (grade < lowGrade)
                lowGrade = grade; // new lowest grade

        } // end for

        return lowGrade; // return the lowest grade

    } // end of method getMinimum

    // determine maximum grade
    public int getMaximum() {

        int highGrade = grades[0]; // assume grades[0] is the highest

        // iterate through the grades array
        for (int grade : grades) {

            // if grade is greater than highGrade, assign it to highGrade
            if (grade > highGrade)
                highGrade = grade; // new highest grade

        } // end for

        return highGrade; // return the highest grade

    } // end of method getMaximum

    // determine the average grade of the test
    public double getAverage() {

        int total = 0; // initialize total

        // sum grades for all students
        for (int grade : grades)
            total += grade;

        // return average of grades
        return (double) total / grades.length;

    } // end of method getAverage

    // print bar chart displaying grade distribution
    public void printBarChart() {

        System.out.println("Grade distribution:");

        // store frequency of grades in each range of 10 grades
        int frequency[] = new int[11];

        // for each grade, increment appropriate frequency
        for (int grade : grades)
            ++frequency[grade / 10];

        // for each grade frequency, print a bar in the chart
        for (int count = 0; count < frequency.length; count++) {

            // print bar labels ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        count * 10, count * 10 + 9);

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println(); // start a new output line

        } // end for

    } // end of method printBarChart

    // print the contents of the grades array
    public void printGrades() {

        System.out.println("The grades are:\n");

        // print each student's grade
        for (int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d\n",
                    student + 1, grades[student]);

    } // end of method printGrades

} // end of class GradeBook