// Fig. 10.9: PayrollSystemTest.java
// Test program for the Employee hierarchy.

package com.java.chapter10;

public class PayrollSystemTest {

    public static void main(String[] args) {
        
        // create subclass objects
        SalariedEmployee salariedEmployee =
            new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        
        HourlyEmployee hourlyEmployee =
            new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        
        CommissionEmployee commissionEmployee =
            new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        
        BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        // display each Employee individually
        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n",
            salariedEmployee, "earnings", salariedEmployee.earnings());
        
        System.out.printf("%s\n%s: $%,.2f\n\n",
            hourlyEmployee, "earnings", hourlyEmployee.earnings());
        
        System.out.printf("%s\n%s: $%,.2f\n\n",
            commissionEmployee, "earnings", commissionEmployee.earnings());
        
        System.out.printf("%s\n%s: $%,.2f\n\n",
            basePlusCommissionEmployee,
            "earnings", basePlusCommissionEmployee.earnings());

        // create an Employee array of four elements
        Employee[] employees = new Employee[4];

        // initialize array with Employee objects
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically:\n");

        // process each element in the employees array polymorphically
        for (Employee currentEmployee : employees) {
            
            System.out.println(currentEmployee); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                
                // downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee =
                    (BasePlusCommissionEmployee) currentEmployee;

                double oldBaseSalary = employee.getBaseSalary();
                
                // increase base salary by 10%
                employee.setBaseSalary(1.10 * oldBaseSalary);
                
                System.out.printf(
                    "new base salary with 10%% increase is: $%,.2f\n",
                    employee.getBaseSalary());
                
            } // end if

            // display current employee’s earnings
            System.out.printf("earnings: $%,.2f\n\n", currentEmployee.earnings());
            
        } // end for

        // get type name of each object in the employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s\n",
                j, employees[j].getClass().getName());
            
        } // end for
        
    } // end main
    
} // end class PayrollSystemTest