package com.java.calculator;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Addition {

	public int a1;
	public int a2;
	public int a3;
	public int a4;
	public int a5;
	public int result;

	public static void sumNumbers(Scanner scanner) {

		Addition sum = new Addition();
		

		String n1 = JOptionPane.showInputDialog("You can enter up to 5 numbers. (Enter 0 to finish to adding)\n First number:\n");

		sum.a1 = Integer.parseInt(n1);

		if (sum.a1 != 0) {
			String n2 = JOptionPane.showInputDialog("Second number:\t");
			sum.a2 = Integer.parseInt(n2);
		}

		if (sum.a2 != 0) {
			String n3 = JOptionPane.showInputDialog("Third number:\t");
			sum.a3 = Integer.parseInt(n3);
		}

		if (sum.a3 != 0) {
			String n4 = JOptionPane.showInputDialog("Fourth number:\t");
			sum.a4 = Integer.parseInt(n4);
		}

		if (sum.a4 != 0) {
			String n5 = JOptionPane.showInputDialog("Fifth number:\t");
			sum.a5 = Integer.parseInt(n5);
		}

		sum.result = sum.a1 + sum.a2 + sum.a3 + sum.a4 + sum.a5;

		JOptionPane.showMessageDialog(null, sum.result);

	}

}
