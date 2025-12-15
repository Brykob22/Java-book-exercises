package com.java.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBSubjectsStudents {
	
	public static void main (String [] args) {
		
		
		String finalUrl = Constants.urlDriver + Constants.serverIp + ":" + Constants.serverPort + "/" + Constants.databaseName;
		
		System.out.println(finalUrl);
		
		//SQL Commands - prompts - sentences - query 
		String showTables = "SHOW TABLES;";
		
		StringBuilder data2 = new StringBuilder();
		
		try {
			
			Class.forName(Constants.driverName);
		    Connection conn = DriverManager.getConnection(finalUrl, Constants.databaseUsername, Constants.databasePassword);
		    System.out.println(conn);
		    System.out.println("Database connected\n");
		    
		    Statement st = conn.createStatement();
		    ResultSet rs = st.executeQuery(showTables);
		    
		    while(rs.next()) {
		    	
		    	String tableName = rs.getString("Tables_in_" + Constants.databaseName);
		    	
		    	
		    	if (tableName.equalsIgnoreCase("subjects_students")) {
		    		
		    	  String queryTable = "Select * from " + tableName + ";" ;
		    	
		    	  Statement st1 = conn.createStatement();
				  ResultSet rs1 = st1.executeQuery(queryTable);
				 
				  data2.append("TABLE: SUBJECTS_STUDENTS\n");
				  data2.append("-------------------------------------------------------------\n");
				  data2.append(String.format("%-20s %-20s %-30s %-20s%n",
						           ("SUBJECT ID"),
				                   ("STUDENT ID"),
						           ("GROUP"), 
				                   ("SCHEDULE")));
				
				  data2.append("-------------------------------------------------------------\n");
				  
				  while(rs1.next()) {
					  data2.append(String.format("%-30s %-30s %-30s %-30s%n",
				          rs1.getString("subjectid"),
				          rs1.getString("studentid"),
				          rs1.getString("group_name"),
				          rs1.getString("schedule")));
				  }
				
				  data2.append("-------------------------------------------------------------\n");
				  rs1.close();
				  st1.close();
				  
		    	} 
		    		    	
		    }
		    
		    rs.close();
		    st.close();
		    conn.close();
		    
		    JOptionPane.showMessageDialog(null, 
			        data2.toString(), 
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
