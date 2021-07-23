package com.leetcode.medium;

public class DivideIntegers {

	/*Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

	Return the quotient after dividing dividend by divisor.

	The integer division should truncate toward zero, which means losing its fractional part. 
	For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.*/
	
	
	public static void main(String[] args) {
		
	}
	
	public static int divide(int dividend, int divisor) {
		boolean isNeg = (dividend < 0 || divisor < 0) ? true : false;
		
		if(dividend < divisor) {
			return 0;
		}
		
		while(dividend < divisor) {
			
		}
		System.out.println(isNeg);
		
		return 0;
    }

}
