package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParenthesis(n));
	}
	
	
	// Backtracking Approach
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		backtrack(list, "", 0, 0, n);
		return list;
	}
	
	// Backtracking template ;)
	public static void backtrack(List<String> list, String str, int open, int close, int max) {
		// System.out.println("str = "+str);
		
		// Bounding function / condition
		if(str.length() == max*2) {
			list.add(str);
			return;
		}
		
		// Make possible decisions
		if(open < max) {
			backtrack(list, str+"(", open+1, close, max);
		}
		if(close < open) {
			backtrack(list, str+")", open, close+1, max);
		}
	}

}
