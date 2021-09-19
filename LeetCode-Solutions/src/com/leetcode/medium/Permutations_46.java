package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(permute(nums));
	}
	
	
	// Backtracking
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> finalList = new ArrayList<>();
		backtrack(nums, new ArrayList<Integer>(), finalList);
		return finalList;
    }

	private static void backtrack(int[] nums, ArrayList<Integer> tempList, List<List<Integer>> finalList) {
		if(tempList.size() == nums.length) {
			finalList.add(new ArrayList<>(tempList));
		}
		
		for(int i=0; i<nums.length; i++) {
			if(tempList.contains(nums[i])) {
				continue;
			}
			
			tempList.add(nums[i]);
			backtrack(nums, tempList, finalList);
			tempList.remove(tempList.size()-1);
		}
	}
	
}
