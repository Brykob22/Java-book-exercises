package com.java.calculator;

import java.util.Scanner;

public class Multiplication {

	public int m1 = 1;
	public int m2 = 1;
	public int m3 = 1;
	public int m4 = 1;
	public int m5 = 1;
	public int result;

	public static void mulNumber(Scanner scanner) {

		System.out.println("You can enter up to 5 numbers. (Enter 1 to finish to adding)");

		Multiplication mul = new Multiplication();

		System.out.print("First number:\t");
		mul.m1 = Util.validateNumber(scanner);

		if (mul.m1 != 1) {
			System.out.print("Second number:\t");
			mul.m2 = Util.validateNumber(scanner);
		}

		if (mul.m2 != 1) {
			System.out.print("Third number:\t");
			mul.m3 = Util.validateNumber(scanner);
		}

		if (mul.m3 != 1) {
			System.out.print("Fourth number:\t");
			mul.m4 = Util.validateNumber(scanner);
		}

		if (mul.m4 != 1) {
			System.out.print("Fifth number:\t");
			mul.m5 = Util.validateNumber(scanner);
		}

		mul.result = mul.m1 * mul.m2 * mul.m3 * mul.m4 * mul.m5;

		System.out.println("This is result: " + mul.result);

	}

}
