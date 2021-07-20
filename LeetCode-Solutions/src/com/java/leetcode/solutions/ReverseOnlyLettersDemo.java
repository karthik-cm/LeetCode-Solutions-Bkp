package com.java.leetcode.solutions;

public class ReverseOnlyLettersDemo {

	public static void main(String[] args) {
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}
	
	
	public static String reverseOnlyLetters(String s) {
        if(s != null && s.trim().length() > 0){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);

                if(Character.isLetter(c)){
                    sb.append(c);
                }
            }

            String sRev = sb.reverse().toString();
            System.out.println("sRev = "+sRev);
            sb = new StringBuilder();

            int count = 0;
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);

                if(Character.isLetter(c)){
                    sb.append(sRev.charAt(count));
                    count++;
                }
                else{
                    sb.append(c);
                }
            }
            
            return sb.toString();
        }
        
        return "";
    }

}
