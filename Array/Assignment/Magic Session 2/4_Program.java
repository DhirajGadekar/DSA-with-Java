/*
 * Problem 4:
	Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray.
	whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

	Example 1:
		Input: target = 7, nums = [2,3,1,2,4,3]
		Output: 2
		Explanation: The subarray [4,3] has the minimal length under the problem constraint.
	Example 2:
		Input: target = 4, nums = [1,4,4]
		Output: 1
	Example 3:
		Input: target = 11, nums = [1,1,1,1,1,1,1,1]
		Output: 0

	Constraints:
		1 <= target <= 109
		1 <= nums.length <= 105
		1 <= nums[i] <= 104
 */

class Solution {
	
	int minimalLengthSubarray(int arr[], int target) {
		
		for(int i = 1; i < arr.length; i++) {
			
			arr[i] = arr[i] + arr[i - 1];
		}
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i; j < arr.length; j++) {

				if(i == 0) {
				
					sum = arr[j];
				} else {

					sum = arr[j] - arr[i - 1];
				}
				if(sum >= target) {
							
					int length = j - i + 1;
					if(length < minLength) {
						
						minLength = length;
					}
				}
			}
		}
		if(minLength == Integer.MAX_VALUE) {
			
			return 0;
		}
		return minLength;
	}
	public static void main(String[] args) {
		int target = 7;	
		int arr[] = new int[]{2,3,1,2,4,3};
		System.out.println(new Solution().minimalLengthSubarray(arr, target));
	}
}
