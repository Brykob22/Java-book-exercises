// Fig. 2.4: Welcome3.java 
// Printing multiple lines of text with a single statement 

package com.java.chapter2;

public class Welcome3 {
	// the main method begins execution of the Java application
    public static void main(String args[]) {
    	
        System.out.println("Welcome\nto\nJava\nprogramming!");
        
     // Fig. 2.5: Some common escape sequences 
        System.out.println("First line\nSecond line\nThird line\n");
        
        System.out.println("First step!");
        System.out.println("\tSecond step!");
        System.out.println("\t\tThird step!");
        System.out.println("\t\t\tFourth step!");
        System.out.println("\t\t\t\tFifth step!\n");

        System.out.println("Welcome\tto\tthe\tprogramming\tin\tJava!\n");

        System.out.print("Loading: 10%\r");	
        System.out.print("Loading: 50%\r");
        System.out.println("Loading: 100% - Complete!\n");

        System.out.println("File saved in: C:\\Users\\Documents\\Welcome to Java programming!\n");
        
        System.out.println("He said: \"Welcome to Java programming!\"");
        // end of escape sequence
        
        
    } // end of main method

} // end of class Welcome3
