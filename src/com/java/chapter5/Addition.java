//Fig. 5.5: Addition.java
//Summing integers with the for statement.

package com.java.chapter5;

public class Addition {
	
   public static void main( String args[] ) {
	 
       int total = 0; // initialize total

       // total even integers from 2 through 20
       for ( int number = 2; number <= 20; number += 2 )
           total += number;

       System.out.printf( "Addition is %d\n", total ); // display results

    } // end main

} // end class Addition