package com.java.leetcode.solutions;

import java.util.Stack;

public class MinAddToMakeParenthesesValid_921 {

	public static void main(String[] args) {

	}
	
	
	public int minAddToMakeValid(String s) {
        if(s != null && s.length() > 0){
            Stack<Character> stack = new Stack<>();
            int count = 0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '('){
                    stack.push('(');
                }
                else{
                    if(stack.size() == 0){
                        count++;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            
            return stack.size() + count;
        }
        
        return 0;
    }

}
