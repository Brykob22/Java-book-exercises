//Fig. 4.19: DrawPanel.java
//Using drawLine to connect the corners of a panel.

package com.java.chapter4;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
 // draws an X from the corners of the panel
    public void paintComponent( Graphics g ) {
	 
     // call paintComponent to ensure the panel displays correctly
        super.paintComponent( g );

        int width = getWidth(); // total width
        int height = getHeight(); // total height

     // draw a line from the upper-left to the lower-right corner
        g.drawLine( 0, 0, width, height );

     // draw a line from the lower-left to the upper-right corner
        g.drawLine( 0, height, width, 0 );

    } // end method paintComponent

} // end class DrawPanel