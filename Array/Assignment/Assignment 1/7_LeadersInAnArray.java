/*
 * 7] Leaders in an array
 */

import java.util.*;
class Solution {
	
	ArrayList<Integer> leadersInArray(int nums[]) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(nums[nums.length - 1]);
		for(int i = nums.length - 2; i >= 0; i--) {
			
			if(al.get(0) < nums[i]) {
				
				al.add(0, nums[i]);
			} 
		}
		return al;
	}
	public static void main(String[] args) {
			
		int[] nums = new int[]{16, 17, 78, 3, 5, 2};
		System.out.println(new Solution().leadersInArray(nums));
	}
}
