package com.java.calculator;

import javax.swing.JOptionPane;

public class UiText {

	public static int getOption() {

		String[] options = { "Addition", "Subtraction", "Multiplication", "Division" };

		return JOptionPane.showOptionDialog(null, "Select an operation", "Cuantic Calculator",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
	}
	
	public static void getMessage() {
		
		JOptionPane.showInputDialog("You can enter up to 5 numbers. (Enter 0 to finish to adding)\n First number:\n");
		
		JOptionPane.showInputDialog("Second number:\t");

		JOptionPane.showInputDialog("Third number:\t");
		
		JOptionPane.showInputDialog("Fourth number:\t");
		
		JOptionPane.showInputDialog("Fifth number:\t");
		
		
	}
}