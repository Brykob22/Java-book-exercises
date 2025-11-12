// Fig. 10.1: PolymorphismTest.java
// Assigning superclass and subclass references
// to superclass and subclass variables.

package com.java.chapter10;

import com.java.chapter9.CommissionEmployee3;
import com.java.chapter9.BasePlusCommissionEmployee4;

public class PolymorphismTest {

    public static void main(String[] args) {
        
        // assign superclass reference to superclass variable
        CommissionEmployee3 commissionEmployee = new CommissionEmployee3(
            "Sue", "Jones", "222-22-2222", 10000, .06);

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee4 basePlusEmployee = new BasePlusCommissionEmployee4(
            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // call toString on a superclass object using a superclass variable
        System.out.printf("%s %s:%n%n%s%n%n",
            "Call to CommissionEmployee3’s toString with superclass reference",
            "to a superclass object", commissionEmployee.toString());

        // call toString on a subclass object using a subclass variable
        System.out.printf("%s %s:%n%n%s%n%n",
            "Call to BasePlusCommissionEmployee4’s toString with subclass reference",
            "to a subclass object", basePlusEmployee.toString());

        // call toString on a subclass object using a superclass variable
        CommissionEmployee3 commissionEmployee2 = basePlusEmployee;
        System.out.printf("%s %s:%n%n%s%n",
            "Call to BasePlusCommissionEmployee4’s toString with superclass reference",
            "to a subclass object", commissionEmployee2.toString());
        
    } // end main
    
} // end class PolymorphismTest