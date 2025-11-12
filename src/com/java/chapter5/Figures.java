//Fig. 5.26: Figures.java
//Demonstrates how to draw different shapes.

package com.java.chapter5;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Figures extends JPanel {
 
    private int option; // user’s choice about which shape to draw

    // constructor sets the user's option
    public Figures(int userOption) {
        option = userOption;
        
    } // end constructor

    // draws a series of shapes starting from the top-left corner
    @Override
    public void paintComponent(Graphics g) {
    	
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
        	
            // choose which shape to draw based on the user's option
            switch (option) {
            
                case 1: // draw rectangles
                    g.drawRect(10 + i * 10, 10 + i * 10,
                              50 + i * 10, 50 + i * 10);
                    break;
                case 2: // draw ovals
                    g.drawOval(10 + i * 10, 10 + i * 10,
                               50 + i * 10, 50 + i * 10);
                    break;
                    
            } // end switch
            
        } // end for
        
    } // end method paintComponent
    
} // end class Figures