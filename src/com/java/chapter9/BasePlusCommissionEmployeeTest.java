// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// Test of the BasePlusCommissionEmployee class

package com.java.chapter9;

public class BasePlusCommissionEmployeeTest {

    public static void main(String args[]) {

        // create BasePlusCommissionEmployee object instance
        BasePlusCommissionEmployee employee =
                new BasePlusCommissionEmployee(
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

        employee.setBaseSalary(1000); // set base salary

        System.out.printf("\n%s:\n\n%s\n",
                "Updated employee information obtained by toString",
                employee.toString());

    } // end main

} // end class BasePlusCommissionEmployeeTest