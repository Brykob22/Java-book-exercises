// Fig. 6.13: MethodOverloading.java
// Declarations of overloaded methods
package com.java.chapter6;

public class MethodOverloading {

    // tests the overloaded square methods
    public void testOverloadedMethods() {

        System.out.printf("The square of integer 7 is %d\n", square(7));
        System.out.printf("The square of double 7.5 is %f\n", square(7.5));

    } // end of method testOverloadedMethods

    // square method with int argument
    public int square(int intValue) {

        System.out.printf("\nCalled square with int argument: %d\n", intValue);
        return intValue * intValue;

    } // end of square method with int argument

    // square method with double argument
    public double square(double doubleValue) {

        System.out.printf("\nCalled square with double argument: %f\n", doubleValue);
        return doubleValue * doubleValue;

    } // end of square method with double argument

} // end of class MethodOverloading