// Fig. 10.15: TestPayableInterface.java
// Tests the Payable interface

package com.java.chapter10;

public class TestPayableInterface {

    public static void main(String[] args) {

        // create a Payable array with four elements
        Payable[] payableObjects = new Payable[4];

        // populate the array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee2("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee2("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Invoices and Employees processed polymorphically:\n");

        // process each element in the Payable array generically
        for (Payable currentPayable : payableObjects) {
            // print currentPayable and its appropriate payment amount
            System.out.printf("%s%n%s: $%,.2f%n%n",
                              currentPayable.toString(),
                              "payment due", currentPayable.getPaymentAmount());
            
        } // end of for
        
    } // end of main
    
} // end of class TestPayableInterface