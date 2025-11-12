// Fig. 3.18: DialogName.java
// Basic input with a dialog box.

package com.java.chapter3;

import javax.swing.JOptionPane;

public class DialogName {
	
 public static void main(String args[]) {
	 
     // prompt user to enter their name
     String name =
         JOptionPane.showInputDialog("What is your name?");

     // create the message
     String message =
         String.format("Welcome, %s, to Java programming!", name);

     // display the message to welcome the user by name
     JOptionPane.showMessageDialog(null, message);
     
   } // end main
 
} // end class DialogName