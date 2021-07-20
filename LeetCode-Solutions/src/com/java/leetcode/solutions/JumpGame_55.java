package com.java.leetcode.solutions;

public class JumpGame_55 {
	
	public static void main(String[] args) {
		
	}
	
	public boolean canJump(int[] nums) {
		int reach = 0;
		
        for(int i=0; i<nums.length; i++){
            if(reach < i)
            	break;
            
            if(reach < i+nums[i]){
                reach = i+nums[i];
            }
            
            if(reach >= nums.length-1)
                return true;
        }
        return false;
	 }
}
