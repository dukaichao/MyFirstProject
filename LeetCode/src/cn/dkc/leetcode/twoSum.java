package cn.dkc.leetcode;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	public static void main(String[] args){
		int[] arr = {1,23,4,56,7,8,9,41};
		int array[] = twosum(arr,24);
		for(int i:array) {
			System.out.print(i+" ");
		}
		
	}
	public static int[] twosum(int[] nums, int target) {
	    Map<Integer, Integer> mp = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	    	int complement = target - nums[i];
	    	if (mp.containsKey(complement) && mp.get(complement) != i) {
		           return new int[] { mp.get(complement),i }; 	
		     }
	        mp.put(nums[i], i);
	    }
	    return new int[] {-1,-1};
	}
	/*public static int[] twosum(int[] nums, int target) {
	    Map<Integer, Integer> mp = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        mp.put(nums[i], i);
	    }
	    
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (mp.containsKey(complement) && mp.get(complement) != i) {
	           return new int[] { i, mp.get(complement) };
	        	
	        }
	    }
	   return new int[] {-1,-1};
	}*/
}
