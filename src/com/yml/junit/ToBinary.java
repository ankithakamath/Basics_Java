package com.yml.junit;

public class ToBinary {
public static String toBinary(int num) {
		
		int temp = num;
		String remString;
		String bits = "";

		while (temp != 0) {
			int rem = temp % 2;
			remString = Integer.toString(rem);
			bits = remString + bits;
			temp = temp / 2;
		}
		int length = bits.length();
		if(length!= 8) {
			for(int i=0;i<8-length;i++) {
				bits = "0" + bits;
			}
			
		}
		return bits;
	}
}
