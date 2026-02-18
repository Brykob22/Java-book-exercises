package com.java.exercises;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class DBSubjects {
	
	public static void subjects(){
		
		//SQL Commands - prompts - sentences - query 
		String showTables = "SHOW TABLES;";
		
		StringBuilder data1 = new StringBuilder();
		
		try {
			Connection conn = DBConnection.getConnection();
		    
		    Statement st = conn.createStatement();
		    ResultSet rs = st.executeQuery(showTables);
		    
		    while(rs.next()) {
		    	
		    	String tableName = rs.getString("Tables_in_" + Constants.databaseName);
		    	
		    	
		    	if (tableName.equalsIgnoreCase("subjects")) {
		    		
		    	  String queryTable = "Select * from " + tableName + ";" ;
		    	
		    	  Statement st1 = conn.createStatement();
				  ResultSet rs1 = st1.executeQuery(queryTable);
				 
				  data1.append("TABLE: SUBJECTS\n");
				  data1.append("-------------------------------------------------------------------------------------------------\n");
				  data1.append(String.format("%-20s %-15s %-20s %-20s %-20s%n",
						           ("SUBJECT NAME"),
				                   ("LAVEL"), 
						           ("ASSIGNED TIME"),
				                   ("ASSIGNED TEACHER"),
						           ("TEACHER EMAIL")));
				
				  data1.append("-------------------------------------------------------------------------------------------------\n");
				  
				  while(rs1.next()) {
					  data1.append(String.format("%-20s %-15s %-20s %-20s %-20s%n",
				          rs1.getString("subject_name"),
				          rs1.getString("subject_difficulty_level"),
				          rs1.getString("subject_assigned_time"),
				          rs1.getString("subject_assigned_teacher"),
				          rs1.getString("subject_teacher_email")));
				  }
				
				  data1.append("-------------------------------------------------------------------------------------------------\n");
				  rs1.close();
				  st1.close();
				  
		    	} 
		    	
		    }
		    
		    rs.close();
		    st.close();
		    DBConnection.closeConnection(conn);
		    
		    UIManager.put("OptionPane.messageFont", new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
		    
		    JOptionPane.showMessageDialog(null, 
			        data1.toString(), 
			        "Subjects_Students Data", 
			        JOptionPane.INFORMATION_MESSAGE);
		    
		}
		
		catch(SQLException sqle) {
			sqle.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"An error has occurred" + sqle.getMessage(), 
					"Error",
					JOptionPane.ERROR_MESSAGE);	
		} 
		
	}

}
