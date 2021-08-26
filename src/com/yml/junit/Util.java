package com.yml.junit;

import java.util.*;

public final class Util {
	
	private Util() {}
		public static void WeekDay(String[] args) {
			int day = Integer.parseInt(args[0]);
			int month = Integer.parseInt(args[1]);
			int year = Integer.parseInt(args[2]);

			int year1 = year - (14 - month) / 12;
			int temp = year1 + (year1 / 4) - (year1/100) + (year1/400);
			int month1 = month + (12 * ((14-month) / 12)) -2;
			int result = (day + temp + ((31 * month1)/12)) % 7;
			
			System.out.println("Day is " + result);
		}
	}

