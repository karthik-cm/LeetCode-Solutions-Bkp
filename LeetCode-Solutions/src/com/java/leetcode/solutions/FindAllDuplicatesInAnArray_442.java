package com.java.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesInAnArray_442 {

	public static void main(String[] args) {
		
	}
	
	/*public List<Integer> findDuplicates(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int n : nums){
            if(set.contains(n)){
                list.add(n);
            }
            else{
                set.add(n);
            }
        }
        
        
        return list;
    }*/
	
	// Arrays.sort() - time taking
	public List<Integer> findDuplicates(int[] nums) {
		LinkedList<Integer> list = new LinkedList<>();
		Arrays.parallelSort(nums);
        int prev = -1;
        
        for(int n : nums){
        	if(n == prev) {
        		list.add(n);
        	}
        	prev = n;
        }
        
        return list;
    }

}
