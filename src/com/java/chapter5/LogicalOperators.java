//Fig. 5.18: LogicalOperators.java
//Logical operators.

package com.java.chapter5;

public class LogicalOperators {
	
    public static void main(String args[]) {
     
        // create truth table for the && (conditional AND) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
            "Conditional AND (&&)",
            "false && false", (false && false),
            "false && true", (false && true),
            "true && false", (true && false),
            "true && true", (true && true)
        );

        // create truth table for the || (conditional OR) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
            "Conditional OR (||)",
            "false || false", (false || false),
            "false || true", (false || true),
            "true || false", (true || false),
            "true || true", (true || true)
        );

        // create truth table for the & (boolean logical AND) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
            "Boolean logical AND (&)",
            "false & false", (false & false),
            "false & true", (false & true),
            "true & false", (true & false),
            "true & true", (true & true)
        );

        // create truth table for the | (boolean logical inclusive OR) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
            "Boolean logical inclusive OR (|)",
            "false | false", (false | false),
            "false | true", (false | true),
            "true | false", (true | false),
            "true | true", (true | true)
        );

        // create truth table for the ^ (boolean logical exclusive OR) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
            "Boolean logical exclusive OR (^)",
            "false ^ false", (false ^ false),
            "false ^ true", (false ^ true),
            "true ^ false", (true ^ false),
            "true ^ true", (true ^ true)
        );

        // create truth table for the ! (logical negation) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n",
            "Logical NOT (!)",
            "!false", (!false),
            "!true", (!true)
        );
        
    } // end main
    
} // end class LogicalOperators