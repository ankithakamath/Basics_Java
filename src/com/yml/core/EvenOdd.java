package com.yml.core;

import java.util.Scanner;

public class EvenOdd {
	
		public static void run() {
				
				Scanner in = new Scanner(System.in);
				
				System.out.println("Enter the number");
				int n = in.nextInt();
				
				if(n%2 == 0)
					System.out.println("the number is even");
				else
					System.out.println("The number is odd");
				
			}
	}
