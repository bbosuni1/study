package com.hw4.controller;

public class DateCalculator {

		public DateCalculator() {}
		
		public long leapDate() {
			
			
		}
		
		public boolean isLeapDate(int year) {
			boolean result = false;
			if ( year % 4 == 0 &&( year % 100 != 0 || year % 400 == 0)) result = true;
			return result;
		}
}
