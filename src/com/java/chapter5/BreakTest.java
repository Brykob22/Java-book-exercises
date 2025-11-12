//Fig. 5.12: BreakTest.java
//The break statement to exit a for statement.

package com.java.chapter5;

public class BreakTest {
	
 public static void main(String args[]) {
	 
     int count; // the control variable is also used after the loop ends

     for (count = 1; count <= 10; count++) // iterates 10 times
    	 
     {
         if (count == 5) // if count is 5,
             break;      // terminate the loop

         System.out.printf("%d ", count);
         
     } // end for

     System.out.printf("\nExited loop at count = %d\n", count);
     
  } // end main
 
} // end class BreakTest