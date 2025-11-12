//Fig. 5.13: ContinueTest.java
//The continue statement to skip an iteration of a for statement.

package com.java.chapter5;

public class ContinueTest {
	
   public static void main(String args[]) {
	 
       for (int count = 1; count <= 10; count++) { // iterates 10 times
    	   
           if (count == 5) // if count is 5,
               continue;   // skip the rest of the code in the loop

           System.out.printf("%d ", count);
           
       } // end for

       System.out.println("\nUsed continue to skip printing 5");
       
   } // end main
   
} // end class ContinueTest