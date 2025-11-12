// Fig. 6.17: TestDrawSmileyFace.java
// Test application that displays a smiley face
package com.java.chapter6;

import javax.swing.JFrame;

public class TestDrawSmileyFace {

    public static void main(String args[]) {

        DrawSmileyFace panel = new DrawSmileyFace();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);

    } // end of main

} // end of class TestDrawSmileyFace