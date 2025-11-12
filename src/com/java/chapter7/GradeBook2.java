// Fig. 7.18: GradeBook2.java
// GradeBook that uses a two-dimensional array to store grades.

package com.java.chapter7;

public class GradeBook2 {

    private String courseName; // name of the course this GradeBook represents
    private int grades[][];    // two-dimensional array of student grades

    // constructor with two arguments initializes courseName and grades array
    public GradeBook2(String name, int gradesArray[][]) {
        courseName = name;   // initialize courseName
        grades = gradesArray; // store grades
    } // end of GradeBook2 constructor with two arguments

    // method to set the course name
    public void setCourseName(String name) {
        courseName = name; // store course name
    } // end of method setCourseName

    // method to get the course name
    public String getCourseName() {
        return courseName;
    } // end of method getCourseName

    // display a welcome message to the GradeBook user
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    } // end of method displayMessage

    // perform various operations on the data
    public void processGrades() {
        // print the grades array
        printGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("\n%s %d\n%s %d\n\n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // print grade distribution chart for all tests
        printBarChart();
    } // end of method processGrades

    // find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0][0]; // assume first element is the lowest

        // iterate through rows
        for (int studentGrades[] : grades) {
            // iterate through columns
            for (int grade : studentGrades) {
                if (grade < lowGrade)
                    lowGrade = grade; // new minimum
            }
        }
        return lowGrade; // return minimum grade
    } // end of method getMinimum

    // find maximum grade
    public int getMaximum() {
        int highGrade = grades[0][0]; // assume first element is the highest

        // iterate through rows
        for (int studentGrades[] : grades) {
            // iterate through columns
            for (int grade : studentGrades) {
                if (grade > highGrade)
                    highGrade = grade; // new maximum
            }
        }
        return highGrade; // return maximum grade
    } // end of method getMaximum

    // determine average grade for a specific student (row)
    public double getAverage(int studentGrades[]) {
        int total = 0; // initialize total

        // sum grades for the student
        for (int grade : studentGrades)
            total += grade;

        return (double) total / studentGrades.length; // return average
    } // end of method getAverage

    // prints a bar chart displaying overall grade distribution
    public void printBarChart() {
        System.out.println("Overall grade distribution:");

        // store frequency of grades in each range of 10
        int frequency[] = new int[11];

        // increment appropriate frequency for each grade
        for (int studentGrades[] : grades) {
            for (int grade : studentGrades)
                ++frequency[grade / 10];
        }

        // print bar chart for each frequency
        for (int count = 0; count < frequency.length; count++) {
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println(); // new output line
        }
    } // end of method printBarChart

    // print contents of the grades array
    public void printGrades() {
        System.out.println("The grades are:\n");
        System.out.print(" "); // align column headers

        // create a column header for each test
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d ", test + 1);

        System.out.println("Average"); // column header for student average

        // create rows and columns representing the grades array
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int testGrade : grades[student])
                System.out.printf("%8d", testGrade);

            double average = getAverage(grades[student]); // calculate average
            System.out.printf("%9.2f\n", average);
        }
    } // end of method printGrades

} // end of class GradeBook2