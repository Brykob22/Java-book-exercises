package com.java.calculator;

import java.util.Scanner;

public class Operation {

	public void start() {

		Scanner scanner = new Scanner(System.in);

		int option = UiText.getOption();

		if (option == 3) {
			Addition.sumNumbers(scanner);
		}

		if (option == 2) {
			Subtraction.subNumber(scanner);
		}

		if (option == 1) {
			Multiplication.mulNumber(scanner);
		}

		if (option == 0) {
			Division.divNumber(scanner);
		}

		scanner.close();

	}

}
