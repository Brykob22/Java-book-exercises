package com.java.calculator;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Division {

	public int d1 = 1 ;
	public int d2 = 1 ;
	public int d3 = 1 ;
	public int d4 = 1 ;
	public int d5 = 1 ;
	public int result;

	public static void divNumber(Scanner scanner) {

		Division div = new Division();
		
		String n1 = JOptionPane.showInputDialog("You can enter up to 5 numbers. (Enter 1 to finish to adding)");
		div.d1 = Integer.parseInt(n1);

		if (div.d1 != 1) {
		String n2 = JOptionPane.showInputDialog("Second number:\t");
			div.d2 = Integer.parseInt(n2);
		}

		if (div.d2 != 1) {
		String n3 = JOptionPane.showInputDialog("Third number:\t");
			div.d3 = Integer.parseInt(n3);
		}

		if (div.d3 != 1) {
		String n4 = JOptionPane.showInputDialog("Fourth number:\t");
			div.d4 = Integer.parseInt(n4);
		}

		if (div.d4 != 1) {
		String n5 = JOptionPane.showInputDialog("Fifth number:\t");
			div.d5 = Integer.parseInt(n5);
		}

		div.result = div.d1 / div.d2 / div.d3 / div.d4 / div.d5;
		
		JOptionPane.showMessageDialog(null, div.result);

	}

}