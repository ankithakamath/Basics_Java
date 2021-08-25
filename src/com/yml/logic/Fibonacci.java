package com.yml.logic;

import java.util.Scanner;


public class Fibonacci {
	public static void run (String args[])  
	{    
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
	int n1=0,n2=1,n3,i,count=n;    
	 System.out.print(n1+" "+n2);  
	    
	 for(i=2;i<count;++i)
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	  
	}

}