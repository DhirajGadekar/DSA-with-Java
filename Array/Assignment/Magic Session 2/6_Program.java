/*
 * Problem 6
	Given an array A of n positive numbers. The task is to find the first equilibrium point in an array.
	Equilibrium point in an array is an index (or position) such that the sum of all elements before
	that index is the same as the sum of elements after it.
	Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
	Example 1:
		Input:
			n = 5
			A[] = {1,3,5,2,2}
		Output:
			3
		Explanation:
			equilibrium point is at position 3 as sum of elements before it 
			(1+3) = sum of elements after it (2+2).
	Example 2:
		Input:
			n = 1
			A[] = {1}
		Output:
			1
		Explanation:
			Since there's only one element hence it's only the equilibrium point.
	Your Task:
		The task is to complete the function equilibriumPoint() which takes the array and n as input
		parameters and returns the point of equilibrium.
	Expected Time Complexity: O(n)
	Expected Auxiliary Space: O(1)
	
	Constraints:
		1 <= n <= 105
		1 <= A[i] <= 109
 */

class Solution {
	
	int equilibriumPoint(int arr[], int N) {

		for(int i = 1; i < N; i++) {
			
			arr[i] = arr[i] + arr[i - 1];
		}
		int leftSum = 0;
		int rightSum = 0;
		for(int i = 0; i < N; i++) {
			
			if(i != 0) {
				
				leftSum = arr[i - 1];
			} 
			if(i == arr.length - 1) {
				
				rightSum = 0;
			} else {
				
				rightSum = arr[arr.length - 1] - arr[i];
			}
			if(leftSum == rightSum) {
				
				return i + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,3,5,2,2};
		System.out.println(new Solution().equilibriumPoint(arr, arr.length));
	}
}
