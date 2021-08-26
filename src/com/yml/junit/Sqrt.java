package com.yml.junit;

import java.util.Scanner;

public class Sqrt {
	public static void run() {
	Scanner sc = new Scanner(System.in);
	int c = sc.nextInt();
	double epsilon = 1e-15; 
	double t = c; 

	while (Math.abs(t - c / t) > epsilon * t) {
		t = (c / t + t) / 2.0;
	}
	System.out.println(t);
}
}

