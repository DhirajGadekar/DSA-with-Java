/*
 18] Find Subarray with given sum | Set 1 (Non-negative Numbers)
	
 	Given an array arr[] of non-negative integers and an integer sum, find a subarray
	that adds to a given sum.
	Note: There may be more than one subarray with sum as the given sum, print first such subarray.

	Examples:
		Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
		Output: Sum found between indexes 2 and 4
		Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

		Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
		Output: Sum found between indexes 1 and 4
		Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

		Input: arr[] = {1, 4}, sum = 0
		Output: No subarray found
		Explanation: There is no subarray with 0 sum
 */

class Solution {
	
	int[] findSubArray(int arr[], int sum) {
		
		int nums[] = new int[]{-1, -1};
		
		for(int i = 1; i < arr.length; i++) {
			
			arr[i] = arr[i - 1] + arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i; j < arr.length; j++) {
				
				int add = 0;
				if(i == 0) {
					
					add = arr[j];
				} else {
					
					add = arr[j] - arr[i - 1];
				}
				if(add == sum) {
					
					nums[0] = i;
					nums[1] = j;
					break;
				}		
			}
		}
		return nums;
	}
	public static void main(String[] args) {
			
		int arr[] = new int[]{1, 4, 0, 0, 3, 10, 5};
		int nums[] = new Solution().findSubArray(arr, 7);
		if(nums[0] == -1 && nums[1] == -1) {
			
			System.out.println("No subarray found");
		} else {
			
			System.out.println("Sum found between indexes " + nums[0] + " and " + nums[1]);
		}
	}
}
