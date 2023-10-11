/*
 * Problem 7
	Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the
	product of the maximum product subarray.
	
	Example 1:
		Input:
			N = 5
			Arr[] = {6, -3, -10, 0, 2}
		Output: 180
		Explanation: Subarray with maximum product
			     is [6, -3, -10] which gives the product as 180.
	Example 2:
		Input:
			N = 6
			Arr[] = {2, 3, 4, 5, -1, 0}
		Output: 120
		Explanation: Subarray with maximum product
			     is [2, 3, 4, 5] which gives the product as 120.
 */

class Solution {
	
	int productSubarray(int arr[], int N) {
		
		int maxProduct = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			
			for(int j = i; j < N; j++) {
				
				int product = 1;
				for(int k = i; k <= j; k++) {

					product = product * arr[k];
				}
				if(product > maxProduct) {
					
					maxProduct = product;
				}
			}
		}
		return maxProduct;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{6, -3, -10, 0, 2};
		System.out.println(new Solution().productSubarray(arr, arr.length));
	}
}
