/*
 * 5] In-place Prefix Sum
 */

class Solution {
	
	void inplacePrefixSum(int nums[]) {
		
		for(int i = 1; i < nums.length; i++) {

                        nums[i] = nums[i] + nums[i - 1];
                }	
	}
	public static void main(String[] args) {

		int nums[] = new int[]{1,2,3,4,5};
		new Solution().inplacePrefixSum(nums);
		for(int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]);
		}
	}
}
