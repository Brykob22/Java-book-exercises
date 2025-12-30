package com.java.calculator;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Multiplication {

	public int m1 = 1;
	public int m2 = 1;
	public int m3 = 1;
	public int m4 = 1;
	public int m5 = 1;
	public int result;

	public static void mulNumber(Scanner scanner) {

		Multiplication mul = new Multiplication();
		
		String n1 = JOptionPane.showInputDialog("You can enter up to 5 numbers. (Enter 1 to finish to adding)\n First number:");
		mul.m1 = Integer.parseInt(n1);

		if (mul.m1 != 1) {
		String n2 = JOptionPane.showInputDialog("Second number:\t");
			mul.m2 = Integer.parseInt(n2);
		}

		if (mul.m2 != 1) {
		String n3 = JOptionPane.showInputDialog("Third number:\t");
			mul.m3 = Integer.parseInt(n3);
		}

		if (mul.m3 != 1) {
		String n4 = JOptionPane.showInputDialog("Fourth number:\t");
			mul.m4 = Integer.parseInt(n4);
		}

		if (mul.m4 != 1) {
		String n5 = JOptionPane.showInputDialog("Fifth number:\t");
			mul.m5 = Integer.parseInt(n5);
		}

		mul.result = mul.m1 * mul.m2 * mul.m3 * mul.m4 * mul.m5;

		JOptionPane.showMessageDialog(null, mul.result);

	}

}
