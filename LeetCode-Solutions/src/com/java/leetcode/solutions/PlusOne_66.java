package com.java.leetcode.solutions;

import java.util.Arrays;

public class PlusOne_66 {

	public static void main(String[] args) {
		int digits[] = {9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	
	public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--){
            if(digits[i] == 9){
                if(i == 0){
                    int[] resultArray = new int[digits.length + 1];
                    resultArray[0] = 1;
                    return resultArray;
                }
                else{
                    digits[i] = 0;
                }
            }
            else{
                digits[i]++;
                break;
            }
        }

        return digits;
    }
	
	
	/*int carry = 0;
	
	for(int i=digits.length-1; i>=0; i--) {
		int value = digits[i];
		value = (i==digits.length-1) ? value + 1 : value + carry;
		System.out.println(value);
		
		if(value > 9) {
			int newValue = value % 10;
			carry = value / 10;
			digits[i] = newValue;
			
		}
		else {
			digits[i] = value;
			break;
		}
	}
	
	return digits;*/
}
