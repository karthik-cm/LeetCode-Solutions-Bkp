package com.java.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
	
	public static void main(String[] args) {
		// [2, 3, 6, 7] && target = 7
		int candidates[] = {2,3,5,7};
		int target = 7;
		
		System.out.println(combinationSum(candidates, target));
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList= new ArrayList<>();
        dfs(0, target, 0, candidates, new ArrayList<Integer>(), finalList);
        return finalList;
    }
    
    public static void dfs(int start, int target, int sum, int candidates[], List<Integer> list, List<List<Integer>> finalList){
        if(sum == target){
            finalList.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=start; i<candidates.length && sum<=target; i++){
            sum += candidates[i];
            list.add(candidates[i]);
            dfs(i, target, sum, candidates, list, finalList);
            sum -= candidates[i];
            list.remove(list.size()-1);
        }
    }
	
	
	
	/*public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> finalList = new ArrayList<>(); 
		int len = candidates.length;
		
		if(len > 0 && target > 0) {
			List<Integer> list = new ArrayList<>();
			
			for(int i=0; i<len; i++) {
				int element = candidates[i];
				
				if(target % element == 0) {
					list = getElementList(list, element, target/element);
					finalList.add(list);
				}
			}
			
			for(int i=0; i<len; i++) {
				for(int j=i+1; j<len; j++) {
					
				}
			}
		}
		
		return finalList;
    }
	
	private static List<Integer> getElementList(List<Integer> list, int element, int times){
		for(int i=0; i<times; i++) {
			list.add(element);
		}
		return list;
	}*/
}
