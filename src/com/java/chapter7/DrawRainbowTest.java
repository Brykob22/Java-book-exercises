// Fig. 7.23: DrawRainbowTest.java
// Test application to display a rainbow.

package com.java.chapter7;

import javax.swing.JFrame;

public class DrawRainbowTest {

    public static void main(String args[]) {

        RainbowDrawing panel = new RainbowDrawing();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);

    } // end of main

} // end of DrawRainbowTest class