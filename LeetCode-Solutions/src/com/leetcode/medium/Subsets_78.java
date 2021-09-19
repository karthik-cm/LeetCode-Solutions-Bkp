package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		System.out.println(subsets(nums));
	}
	
	
	// Backtracking - DFS
    public static List<List<Integer>> subsets(int[] nums) {
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
	
    }
	
    
    
	/*public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> finalList = new ArrayList<>();
	    finalList.add(new ArrayList<Integer>());

	    for(int num : nums) {
	    	List<List<Integer>> subsetsList = new ArrayList<>();
	      
	    	for(List<Integer> list : finalList) {
	    		List<Integer> tempList = new ArrayList<Integer>(list);
	    		tempList.add(num);
	    		subsetsList.add(tempList);
	    	}
	      
	    	for(List<Integer> list : subsetsList) {
	    		finalList.add(list);
	    	}
	    }
	    
	    return finalList;
	}*/

}
