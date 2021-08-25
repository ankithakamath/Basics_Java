package com.yml.logic;

import java.util.Scanner;

public class PrimeNumber{
	
public static void run(String args[]){    
	  int i,flag=0;      
	  long n;
	  Scanner sc=new Scanner(System.in);         
	  System.out.print("Enter the number: ");  
	  n = sc.nextInt();  
	       
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<=n/2;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }
	}    
	}   