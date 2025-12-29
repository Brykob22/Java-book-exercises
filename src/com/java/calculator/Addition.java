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
		
		//System.out.println("You can enter up to 5 numbers. (Enter 0 to finish to adding)");

		//UiText.getMessage();
		
		Addition sum = new Addition();

		//System.out.print("First number:\t");
		
		String n1 = JOptionPane.showInputDialog("First number");
		
		sum.a1 = Integer.parseInt(n1);//Util.validateNumber(n1);

		if (sum.a1 != 0) {
			System.out.print("Second number:\t");
			sum.a2 = Util.validateNumber(scanner);
		}

		if (sum.a2 != 0) {
			System.out.print("Third number:\t");
			sum.a3 = Util.validateNumber(scanner);
		}

		if (sum.a3 != 0) {
			System.out.print("Fourth number:\t");
			sum.a4 = Util.validateNumber(scanner);
		}

		if (sum.a4 != 0) {
			System.out.print("Fifth number:\t");
			sum.a5 = Util.validateNumber(scanner);
		}

		sum.result = sum.a1 + sum.a2 + sum.a3 + sum.a4 + sum.a5;

		System.out.println("This is result: " + sum.result);
	
	}
	
	
	
}
