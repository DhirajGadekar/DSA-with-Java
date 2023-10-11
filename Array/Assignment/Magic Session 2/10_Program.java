/*
 * Problem 10
	You are given an array of size N containing integers. Your task is to find the number of
	subarrays that can be formed from the given array. A subarray is defined as a contiguous
	sequence of elements in the array.
	
	Input:
		arr = [1, 2, 3]
	Output:
		6
	Explanation:
		In this example, the possible subarrays are [1], [2], [3], [1, 2], [2, 3], 
		and [1, 2, 3], so the total count is 6.
 */

class Solution {
	
	int countSubarray(int arr[]) {
		
		return (arr.length * (arr.length + 1)) / 2;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 2, 3};
		System.out.println(new Solution().countSubarray(arr));
	}
}
