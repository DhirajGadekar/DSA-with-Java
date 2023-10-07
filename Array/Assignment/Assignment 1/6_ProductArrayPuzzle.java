/*
 * 6] Product array puzzle
 */

class Solution {
	
	int[] productArrayPuzzle(int nums[]) {
		
		int suffix[] = new int[nums.length];
		suffix[suffix.length - 1] = nums[nums.length - 1];
		for(int i = nums.length - 2; i >= 0; i--) {
				
			suffix[i] = nums[i] * suffix[i + 1];
		}
		
		for(int i = 1; i < nums.length; i++) {
			
			nums[i] = nums[i] * nums[i - 1];
		}
		for(int i = 0; i < nums.length; i++) {

			if(i == 0) {
				
				suffix[i] = suffix[i + 1];
			} else if(i == nums.length - 1) {
				
				suffix[i] = nums[i - 1];
			} else {
				
				suffix[i] = suffix[i + 1] * nums[i - 1];
			}
		}
		return suffix;
	}
	public static void main(String[] args) {
		
		int nums[] = new int[]{5, 1, 10, 1};
		nums = new Solution().productArrayPuzzle(nums);
		for(int i = 0; i < nums.length; i++) {

			System.out.println(nums[i]);
		}
	}
}
