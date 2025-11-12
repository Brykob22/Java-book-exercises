// Fig. 8.23: DrawTest.java
// Test application to display a DrawPanel on screen.

package com.java.chapter8;

import javax.swing.JFrame;

public class DrawTest {

    public static void main(String args[]) {

        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);

    } // end of main

} // end of DrawTest class
