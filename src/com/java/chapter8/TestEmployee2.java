// Fig. 8.13: TestEmployee2.java
// Demonstration of static members.

package com.java.chapter8;

public class TestEmployee2 {

    public static void main(String args[]) {

        // shows that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d\n",
                Employee2.getCount());

        // creates two Employees; count should be 2
        Employee2 e1 = new Employee2("Susan", "Baker");
        Employee2 e2 = new Employee2("Bob", "Blue");

        // shows that count is 2 after creating two Employees
        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee2.getCount(): %d\n",
                Employee2.getCount());

        // gets the names of the Employees
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());

        // in this example, there is only one reference to each Employee,
        // so the following two statements make the JVM
        // mark each Employee object for garbage collection
        e1 = null;
        e2 = null;

        System.gc(); // requests garbage collection now
        // shows Employee count after calling garbage collector;
        // the count shown may be 0, 1, or 2 depending on whether
        // the garbage collector runs immediately and the number
        // of Employee2 objects collected
        System.out.printf("\nEmployees after System.gc(): %d\n",
                Employee2.getCount());

    } // end of main

} // end of class TestEmployee2