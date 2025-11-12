// Fig. 10.14: SalariedEmployee2.java
// The SalariedEmployee2 class extends Employee2, which implements Payable.

package com.java.chapter10;

public class SalariedEmployee2 extends Employee2 {

    private double weeklySalary;

    // four-argument constructor
    public SalariedEmployee2(String firstName, String lastName, String ssn,
                             double salary) {
        super(firstName, lastName, ssn); // pass arguments to Employee2 constructor
        setWeeklySalary(salary); // validate and store the salary
        
    } // end of SalariedEmployee2 constructor with four arguments

    // set salary
    public void setWeeklySalary(double salary) {
        weeklySalary = (salary < 0.0) ? 0.0 : salary;
        
    } // end method setWeeklySalary

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
        
    } // end method getWeeklySalary

    // calculate earnings; implements the method from Payable
    // that was abstract in the superclass Employee2
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
        
    } // end method getPaymentAmount

    // return String representation of a SalariedEmployee2 object
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                             super.toString(), "weekly salary", getWeeklySalary());
        
    } // end method toString

} // end class SalariedEmployee2