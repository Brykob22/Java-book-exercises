//Fig. 5.2: ForCounter.java
//Counter-controlled repetition with the for repetition statement.

package com.java.chapter5;

public class ForCounter {
	
   public static void main( String args[] ) {
	 
       // for statement header includes initialization,
       // loop-continuation condition and increment
       for ( int counter = 1; counter <= 10; counter++ )
           System.out.printf( "%d ", counter );

       System.out.println(); // print a new line

   } // end main

} // end class ForCounter