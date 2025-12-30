package com.java.calculator;

import javax.swing.JOptionPane;

public class UiText {

	public static int getOption() {

		String[] options = { "Division", "Multiplication" , "Subtraction" , "Addition" };

		return JOptionPane.showOptionDialog(null, "Select an operation", "Cuantic Calculator",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options);
		
	}
	
}