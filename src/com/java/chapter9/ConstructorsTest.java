// Fig. 9.17: ConstructorsTest.java
// Demonstrates the order in which superclass and subclass constructors are called

package com.java.chapter9;

public class ConstructorsTest {
	
    public static void main(String[] args) {
    	
        CommissionEmployee4 employee1 = new CommissionEmployee4(
            "Bob", "Lewis", "333-33-3333", 5000, 0.04);

        System.out.println();

        BasePlusCommissionEmployee5 employee2 =
            new BasePlusCommissionEmployee5(
                "Lisa", "Jones", "555-55-5555", 2000, 0.06, 800);

        System.out.println();

        BasePlusCommissionEmployee5 employee3 =
            new BasePlusCommissionEmployee5(
                "Mark", "Sands", "888-88-8888", 8000, 0.15, 2000);
        
    } // end main

} // end class ConstructorsTest