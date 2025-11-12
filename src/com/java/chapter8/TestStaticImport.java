// Fig. 8.14: TestStaticImport.java
// Use of static import to import static methods from the Math class.

package com.java.chapter8;

import static java.lang.Math.*;

public class TestStaticImport {

    public static void main(String args[]) {

        System.out.printf("sqrt( 900.0 ) = %.1f\n", sqrt(900.0));
        System.out.printf("ceil( -9.8 ) = %.1f\n", ceil(-9.8));
        System.out.printf("log( E ) = %.1f\n", log(E));
        System.out.printf("cos( 0.0 ) = %.1f\n", cos(0.0));

    } // end of main

} // end of class TestStaticImport