// Fig. 8.22: DrawPanel.java
// Program that uses the MyLine class
// to draw random lines.

package com.java.chapter8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private Random randomNumbers = new Random();
    private MyLine lines[]; // array of lines

    // constructor creates a panel with random shapes
    public DrawPanel() {

        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        // create lines
        for (int count = 0; count < lines.length; count++) {

            // generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            // generate a random color
            Color color = new Color(
                    randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256)
            );

            // add the line to the list of lines to display
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }

    } // end of DrawPanel constructor


    // for each array of shapes, draw individual shapes
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // draw the lines
        for (MyLine line : lines)
            line.draw(g);

    } // end of paintComponent method

} // end of DrawPanel class