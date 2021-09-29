package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_78 {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		System.out.println(subsets(nums));
	}
	
	
	// Backtracking - DFS
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(0, nums, new ArrayList<Integer>(), list);
		return list;
	}

	private static void backtrack(int start, int[] nums, ArrayList<Integer> temp, List<List<Integer>> list) {
		list.add(new ArrayList<>(temp));
		
		for(int i=start; i<nums.length; i++) {
			temp.add(nums[i]);
			backtrack(i+1, nums, temp, list);
			temp.remove(temp.size()-1);
		}
	}
	
	
    /*public static List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> finalList = new ArrayList<>();
    	for(int size=0; size<=nums.length; size++){
            backtrack(0, size, nums, new ArrayList<Integer>(), finalList);
        }
        return finalList;
    }
    
    public static void backtrack(int index, int size, int[] nums, ArrayList<Integer> tempList, List<List<Integer>> finalList){
        if(tempList.size() == size){
        	finalList.add(new ArrayList<>(tempList));
            return;
        }
        
        for(int i=index; i<nums.length; i++){
            tempList.add(nums[i]);
            backtrack(i+1, size, nums, tempList, finalList);
            tempList.remove(tempList.size()-1);
        }
    }*/
	
    
}
