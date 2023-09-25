/*
Que 6 : Second Largest
	Given an array Arr of size N, print the second largest distinct element from an array.

	Example 1:
		Input:
			N=6
			Arr[] = {12, 35, 1, 10, 34, 1}
		Output: 34
		Explanation: The largest element of the array is 35 and the second largest element is 34.

	Example 2:
		Input:
			N=3
			Arr[] = {10, 5, 10}
		Output: 5
		Explanation: The largest element of the array is 10 and the second largest element is 5.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	
	Constraints:
		2 ≤ N ≤ 105
		1 ≤ Arri ≤ 105
 */

class Solution {
	
	int secondLargest(int arr[]) {
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for(int i = 0;i < arr.length; i++) {

			if(arr[i] > firstMax) {
			
				secondMax = firstMax;
				firstMax = arr[i];
			} else if(secondMax < arr[i] && firstMax != arr[i]) {
				
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		
		int arr[] = {98, 2, 3, 4, 5, 56, 23};
		System.out.println(new Solution().secondLargest(arr));
	}
}
