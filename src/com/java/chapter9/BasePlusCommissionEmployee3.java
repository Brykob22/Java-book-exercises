// Fig. 9.10: BasePlusCommissionEmployee3.java
// BasePlusCommissionEmployee3 inherits from CommissionEmployee2 and has
// access to the protected members of CommissionEmployee2

package com.java.chapter9;

public class BasePlusCommissionEmployee3 extends CommissionEmployee2 {
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee3(String first, String last,
                                       String ssn, double sales,
                                       double rate, double salary) {
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary); // validate and store base salary
    } // end six-argument constructor

    // set base salary
    public void setBaseSalary(double salary) {
        baseSalary = (salary < 0.0) ? 0.0 : salary;
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings
    @Override
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee3
    @Override
    public String toString() {
        return String.format(
            "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
            "commission employee with base salary", firstName, lastName,
            "social security number", socialSecurityNumber,
            "gross sales", grossSales,
            "commission rate", commissionRate,
            "base salary", baseSalary
        );
    } // end method toString
} // end class BasePlusCommissionEmployee3