package com.java.calculator;

import java.util.Scanner;

public class Subtraction {

	public int s1;
	public int s2;
	public int s3;
	public int s4;
	public int s5;
	public int result;

	public static void subNumber(Scanner scanner) {

		System.out.println("You can enter up to 5 numbers. (Enter 0 to finish to adding)");

		Subtraction sub = new Subtraction();

		System.out.print("First number:\t");
		sub.s1 = Util.validateNumber(scanner);

		if (sub.s1 != 0) {
			System.out.print("Second number:\t");
			sub.s2 = Util.validateNumber(scanner);
		}

		if (sub.s2 != 0) {
			System.out.print("Third number:\t");
			sub.s3 = Util.validateNumber(scanner);
		}

		if (sub.s3 != 0) {
			System.out.print("Fourth number:\t");
			sub.s4 = Util.validateNumber(scanner);
		}

		if (sub.s4 != 0) {
			System.out.print("Fifth number:\t");
			sub.s5 = Util.validateNumber(scanner);
		}

		sub.result = sub.s1 - sub.s2 - sub.s3 - sub.s4 - sub.s5;

		System.out.println("This is result: " + sub.result);

	}
	
}
