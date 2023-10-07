/*
 * 4] Time to equality
 */

class Solution {
	
	int timeToEquality(int nums[]) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			
			if(max < nums[i]) {
				
				max = nums[i];
			}
		}
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			
			sum = sum + (max - nums[i]);
		}
		return sum;
	}
	public static void main(String[] args) {
			
		int nums[] = new int[]{2, 4, 1, 3, 2};
		System.out.println(new Solution().timeToEquality(nums));
	}
}
