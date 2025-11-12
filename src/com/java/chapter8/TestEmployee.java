// Fig. 8.9: TestEmployee.java
// Demonstration of composition.

package com.java.chapter8;

public class TestEmployee {

    public static void main(String args[]) {

        Date birthDate      = new Date(7, 24, 1949);
        Date hireDate       = new Date(3, 12, 1988);
        Employee employee   = new Employee("Bob", "Blue", birthDate, hireDate);

        System.out.println(employee);

    } // end of main

} // end of class TestEmployee