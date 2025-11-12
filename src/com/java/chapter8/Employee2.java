// Fig. 8.12: Employee2.java
// Static variable used to keep track of the
// number of Employee2 objects in memory.

package com.java.chapter8;

public class Employee2 {

    private String firstName;
    private String lastName;
    private static int count = 0; // number of objects in memory

    // initializes Employee2, increments static variable count,
    // and prints a String indicating the constructor was called
    public Employee2(String name, String surname) {
        firstName = name;
        lastName  = surname;

        count++; // increments the static Employee2 count
        System.out.printf("Employee2 constructor: %s %s; count = %d\n",
                firstName, lastName, count);

    } // end of Employee2 constructor

    // decrements the static count when garbage collector
    // calls finalize to remove the object;
    // confirms that finalize was called
    protected void finalize() {
        count--; // decrements the static Employee2 count
        System.out.printf("Employee2 finalizer: %s %s; count = %d\n",
                firstName, lastName, count);

    } // end of finalize method

    // gets the first name
    public String getFirstName() {
        return firstName;

    } // end of getFirstName

    // gets the last name
    public String getLastName() {
        return lastName;

    } // end of getLastName

    // static method to get the value of the static variable count
    public static int getCount() {
        return count;

    } // end of getCount

} // end of class Employee2