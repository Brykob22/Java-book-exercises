package com.java.exercises;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SelectTable {
	
	public static int getOption() {
		
		String [] options = { "Subjects_students" , "Subjects" , "Students"};
		
		return JOptionPane.showOptionDialog(null, "Select Table", "Data Base",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options);
	}
	
	public void start() {
		
		Scanner scanner = new Scanner(System.in);
		
		int option = SelectTable.getOption();
		
		if (option == 2) {
			DBStudents.students(scanner);
		}
		
		if (option == 1) {
			DBSubjects.subjects(scanner);
		}
		
		if (option == 0) {
			DBSubjectsStudents.subjectsStudents(scanner);
		}
		
	}

}
