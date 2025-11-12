// Fig. 9.13: BasePlusCommissionEmployee4.java
// The BasePlusCommissionEmployee4 class inherits from CommissionEmployee3
// and accesses the private data of CommissionEmployee3 through
// the public methods of CommissionEmployee3.
package com.java.chapter9;

public class BasePlusCommissionEmployee4 extends CommissionEmployee3 {
	
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee4(String firstName, String lastName,
                                       String socialSecurityNumber,
                                       double grossSales, double commissionRate,
                                       double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary); // validate and store base salary
    } // end six-argument constructor

    // set base salary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee4
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
        
    } // end method toString
    
} // end class BasePlusCommissionEmployee4