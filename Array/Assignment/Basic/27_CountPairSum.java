/*
 27] Count pair sum
	Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements.
	Given a value Sum. The problem is to count all pairs from both arrays whose sum
	is equal to Sum.
	Note: The pair has an element from each array.
	
	Example 1:
		Input:
			M=4, N=4 , Sum = 10
			arr1[] = {1, 3, 5, 7}
			arr2[] = {2, 3, 5, 8}
		Output: 2
		Explanation: The pairs are: (5, 5) and (7, 3).

	Example 2:
		Input:
			N=4, M=4, sum=5
			arr1[] = {1, 2, 3, 4}
			arr2[] = {5, 6, 7, 8}
		Output: 0

	Expected Time Complexity: O(M+N).
	Expected Auxiliary Space: O(1).

	Constraints:
		1 ≤ M, N ≤ 10^5
 */

class Solution {
	
	int countPairSum(int arr1[], int arr2[], int M, int N, int sum) {
		
		int count = 0;
		for(int i = 0; i < M; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(arr1[i] + arr2[j] == sum) {
					
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int arr1[] = new int[]{1,3,5,7};
		int arr2[] = new int[]{2,3,5,8};

		System.out.println(new Solution().countPairSum(arr1, arr2, 4, 4, 10));
	}
}

