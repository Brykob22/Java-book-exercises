// Fig. 9.19: LabelDemo.java
// Demonstrates the use of labels.

package com.java.chapter9;

import java.awt.BorderLayout;
import java.awt.Image;  // Needed to scale the image
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {
	
    public static void main(String[] args) {
    	
        // create a label with text only
        JLabel northLabel = new JLabel("North");
        
        // create an icon from an image to place inside a JLabel
        
        // Modified this line to correctly load the image from the same package (com/java/chapter9)
        // Load and scale the image to 150x150 pixels
        ImageIcon originalIcon = new ImageIcon(LabelDemo.class.getResource("logo.jpeg"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(120, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon labelIcon = new ImageIcon(scaledImage);
        
        // create a label with an icon instead of text
        JLabel centerLabel = new JLabel(labelIcon);
        
        // create another label with an icon
        JLabel southLabel = new JLabel(labelIcon);
        
        // set the label to display text as well as an icon
        southLabel.setText("South");
        
        // create a frame to hold the labels
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add labels to the frame; the second argument specifies
        // where to add the label in the frame
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);
        
        application.setSize(300, 300); // set the frame size
        application.setVisible(true);  // display the frame
        
    } // end main
    
} // end class LabelDemo