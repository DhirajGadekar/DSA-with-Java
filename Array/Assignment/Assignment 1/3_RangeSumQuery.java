/*
 * 3] Range Sum Query
 */

class Solution {
	
	int[] rangeSumQuery(int nums[], int arr[][]) {
		
		int nums1[] = new int[arr.length];
		for(int i = 1; i < nums.length; i++) {
			
			nums[i] = nums[i] + nums[i - 1];
		}
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i][0] == 0) {
				
				nums1[i] = nums[arr[i][1]];
			} else {
				
				nums1[i] = nums[arr[i][1]] - nums[arr[i][0] - 1];
			}
		}
		return nums1;
	}
	public static void main(String[] args) {
		
		int nums[] = new int[]{1,2,3,4,5};
		int arr[][] = new int[][]{{0,3},{1,2}};

		int nums1[] = new Solution().rangeSumQuery(nums, arr);
		for(int i = 0; i < nums1.length; i++) {
			
			System.out.println(nums1[i]);
		}
	}
}
