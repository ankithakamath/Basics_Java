package com.yml.junit;

import java.util.Scanner;

public class Temperature {

	public static void run(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		double result;
		System.out.println("Enter \n1 -Convert Celsius to Fahrenheit\n 2-Convert Fahrenheit to Celsius");
		choice = scanner.nextInt();
		System.out.println("Enter Temperature");
		double temperature = scanner.nextDouble();
		scanner.close();

		switch (choice) {
		case 1:
			result = (temperature * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit = " + result);
			break;
		case 2:
			result = (temperature - 32) * 5 / 9;
			System.out.println("Temperature in Celsius = " + result);
			break;
		default:
			break;
		}
	}

	
		
	}

