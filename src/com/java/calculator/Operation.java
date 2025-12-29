package com.java.calculator;

import java.util.Scanner;

public class Operation {

	public void start() {

		Scanner scanner = new Scanner(System.in);

		int option = UiText.getOption();
		
		System.out.println("Valor de option");
		System.out.println(option);
		
		//int option = scanner.nextInt();

		if (option == 0) {
			Addition.sumNumbers(scanner);
		}

		if (option == 1) {
			Subtraction.subNumber(scanner);
		}

		if (option == 2) {
			Multiplication.mulNumber(scanner);
		}

		if (option == 3) {
			Division.divNumber(scanner);
		}

		scanner.close();

	}

}
