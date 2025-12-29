package com.java.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	public static int validateNumber(Scanner scanner) {
		
		try {
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Que estás estúpido?????");
			return 0;
		}
		
	}
	
}
