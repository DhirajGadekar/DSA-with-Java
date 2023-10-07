/*
 20] Check if pair with given Sum exists in Array (Two Sum)
	Given an array A[] of n numbers and another number x, the task is to check
	whether or not there exist two elements in A[] whose sum is exactly x.

	Examples:
		Input: arr[] = {0, -1, 2, -3, 1}, x= -2
		Output: Yes
		Explanation: If we calculate the sum of the output,1 + (-3) = -2

		Input: arr[] = {1, -2, 1, 0, 5}, x = 0
		Output: No
 */

class Solution {
	
	boolean pairSum(int arr[], int target) {

		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if((arr[i] + arr[j]) == target) {
					
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
			
		int arr[] = new int[]{0 , -1, 2, -3, 1};
		boolean ret = new Solution().pairSum(arr, -2);
		if(ret) {
			
			System.out.println("Yes");
		} else {

			System.out.println("No");
		}
	}
}
