package com.java.calculator;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Subtraction {

	public int s1;
	public int s2;
	public int s3;
	public int s4;
	public int s5;
	public int result;

	public static void subNumber(Scanner scanner) {

		Subtraction sub = new Subtraction();
		
		String n1 = JOptionPane.showInputDialog("You can enter up to 5 numbers. (Enter 0 to finish to adding)\n First number:\n");
		sub.s1 = Integer.parseInt(n1);

		if (sub.s1 != 0) {
		String n2 = JOptionPane.showInputDialog("Second number:\t");
			sub.s2 = Integer.parseInt(n2);
		}

		if (sub.s2 != 0) {
		String n3 = JOptionPane.showInputDialog("Third number:\t");
			sub.s3 = Integer.parseInt(n3);
		}

		if (sub.s3 != 0) {
		String n4 = JOptionPane.showInputDialog("Fourth number:\t");
			sub.s4 = Integer.parseInt(n4); 
		}

		if (sub.s4 != 0) {
		String n5 = JOptionPane.showInputDialog("Fifth number:\t");
			sub.s5 = Integer.parseInt(n5);
		}

		sub.result = sub.s1 - sub.s2 - sub.s3 - sub.s4 - sub.s5;
		
		JOptionPane.showMessageDialog(null, sub.result);

	}
	
}
