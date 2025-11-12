// Fig. 9.6: BasePlusCommissionEmployee.java
// The BasePlusCommissionEmployee class represents an employee who
// receives a base salary in addition to commission

package com.java.chapter9;

public class BasePlusCommissionEmployee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;      // total weekly sales
    private double commissionRate;  // commission percentage
    private double baseSalary;      // base weekly salary

    // six-argument constructor
    public BasePlusCommissionEmployee(String first, String last,
                                      String ssn, double sales, double rate, double salary) {

        // the implicit call to the Object constructor occurs here
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);         // validate and store gross sales
        setCommissionRate(rate);      // validate and store commission rate
        setBaseSalary(salary);        // validate and store base salary

    } // end six-argument BasePlusCommissionEmployee constructor

    // set first name
    public void setFirstName(String first) {
        firstName = first;
    } // end method setFirstName

    // return first name
    public String getFirstName() {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName(String last) {
        lastName = last;
    } // end method setLastName

    // return last name
    public String getLastName() {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    // set gross sales amount
    public void setGrossSales(double sales) {
        grossSales = (sales < 0.0) ? 0.0 : sales;
    } // end method setGrossSales

    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    } // end method getGrossSales

    // set commission rate
    public void setCommissionRate(double rate) {
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate() {
        return commissionRate;
    } // end method getCommissionRate

    // set base salary
    public void setBaseSalary(double salary) {
        baseSalary = (salary < 0.0) ? 0.0 : salary;
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate,
                "base salary", baseSalary);
    } // end method toString

} // end class BasePlusCommissionEmployee