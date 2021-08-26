package com.yml.junit;

import java.util.Scanner;

public class Monthlypayment {
	
	public static void run(String[] args) {
		System.out.println("enter the year,rate and principal");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		Scanner in1 = new Scanner(System.in);
		int rate = in1.nextInt();
		Scanner in2 = new Scanner(System.in);
		int principal = in2.nextInt();
		double n = 12 * year;
		double r = rate / (12 * 100);
		double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
		System.out.println("Monthly Payment = " + payment);
	}
}
