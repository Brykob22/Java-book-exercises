// Fig. 8.8: Employee.java
// Employee class with references to other objects.

package com.java.chapter8;

public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // constructor to initialize first name, last name, birth date, and hire date
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {

        this.firstName     = firstName;
        this.lastName      = lastName;
        this.birthDate     = birthDate;
        this.hireDate      = hireDate;

    } // end of Employee constructor

    // converts Employee to String format
    public String toString() {

        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);

    } // end of method toString

} // end of class Employee