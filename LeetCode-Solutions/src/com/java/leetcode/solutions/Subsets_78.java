package com.java.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		System.out.println(subsets(nums));
		
		System.out.println(14 / 2);
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
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
	}

}
