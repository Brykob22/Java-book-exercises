package com.java.exercises;

import javax.swing.JOptionPane;

public class Score {
	
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to the average calculator");

      
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your first score"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your second score"));
        double c3 = Double.parseDouble(JOptionPane.showInputDialog("Enter your third score"));
        double c4 = Double.parseDouble(JOptionPane.showInputDialog("Enter your fourth score"));
        double c5 = Double.parseDouble(JOptionPane.showInputDialog("Enter your fifth score"));
        double c6 = Double.parseDouble(JOptionPane.showInputDialog("Enter your sixth score"));
        double c7 = Double.parseDouble(JOptionPane.showInputDialog("Enter your seventh score"));
        double c8 = Double.parseDouble(JOptionPane.showInputDialog("Enter your eighth score"));

       
        double sum = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
        double average = sum / 8;

    
        String message = "Your score is:\n" +
                         "1: " + c1 + "\n" +
                         "2: " + c2 + "\n" +
                         "3: " + c3 + "\n" +
                         "4: " + c4 + "\n" +
                         "5: " + c5 + "\n" +
                         "6: " + c6 + "\n" +
                         "7: " + c7 + "\n" +
                         "8: " + c8 + "\n\n" +
                         "Total sum of scores: " + sum + "\n" +
                         "final average: " + average;

        JOptionPane.showMessageDialog(null, message);
    }
    
}
