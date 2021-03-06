package com.yml.function;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class TwoDimArray {
	
	public static void run() {
		
		int rows,cols;
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
		
		out.println("Enter the number of rows: ");
		rows = in.nextInt();
		out.println("Enter the number of columns: ");
		cols = in.nextInt();
		
		int array[][] = new int[rows][cols];
		
		out.println("Enter Array elements");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				array[i][j] = in.nextInt();
		
		printArray(array, rows, cols);
			
		in.close();
		out.flush();
		out.close();
		
	}
	
	static void printArray(int array[][],int rows,int cols) {
		
		PrintWriter out = new PrintWriter(System.out,true);
		
		out.println("Array elements are: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				out.print(array[i][j]+" ");
			out.println();
		}
		
		out.close();
		
	}
}