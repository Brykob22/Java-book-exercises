// Fig. 9.11: BasePlusCommissionEmployeeTest3.java
// Test of the BasePlusCommissionEmployee3 class

package com.java.chapter9;

public class BasePlusCommissionEmployeeTest3 {

    public static void main(String args[]) {

        // create an instance of BasePlusCommissionEmployee3
        BasePlusCommissionEmployee3 employee =
                new BasePlusCommissionEmployee3(
                        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // get data for base-salaried commission employee
        System.out.println(
                "Employee information obtained by get methods:\n");

        System.out.printf("%s %s\n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales are",
                employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is",
                employee.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is",
                employee.getBaseSalary());

        // set base salary
        employee.setBaseSalary(1000);

        // display updated employee information
        System.out.printf("\n%s:\n\n%s\n",
                "Updated employee information obtained by toString",
                employee.toString());

    } // end main

} // end class BasePlusCommissionEmployeeTest3