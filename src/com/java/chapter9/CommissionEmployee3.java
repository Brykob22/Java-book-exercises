// Fig. 9.12: CommissionEmployee3.java
// The CommissionEmployee3 class represents a commission employee

package com.java.chapter9;

public class CommissionEmployee3 {
	
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // total weekly sales
    private double commissionRate; // commission percentage

    // five-argument constructor
    public CommissionEmployee3(String firstName, String lastName,
                               String socialSecurityNumber,
                               double grossSales, double commissionRate) {
    	
        // implicit call to Object constructor occurs here
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setGrossSales(grossSales); // validate and store gross sales
        setCommissionRate(commissionRate); // validate and store commission rate
        
    } // end five-argument constructor

    // set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } // end method setFirstName

    // return first name
    public String getFirstName() {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } // end method setLastName

    // return last name
    public String getLastName() {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    // set gross sales
    public void setGrossSales(double grossSales) {
        this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
    } // end method setGrossSales

    // return gross sales
    public double getGrossSales() {
        return grossSales;
    } // end method getGrossSales

    // set commission rate
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = (commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate() {
        return commissionRate;
    } // end method getCommissionRate

    // calculate earnings
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    } // end method earnings

    // return String representation of CommissionEmployee3
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
        
    } // end method toString
    
} // end class CommissionEmployee3