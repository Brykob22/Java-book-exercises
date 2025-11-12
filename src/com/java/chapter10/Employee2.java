// Fig. 10.13: Employee2.java
// The abstract superclass Employee2 implements Payable.

package com.java.chapter10;

public abstract class Employee2 implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // constructor with three arguments
    public Employee2(String name, String lastName, String ssn) {
        firstName = name;
        this.lastName = lastName;
        socialSecurityNumber = ssn;
        
    } // end of Employee2 constructor with three arguments

    // set first name
    public void setFirstName(String name) {
        firstName = name;
        
    } // end of method setFirstName

    // return first name
    public String getFirstName() {
        return firstName;
        
    } // end of method getFirstName

    // set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
        
    } // end of method setLastName

    // return last name
    public String getLastName() {
        return lastName;
        
    } // end of method getLastName

    // set social security number
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn; // should validate
        
    } // end of method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
        
    } // end of method getSocialSecurityNumber

    // return String representation of an Employee2 object
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber());
        
    } // end of method toString

    // Note: We do not implement the method getPaymentAmount from Payable here,
    // so this class must be declared abstract to avoid a compilation error.
} // end of abstract class Employee2