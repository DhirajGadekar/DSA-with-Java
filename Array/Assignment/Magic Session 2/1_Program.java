/*
 * Problem 1:
	Given an array containing n integers. The problem is to find the sum of the
	elements of the contiguous subarray having the smallest(minimum) sum.
	Examples:
		Input : arr[] = {3, -4, 2, -3, -1, 7, -5}
		Output : -6
		Subarray is {-4, 2, -3, -1} = -6
		Input : arr = {2, 6, 8, 1, 4}
		Output : 1
 */

class Solution {
	
	int smallestSumSubarray(int arr[], int N) {
		
		for(int i = 1; i < N; i++) {
			
			arr[i] = arr[i] + arr[i - 1];
		}
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			
			for(int j = i; j < N; j++) {
				
				if(i == 0) {

					sum = arr[j];
				} else {
					
					sum = arr[j] - arr[i - 1];
				}
				if(sum < min) {

					min = sum;
				}
			}
		}
		return min;
	}
}

class Main {
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{3, -4, 2, -3, -1, 7, -5};
		System.out.println(new Solution().smallestSumSubarray(arr, arr.length));
	}
}
