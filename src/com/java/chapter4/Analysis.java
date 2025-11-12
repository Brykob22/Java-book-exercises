//Fig. 4.12: Analysis.java
//Analysis of examination results.

package com.java.chapter4;

import java.util.Scanner; // this class uses the Scanner class

public class Analysis {
	
    public void processExamResults() {
	 
     // create Scanner object to obtain input from command window
        Scanner input = new Scanner( System.in );

     // initialize variables in declarations
        int passes = 0; // number of passes
        int failures = 0; // number of failures
        int studentCounter = 1; // student counter
        int result; // one exam result (obtains value from user)

     // process 10 students using counter-controlled loop
        while ( studentCounter <= 10 ) {
    	 
         // prompt user for input and obtain value
            System.out.print( "Enter result (1 = pass, 2 = fail): " );
            result = input.nextInt();

         // if...else nested in while
            if ( result == 1 ) // if result 1,
                passes = passes + 1; // increment passes;
            else // otherwise, result is not 1, so
                failures = failures + 1; // increment failures

         // increment studentCounter so loop eventually terminates
            studentCounter = studentCounter + 1;
        } // end while

     // termination phase; prepare and display results
        System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

     // determine whether more than 8 students passed
        if ( passes > 8 )
            System.out.println( "Raise tuition" );

    } // end method processExamResults

} // end class Analysis