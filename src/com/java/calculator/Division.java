package com.java.calculator;

import java.util.Scanner;

public class Division {

	public int d1 = 1 ;
	public int d2 = 1 ;
	public int d3 = 1 ;
	public int d4 = 1 ;
	public int d5 = 1 ;
	public int result;

	public static void divNumber(Scanner scanner) {

		System.out.println("You can enter up to 5 numbers. (Enter 1 to finish to adding)");

		Division div = new Division();

		System.out.print("First number:\t");
		div.d1 = Util.validateNumber(scanner);

		if (div.d1 != 1) {
			System.out.print("Second number:\t");
			div.d2 = Util.validateNumber(scanner);
		}

		if (div.d2 != 1) {
			System.out.print("Third number:\t");
			div.d3 = Util.validateNumber(scanner);
		}

		if (div.d3 != 1) {
			System.out.print("Fourth number:\t");
			div.d4 = Util.validateNumber(scanner);
		}

		if (div.d4 != 1) {
			System.out.print("Fifth number:\t");
			div.d5 = Util.validateNumber(scanner);
		}

		div.result = div.d1 / div.d2 / div.d3 / div.d4 / div.d5;

		System.out.println("This is result: " + div.result);

	}

}