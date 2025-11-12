// Fig. 7.22: RainbowDrawing.java
// Demonstrates the use of colors in an array.

package com.java.chapter7;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RainbowDrawing extends JPanel {

    // define the colors violet and indigo
    final Color VIOLET = new Color(128, 0, 128);
    final Color INDIGO = new Color(75, 0, 130);

    // the colors to use in the rainbow, starting from the innermost
    // the two white entries produce an empty arc in the center
    private Color colors[] = 
        { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
          Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

    // constructor
    public RainbowDrawing() {
        setBackground(Color.WHITE); // set background to white
    } // end of RainbowDrawing constructor

    // draws a rainbow using concentric arcs
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radius = 20; // the radius of an arc

        // draw the rainbow near the bottom center
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        // draw filled arcs, starting with the outermost
        for (int count = colors.length; count > 0; count--) {

            // set the color for the current arc
            g.setColor(colors[count - 1]);

            // fill the arc from 0 to 180 degrees
            g.fillArc(centerX - count * radius,
                      centerY - count * radius,
                      count * radius * 2, count * radius * 2, 0, 180);

        } // end of for
    } // end of paintComponent method

} // end of RainbowDrawing class