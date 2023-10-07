/*
 33] Multiply left and right array sum.
	Pitsy needs help with the given task by her teacher. The task is to divide an array
	into two sub-array (left and right) containing n/2 elements each and do the sum of
	the subarrays and then multiply both the subarrays.
	Note: If the length of the array is odd then the right half will contain one element
	      more than the left half.

	Example 1:
		Input : arr[ ] = {1, 2, 3, 4}
		Output : 21
		Explanation:
			Sum up an array from index 0 to 1 = 3. Sum up an array from index 2 to 3 =7. 
			Their multiplication is 21.

	Example 2:
		Input : arr[ ] = {1, 2}
		Output : 2

	Expected Time Complexity: O(N).
	Expected Auxiliary Space: O(1).
	
	Constraints:
		1 ≤ T ≤ 100
		1 ≤ N ≤ 1000
		1 ≤ A[i] ≤ 100
 */

class Solution {
	
	int leftRightSum(int arr[], int n) {
		
		n = n / 2;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(i < n) {
				
				sum1 = sum1 + arr[i]; 
			} else {
				
				sum2 = sum2 + arr[i];
			}
		}
		return (sum1 * sum2);
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 2, 3, 4};
		System.out.println(new Solution().leftRightSum(arr, arr.length));
	}
}
