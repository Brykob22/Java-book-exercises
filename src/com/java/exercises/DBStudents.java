package com.java.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class DBStudents  {
	
	public static void main (String [] args) {
				
		
		String finalUrl = Constants.urlDriver + Constants.serverIp + ":" + Constants.serverPort + "/" + Constants.databaseName;
		
		System.out.println(finalUrl);
		
		//SQL Commands - prompts - sentences - query 
		String showTables = "SHOW TABLES;";
		
		StringBuilder data = new StringBuilder();
		
		try {
			
			Class.forName(Constants.driverName);
		    Connection conn = DriverManager.getConnection(finalUrl, Constants.databaseUsername, Constants.databasePassword);
		    System.out.println(conn);
		    System.out.println("Database connected\n");
		    
		    Statement st = conn.createStatement();
		    ResultSet rs = st.executeQuery(showTables);
		    
		    while(rs.next()) {
		    	
		    	String tableName = rs.getString("Tables_in_" + Constants.databaseName);
		    	
		    	
		    	if (tableName.equalsIgnoreCase("students")) {
		    		
		    	  String queryTable = "Select * from " + tableName + ";" ;
		    	
		    	  Statement st1 = conn.createStatement();
				  ResultSet rs1 = st1.executeQuery(queryTable);
				 
				  data.append("TABLE: STUDENTS\n");
				  data.append("----------------------------------------------------------------------------------------------------------------------------\n");
				  data.append(String.format("%-25s %-25s %-25s %-25s %-25s%n",
						           ("STUDENTS FIRST NAME"),
				                   ("LAST NAME"),
						           ("CURP"), 
				                   ("SOCIAL SECURITY"),
						           ("EMAIL" )));
				
				  data.append("----------------------------------------------------------------------------------------------------------------------------\n");

				  
				  while(rs1.next()) {
					  data.append(String.format("%-25s %-25s %-25s %-25s %-25s%n",
				          rs1.getString("student_first_name"),
				          rs1.getString("student_last_name"),
				          rs1.getString("student_curp"),
				          rs1.getString("student_social_security"),
				          rs1.getString("student_email")));
				  }
				
				  data.append("----------------------------------------------------------------------------------------------------------------------------\n");
				  rs1.close();
				  st1.close();
				  
		    	} 
		    	
		    }
		    
		    rs.close();
		    st.close();
		    conn.close();
		    
		    UIManager.put("OptionPane.messageFont", new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
		    
		    JOptionPane.showMessageDialog(null, 
			        data.toString(), 
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
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
