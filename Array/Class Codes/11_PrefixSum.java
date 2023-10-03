/*
 * 11] In place prefix sum
 * 	
 * 	- Given an array A of N integer
 * 	- Construct prefix sum of the array in the given array itself
 * 	- return an array of integer denoting the prefix sum of the given over
 *
 * 	Problem Constraints:
 * 	1 <= N <= 10^5
 * 	1 <= A[i] <= 10^3
 *
 */

class Solution {
	
	int[] prefixSum(int arr[], int N) {
		
		for(int i = 1; i < N; i++) {
			
			arr[i] = arr[i - 1] + arr[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3,4,5};
		arr = new Solution().prefixSum(arr, arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
