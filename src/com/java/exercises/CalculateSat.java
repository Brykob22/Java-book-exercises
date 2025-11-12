package com.java.exercises;

import javax.swing.JOptionPane;

public class CalculateSat {
	
	public static void main (String args []) {
		
        JOptionPane.showMessageDialog(null, "Welcome to the IVA calculator");
		
		
		JOptionPane.showMessageDialog(null, 
	            "Enter sales and return prices one by one.\n" +
	            "When finished, type -1 to continue." );
		
		
		int  totalSales = 0;
		int totalReturns = 0;
		String input;
		
		
		while (true) {
			input = JOptionPane.showInputDialog("Enter sale price. \n(Or type -1 to finish):");
			if (input == null || input.equals("-1")) {
				break;	
			}
			
			try {
				int number = Integer.parseInt(input);
				totalSales += number;
			}
			
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number. ");
			}
		}
		
		
		while (true) {
			input = JOptionPane.showInputDialog("Enter return price. \n(Or type -1 to finish):");
			if (input == null || input.equals("-1")) {
				break;
			}
			
			try {
				int number = Integer.parseInt(input);
				totalReturns += number;
			}
			
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number.");
			}
		}
		
		
		int netTotal = totalSales - totalReturns;
		double iva = netTotal * 0.16;
		
		
		JOptionPane.showMessageDialog(null, 
				"Result:\n" +
		        "Total sales:" + totalSales + "\n" +
				"Total returns:" + totalReturns + "\n" +
		        "Net total (sales - returns):" + netTotal + "\n" +
				"IVA (16%):" + iva );
				
	}
	

}