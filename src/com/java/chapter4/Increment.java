//Fig. 4.16: Increment.java
//Preincrement and postincrement operators.

package com.java.chapter4;

public class Increment {
	
    public static void main( String args[] ) {
	 
        int c;

     // demonstrate postincrement operator
        c = 10; // assign 5 to c
        System.out.println( c ); // prints 5
        System.out.println( c++ ); // prints 5, then postincrements
        System.out.println( c ); // prints 6

        System.out.println(); // skip a line

     // demonstrate preincrement operator
        c = 20; // assign 5 to c
        System.out.println( c ); // prints 5
        System.out.println( ++c +1 ); // preincrements then prints 6
        System.out.println( c ); // prints 6

    } // end main

} // end class Increment