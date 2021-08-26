package com.yml.junit;

import java.util.Scanner;



public class BinaryNibble {
	public static void binary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		scanner.close();
		
		
		String bits = ToBinary.toBinary(num);
		
		
		
		String nibble1 = bits.substring(0,4);
		String nibble2 = bits.substring(4,8);
		
		System.out.println("Nibble 1 = " + nibble1 + " Nibble 2 = " + nibble2);
		String reverse = nibble2 + nibble1;
		System.out.println("Reversed Binary = " + reverse);
		int result = 0;
		
		for(int i=reverse.length()-1;i>=0;i--) {
			int bit = Character.getNumericValue(reverse.charAt(i));
			result = (int) (result + (bit * Math.pow(2, 7-i)));
		}
		System.out.println("The Reversed Binary Equivalent Decimal Value = " + result);
	}
	
	
}


