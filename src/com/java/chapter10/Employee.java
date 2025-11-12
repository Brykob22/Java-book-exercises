package com.java.chapter10;

public abstract class Employee {
	
	private String firstName; 
	private String lastName;
	private String socialSecurityNumber;
	
	// three-argument constructor
	public Employee(String name, String last, String ssn) {
		
		firstName = name;
		lastName = last;
		socialSecurityNumber = ssn;
		
	} // end three-argument Employee constructor
	
	// set first name
	public void setfirstName(String name) {
		firstName = name;
		
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

    // return String representation of Employee object
    @Override
    public String toString() {
    	
        return String.format("%s %s%nsocial security number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber());
        
    } // end method toString

    // abstract method overridden by subclasses
    public abstract double earnings(); // no implementation here
    
} // end abstract class Employee
	
