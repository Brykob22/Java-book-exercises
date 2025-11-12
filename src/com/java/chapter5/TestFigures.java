//Fig. 5.27: TestFigures.java
//Test application that displays the Figures class.

package com.java.chapter5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFigures {
	
    public static void main(String args[]) {

        // gets the user's option
        String input = JOptionPane.showInputDialog(
            "Enter 1 to draw rectangles\n" +
            "Enter 2 to draw ovals"
        );

        int option = Integer.parseInt(input); // converts input to int

        // creates the panel with the user's choice
        Figures panel = new Figures(option);

        JFrame application = new JFrame(); // creates a new JFrame object

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); // adds the panel to the frame
        application.setSize(300, 300); // sets the desired size
        application.setVisible(true); // shows the frame
        
    } // end of main
    
} // end of class TestFigures