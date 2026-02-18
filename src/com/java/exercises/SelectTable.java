package com.java.exercises;

import javax.swing.JOptionPane;

public class SelectTable {
	
	public static int getOption() {
		
		String [] options = { "Subjects_students" , "Subjects" , "Students"};
		
		return JOptionPane.showOptionDialog(null, "Select Table", "Data Base",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options);
	}
	
	/**
	 * Realiza la ejeución de un programa que muestra información de una base de datos de estudianes
	*/
	public void start() {
		
		int option = SelectTable.getOption();
		
		if (option == 2) {
			DBStudents.students();
		}
		
		if (option == 1) {
			DBSubjects.subjects();
		}
		
		if (option == 0) {
			DBSubjectsStudents.subjectsStudents();
		}
		
	}

}
