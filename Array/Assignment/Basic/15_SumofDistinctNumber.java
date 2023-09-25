/*
 15] Sum of distinct elements
	You are given an array Arr of size N. Find the sum of distinct elements in an array.

	Example 1:
		Input:
			N=5
			Arr[] = {1, 2, 3, 4, 5}
		Output: 15
		Explanation: Distinct elements are 1, 2, 3, 4, 5. So the sum is 15.
	
	Example 2:
		Input:
			N=5
			Arr[] = {5, 5, 5, 5, 5}
		Output: 5
		Explanation: Only Distinct element is 5. So the sum is 5.

	Expected Time Complexity: O(N*logN)
	Expected Auxiliary Space: O(N*logN)

	Constraints:
		1 ≤ N ≤ 10^7
		0 ≤ A[i] ≤ 10^4
 */

import java.util.*;

class Solution {
	
	int distinctElementSum(int arr[], int n) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(arr[0]);
		int sum = arr[0];

		for(int i = 1; i < n; i++) {
			
			if(!al.contains(arr[i])) {
				
				sum = sum + arr[i];
				al.add(arr[i]);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int arr[] = new int[]{5,5,5,5,5};
		System.out.println(new Solution().distinctElementSum(arr, 5));
	}
}
