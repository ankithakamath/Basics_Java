package com.yml.core;

import java.io.PrintWriter;
import java.util.Scanner;

public class Factors {
	public static void run() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("");
		int n = in.nextInt();
		
		while(n <= 0) {
			print("n should be greater than 0");
			n = in.nextInt();
		}
		
		print("Factors are: ");
		for(int i=2;i<=n;i++) {
			
			while(n%i == 0) {
				print(""+i);
				n = n/i;
			}
			
		}
		
	}
	private static void print(String msg) {
			
			PrintWriter out = new PrintWriter(System.out);
			out.println(msg);
			out.flush();
			
		}
		
	}




