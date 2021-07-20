package com.java.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}
	
	public static List<String> generateParenthesis(int n) {
	    List<String> parensList = new ArrayList<>();
	    dfs("", n, n, parensList);
	    return parensList;
	}

	private static void dfs(String s, int left, int right, List<String> parensList) {
	    if (left == 0 && right == 0) {
	    	parensList.add(s);
	    }
	    else {
	        if(left > 0) {
	        	dfs(s+"(", left-1, right, parensList);
	        }
	        if(right > left) {
	        	dfs(s+")", left, right-1, parensList);
	        }
	    }
	}

}
