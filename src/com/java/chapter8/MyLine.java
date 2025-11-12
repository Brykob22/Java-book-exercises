// Fig. 8.21: MyLine.java
// Declaration of the MyLine class.

package com.java.chapter8;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine {

    private int x1;      // x-coordinate of the first endpoint
    private int y1;      // y-coordinate of the first endpoint
    private int x2;      // x-coordinate of the second endpoint
    private int y2;      // y-coordinate of the second endpoint
    private Color myColor; // color of this shape

    // constructor with input values
    public MyLine(int x1, int y1, int x2, int y2, Color color) {

        this.x1 = x1;         // set x-coordinate of the first endpoint
        this.y1 = y1;         // set y-coordinate of the first endpoint
        this.x2 = x2;         // set x-coordinate of the second endpoint
        this.y2 = y2;         // set y-coordinate of the second endpoint
        myColor = color;      // set the color

    } // end of MyLine constructor


    // draws the line in the specified color
    public void draw(Graphics g) {

        g.setColor(myColor);
        g.drawLine(x1, y1, x2, y2);

    } // end of draw method

} // end of MyLine class
